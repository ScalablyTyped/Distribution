package typings.react

import org.scalablytyped.runtime.{Instantiable1, Instantiable2}
import typings.react.reactMod._
import typings.std.^.{Object, console}
import typings.{react, std}

import scala.language.{higherKinds, implicitConversions}
import scala.scalajs.js.|
import scala.scalajs.{LinkingInfo, js}

object dsl {

  object define {
    /* define a functional component */
    def fc[P](f: js.Function1[P with Anon_Children, ReactNode]): FC[P] =
      f.asInstanceOf[FC[P]]
  }

  @inline implicit def fromExoticComponent[P](
      _ctor: ExoticComponent[P]): BuildComponent[P] =
    dsl.c(_ctor.asInstanceOf[FC[P]])

  @inline implicit def fromComponentClass[P](
      _ctor: ComponentClass[P, _]): BuildComponent[P] = dsl.c(_ctor)

  @inline implicit def fromInstantiable1[P](
      _ctor: Instantiable1[P, ReactElement]): BuildComponent[P] =
    dsl.c(_ctor)

  @inline implicit def fromInstantiable2[P](
      _ctor: Instantiable2[P, _, ReactElement]): BuildComponent[P] =
    dsl.c(_ctor)

  @inline implicit def fromComponentType[P](
      _ctor: ComponentType[P]): BuildComponent[P] =
    c(_ctor.asInstanceOf[ComponentClass[P, _]])

  @inline implicit def fromFc[P](
      _ctor: FunctionComponent[P]): BuildComponent[P] = dsl.c(_ctor)

  @inline final class BuildIntrinsic[P[e] <: DOMAttributes[e], E](
      tpe: String,
      _key: js.UndefOr[Key] = js.undefined,
      _ref: js.UndefOr[Ref[E]] = js.undefined
  ) {

    @inline def withKey(newKey: Key): BuildIntrinsic[P, E] =
      new BuildIntrinsic[P, E](tpe, newKey, _ref)

    @inline def withRef(newRef: Ref[E]): BuildIntrinsic[P, E] =
      new BuildIntrinsic[P, E](tpe, _key, newRef)

    @inline protected def fullProps(props: P[E]): ClassAttributes[E] with P[E] =
      Object.assign[ClassAttributes[E], P[E]](
        new ClassAttributes[E] {
          key = _key
          ref = _ref
        },
        props,
      )

    @inline def noprops(children: ReactNode*): ReactElement =
      ^.createElement[P[E], E](tpe, fullProps(null.asInstanceOf[P[E]]), children: _*)

    @inline def props(props: P[E], children: ReactNode*): ReactElement =
      ^.createElement[P[E], E](tpe, fullProps(props), children: _*)
  }

  lazy val a =
    new BuildIntrinsic[AnchorHTMLAttributes, std.HTMLAnchorElement]("a")
  lazy val abbr = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("abbr")
  lazy val address =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("address")
  lazy val animate =
    new BuildIntrinsic[SVGAttributes, std.SVGElement]("animate")
  lazy val animateTransform =
    new BuildIntrinsic[SVGAttributes, std.SVGElement]("animateTransform")
  lazy val area =
    new BuildIntrinsic[AreaHTMLAttributes, std.HTMLAreaElement]("area")
  lazy val article =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("article")
  lazy val aside =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("aside")
  lazy val audio =
    new BuildIntrinsic[AudioHTMLAttributes, std.HTMLAudioElement]("audio")
  lazy val b = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("b")
  lazy val base =
    new BuildIntrinsic[BaseHTMLAttributes, std.HTMLBaseElement]("base")
  lazy val bdi = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("bdi")
  lazy val bdo = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("bdo")
  lazy val big = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("big")
  lazy val blockquote =
    new BuildIntrinsic[BlockquoteHTMLAttributes, std.HTMLElement](
      "blockquote")
  lazy val body =
    new BuildIntrinsic[HTMLAttributes, std.HTMLBodyElement]("body")
  lazy val br = new BuildIntrinsic[HTMLAttributes, std.HTMLBRElement]("br")
  lazy val button =
    new BuildIntrinsic[ButtonHTMLAttributes, std.HTMLButtonElement]("button")
  lazy val canvas =
    new BuildIntrinsic[CanvasHTMLAttributes, std.HTMLCanvasElement]("canvas")
  lazy val caption =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("caption")
  lazy val circle =
    new BuildIntrinsic[SVGAttributes, std.SVGCircleElement]("circle")
  lazy val cite = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("cite")
  lazy val clipPath =
    new BuildIntrinsic[SVGAttributes, std.SVGClipPathElement]("clipPath")
  lazy val code = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("code")
  lazy val col =
    new BuildIntrinsic[ColHTMLAttributes, std.HTMLTableColElement]("col")
  lazy val colgroup =
    new BuildIntrinsic[ColgroupHTMLAttributes, std.HTMLTableColElement](
      "colgroup")
  lazy val data = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("data")
  lazy val datalist =
    new BuildIntrinsic[HTMLAttributes, std.HTMLDataListElement]("datalist")
  lazy val dd = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("dd")
  lazy val defs =
    new BuildIntrinsic[SVGAttributes, std.SVGDefsElement]("defs")
  lazy val del =
    new BuildIntrinsic[DelHTMLAttributes, std.HTMLElement]("del")
  lazy val desc =
    new BuildIntrinsic[SVGAttributes, std.SVGDescElement]("desc")
  lazy val details =
    new BuildIntrinsic[DetailsHTMLAttributes, std.HTMLElement]("details")
  lazy val dfn = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("dfn")
  lazy val dialog =
    new BuildIntrinsic[DialogHTMLAttributes, std.HTMLDialogElement]("dialog")
  lazy val div =
    new BuildIntrinsic[HTMLAttributes, std.HTMLDivElement]("div")
  lazy val dl =
    new BuildIntrinsic[HTMLAttributes, std.HTMLDListElement]("dl")
  lazy val dt = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("dt")
  lazy val ellipse =
    new BuildIntrinsic[SVGAttributes, std.SVGEllipseElement]("ellipse")
  lazy val em = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("em")
  lazy val embed =
    new BuildIntrinsic[EmbedHTMLAttributes, std.HTMLEmbedElement]("embed")
  lazy val feBlend =
    new BuildIntrinsic[SVGAttributes, std.SVGFEBlendElement]("feBlend")
  lazy val feColorMatrix =
    new BuildIntrinsic[SVGAttributes, std.SVGFEColorMatrixElement](
      "feColorMatrix")
  lazy val feComponentTransfer =
    new BuildIntrinsic[SVGAttributes, std.SVGFEComponentTransferElement](
      "feComponentTransfer")
  lazy val feComposite =
    new BuildIntrinsic[SVGAttributes, std.SVGFECompositeElement](
      "feComposite")
  lazy val feConvolveMatrix =
    new BuildIntrinsic[SVGAttributes, std.SVGFEConvolveMatrixElement](
      "feConvolveMatrix")
  lazy val feDiffuseLighting =
    new BuildIntrinsic[SVGAttributes, std.SVGFEDiffuseLightingElement](
      "feDiffuseLighting")
  lazy val feDisplacementMap =
    new BuildIntrinsic[SVGAttributes, std.SVGFEDisplacementMapElement](
      "feDisplacementMap")
  lazy val feDistantLight =
    new BuildIntrinsic[SVGAttributes, std.SVGFEDistantLightElement](
      "feDistantLight")
  lazy val feFlood =
    new BuildIntrinsic[SVGAttributes, std.SVGFEFloodElement]("feFlood")
  lazy val feFuncA =
    new BuildIntrinsic[SVGAttributes, std.SVGFEFuncAElement]("feFuncA")
  lazy val feFuncB =
    new BuildIntrinsic[SVGAttributes, std.SVGFEFuncBElement]("feFuncB")
  lazy val feFuncG =
    new BuildIntrinsic[SVGAttributes, std.SVGFEFuncGElement]("feFuncG")
  lazy val feFuncR =
    new BuildIntrinsic[SVGAttributes, std.SVGFEFuncRElement]("feFuncR")
  lazy val feGaussianBlur =
    new BuildIntrinsic[SVGAttributes, std.SVGFEGaussianBlurElement](
      "feGaussianBlur")
  lazy val feImage =
    new BuildIntrinsic[SVGAttributes, std.SVGFEImageElement]("feImage")
  lazy val feMerge =
    new BuildIntrinsic[SVGAttributes, std.SVGFEMergeElement]("feMerge")
  lazy val feMergeNode =
    new BuildIntrinsic[SVGAttributes, std.SVGFEMergeNodeElement](
      "feMergeNode")
  lazy val feMorphology =
    new BuildIntrinsic[SVGAttributes, std.SVGFEMorphologyElement](
      "feMorphology")
  lazy val feOffset =
    new BuildIntrinsic[SVGAttributes, std.SVGFEOffsetElement]("feOffset")
  lazy val fePointLight =
    new BuildIntrinsic[SVGAttributes, std.SVGFEPointLightElement](
      "fePointLight")
  lazy val feSpecularLighting =
    new BuildIntrinsic[SVGAttributes, std.SVGFESpecularLightingElement](
      "feSpecularLighting")
  lazy val feSpotLight =
    new BuildIntrinsic[SVGAttributes, std.SVGFESpotLightElement](
      "feSpotLight")
  lazy val feTile =
    new BuildIntrinsic[SVGAttributes, std.SVGFETileElement]("feTile")
  lazy val feTurbulence =
    new BuildIntrinsic[SVGAttributes, std.SVGFETurbulenceElement](
      "feTurbulence")
  lazy val fieldset =
    new BuildIntrinsic[FieldsetHTMLAttributes, std.HTMLFieldSetElement](
      "fieldset")
  lazy val figcaption =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("figcaption")
  lazy val figure =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("figure")
  lazy val filter =
    new BuildIntrinsic[SVGAttributes, std.SVGFilterElement]("filter")
  lazy val footer =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("footer")
  lazy val foreignObject =
    new BuildIntrinsic[SVGAttributes, std.SVGForeignObjectElement](
      "foreignObject")
  lazy val form =
    new BuildIntrinsic[FormHTMLAttributes, std.HTMLFormElement]("form")
  lazy val g = new BuildIntrinsic[SVGAttributes, std.SVGGElement]("g")
  lazy val h1 =
    new BuildIntrinsic[HTMLAttributes, std.HTMLHeadingElement]("h1")
  lazy val h2 =
    new BuildIntrinsic[HTMLAttributes, std.HTMLHeadingElement]("h2")
  lazy val h3 =
    new BuildIntrinsic[HTMLAttributes, std.HTMLHeadingElement]("h3")
  lazy val h4 =
    new BuildIntrinsic[HTMLAttributes, std.HTMLHeadingElement]("h4")
  lazy val h5 =
    new BuildIntrinsic[HTMLAttributes, std.HTMLHeadingElement]("h5")
  lazy val h6 =
    new BuildIntrinsic[HTMLAttributes, std.HTMLHeadingElement]("h6")
  lazy val head =
    new BuildIntrinsic[HTMLAttributes, std.HTMLHeadElement]("head")
  lazy val header =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("header")
  lazy val hgroup =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("hgroup")
  lazy val hr = new BuildIntrinsic[HTMLAttributes, std.HTMLHRElement]("hr")
  lazy val html =
    new BuildIntrinsic[HtmlHTMLAttributes, std.HTMLHtmlElement]("html")
  lazy val i = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("i")
  lazy val iframe =
    new BuildIntrinsic[IframeHTMLAttributes, std.HTMLIFrameElement]("iframe")
  lazy val image =
    new BuildIntrinsic[SVGAttributes, std.SVGImageElement]("image")
  lazy val img =
    new BuildIntrinsic[ImgHTMLAttributes, std.HTMLImageElement]("img")
  lazy val input =
    new BuildIntrinsic[InputHTMLAttributes, std.HTMLInputElement]("input")
  lazy val ins =
    new BuildIntrinsic[InsHTMLAttributes, std.HTMLModElement]("ins")
  lazy val kbd = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("kbd")
  lazy val keygen =
    new BuildIntrinsic[KeygenHTMLAttributes, std.HTMLElement]("keygen")
  lazy val label =
    new BuildIntrinsic[LabelHTMLAttributes, std.HTMLLabelElement]("label")
  lazy val legend =
    new BuildIntrinsic[HTMLAttributes, std.HTMLLegendElement]("legend")
  lazy val li = new BuildIntrinsic[LiHTMLAttributes, std.HTMLLIElement]("li")
  lazy val line =
    new BuildIntrinsic[SVGAttributes, std.SVGLineElement]("line")
  lazy val linearGradient =
    new BuildIntrinsic[SVGAttributes, std.SVGLinearGradientElement](
      "linearGradient")
  lazy val link =
    new BuildIntrinsic[LinkHTMLAttributes, std.HTMLLinkElement]("link")
  lazy val main = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("main")
  lazy val map =
    new BuildIntrinsic[MapHTMLAttributes, std.HTMLMapElement]("map")
  lazy val mark = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("mark")
  lazy val marker =
    new BuildIntrinsic[SVGAttributes, std.SVGMarkerElement]("marker")
  lazy val mask =
    new BuildIntrinsic[SVGAttributes, std.SVGMaskElement]("mask")
  lazy val menu =
    new BuildIntrinsic[MenuHTMLAttributes, std.HTMLElement]("menu")
  lazy val menuitem =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("menuitem")
  lazy val meta =
    new BuildIntrinsic[MetaHTMLAttributes, std.HTMLMetaElement]("meta")
  lazy val metadata =
    new BuildIntrinsic[SVGAttributes, std.SVGMetadataElement]("metadata")
  lazy val meter =
    new BuildIntrinsic[MeterHTMLAttributes, std.HTMLElement]("meter")
  lazy val nav = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("nav")
  lazy val noindex =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("noindex")
  lazy val noscript =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("noscript")
  lazy val `object` =
    new BuildIntrinsic[ObjectHTMLAttributes, std.HTMLObjectElement]("object")
  lazy val ol =
    new BuildIntrinsic[OlHTMLAttributes, std.HTMLOListElement]("ol")
  lazy val optgroup =
    new BuildIntrinsic[OptgroupHTMLAttributes, std.HTMLOptGroupElement](
      "optgroup")
  lazy val option =
    new BuildIntrinsic[OptionHTMLAttributes, std.HTMLOptionElement]("option")
  lazy val output =
    new BuildIntrinsic[OutputHTMLAttributes, std.HTMLElement]("output")
  lazy val p =
    new BuildIntrinsic[HTMLAttributes, std.HTMLParagraphElement]("p")
  lazy val param =
    new BuildIntrinsic[ParamHTMLAttributes, std.HTMLParamElement]("param")
  lazy val path =
    new BuildIntrinsic[SVGAttributes, std.SVGPathElement]("path")
  lazy val pattern =
    new BuildIntrinsic[SVGAttributes, std.SVGPatternElement]("pattern")
  lazy val picture =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("picture")
  lazy val polygon =
    new BuildIntrinsic[SVGAttributes, std.SVGPolygonElement]("polygon")
  lazy val polyline =
    new BuildIntrinsic[SVGAttributes, std.SVGPolylineElement]("polyline")
  lazy val pre =
    new BuildIntrinsic[HTMLAttributes, std.HTMLPreElement]("pre")
  lazy val progress =
    new BuildIntrinsic[ProgressHTMLAttributes, std.HTMLProgressElement](
      "progress")
  lazy val q =
    new BuildIntrinsic[QuoteHTMLAttributes, std.HTMLQuoteElement]("q")
  lazy val radialGradient =
    new BuildIntrinsic[SVGAttributes, std.SVGRadialGradientElement](
      "radialGradient")
  lazy val rect =
    new BuildIntrinsic[SVGAttributes, std.SVGRectElement]("rect")
  lazy val rp = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("rp")
  lazy val rt = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("rt")
  lazy val ruby = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("ruby")
  lazy val s = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("s")
  lazy val samp = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("samp")
  lazy val script =
    new BuildIntrinsic[ScriptHTMLAttributes, std.HTMLScriptElement]("script")
  lazy val section =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("section")
  lazy val select =
    new BuildIntrinsic[SelectHTMLAttributes, std.HTMLSelectElement]("select")
  lazy val small =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("small")
  lazy val source =
    new BuildIntrinsic[SourceHTMLAttributes, std.HTMLSourceElement]("source")
  lazy val span =
    new BuildIntrinsic[HTMLAttributes, std.HTMLSpanElement]("span")
  lazy val stop =
    new BuildIntrinsic[SVGAttributes, std.SVGStopElement]("stop")
  lazy val strong =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("strong")
  lazy val style =
    new BuildIntrinsic[StyleHTMLAttributes, std.HTMLStyleElement]("style")
  lazy val sub = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("sub")
  lazy val summary =
    new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("summary")
  lazy val sup = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("sup")
  lazy val svg = new BuildIntrinsic[SVGAttributes, std.SVGSVGElement]("svg")
  lazy val switch =
    new BuildIntrinsic[SVGAttributes, std.SVGSwitchElement]("switch")
  lazy val symbol =
    new BuildIntrinsic[SVGAttributes, std.SVGSymbolElement]("symbol")
  lazy val table =
    new BuildIntrinsic[TableHTMLAttributes, std.HTMLTableElement]("table")
  lazy val tbody =
    new BuildIntrinsic[HTMLAttributes, std.HTMLTableSectionElement]("tbody")
  lazy val td =
    new BuildIntrinsic[TdHTMLAttributes, std.HTMLTableDataCellElement]("td")
  lazy val text =
    new BuildIntrinsic[SVGAttributes, std.SVGTextElement]("text")
  lazy val textPath =
    new BuildIntrinsic[SVGAttributes, std.SVGTextPathElement]("textPath")
  lazy val textarea =
    new BuildIntrinsic[TextareaHTMLAttributes, std.HTMLTextAreaElement](
      "textarea")
  lazy val tfoot =
    new BuildIntrinsic[HTMLAttributes, std.HTMLTableSectionElement]("tfoot")
  lazy val th =
    new BuildIntrinsic[ThHTMLAttributes, std.HTMLTableHeaderCellElement](
      "th")
  lazy val thead =
    new BuildIntrinsic[HTMLAttributes, std.HTMLTableSectionElement]("thead")
  lazy val time =
    new BuildIntrinsic[TimeHTMLAttributes, std.HTMLElement]("time")
  lazy val title =
    new BuildIntrinsic[HTMLAttributes, std.HTMLTitleElement]("title")
  lazy val tr =
    new BuildIntrinsic[HTMLAttributes, std.HTMLTableRowElement]("tr")
  lazy val track =
    new BuildIntrinsic[TrackHTMLAttributes, std.HTMLTrackElement]("track")
  lazy val tspan =
    new BuildIntrinsic[SVGAttributes, std.SVGTSpanElement]("tspan")
  lazy val u = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("u")
  lazy val ul =
    new BuildIntrinsic[HTMLAttributes, std.HTMLUListElement]("ul")
  lazy val use = new BuildIntrinsic[SVGAttributes, std.SVGUseElement]("use")
  lazy val `var` = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("var")
  lazy val video =
    new BuildIntrinsic[VideoHTMLAttributes, std.HTMLVideoElement]("video")
  lazy val view =
    new BuildIntrinsic[SVGAttributes, std.SVGViewElement]("view")
  lazy val wbr = new BuildIntrinsic[HTMLAttributes, std.HTMLElement]("wbr")
  lazy val webview =
    new BuildIntrinsic[WebViewHTMLAttributes, react.HTMLWebViewElement](
      "webview")

  /**
    * ```scala
    * // component you want to use
    * class Foo extends React.Component[FooProps, ...]{...}
    *
    * // usage
    * dsl.cls[Foo].props(new FooProps{}, "child1", 2)
    * ```
    */
  @inline def cls[C <: Component[_, _, _]](
      implicit C: js.ConstructorTag[C]): InferProps[C] =
    C.constructor.asInstanceOf[InferProps[C]]

  @inline def c[P](_ctor: ComponentClass[P, _]): BuildComponent[P] =
    new BuildComponent[P](_ctor.asInstanceOf[ComponentClass[P, ComponentState]],
                          js.undefined,
                          js.undefined)

  @inline def c[P](
      _ctor: Instantiable1[P, ReactElement]): BuildComponent[P] =
    new BuildComponent[P](_ctor.asInstanceOf[ComponentClass[P, ComponentState]],
                          js.undefined,
                          js.undefined)

  @inline def c[P](
      _ctor: Instantiable2[P, _, ReactElement]): BuildComponent[P] =
    new BuildComponent[P](_ctor.asInstanceOf[ComponentClass[P, ComponentState]],
                          js.undefined,
                          js.undefined)

  // dodgy cast inside here, but I don't think it matters. let's see
  @inline def c[P](_ctor: FunctionComponent[P]): BuildComponent[P] =
    new BuildComponent[P](_ctor.asInstanceOf[ComponentClass[P, ComponentState]],
                          js.undefined,
                          js.undefined)

  @js.native
  trait InferProps[+C <: Component[_, _, _]] extends js.Object

  object InferProps {
    @inline implicit def builder[P](
        ctor: InferProps[Component[P, _, _]]): BuildComponent[P] =
      new BuildComponent[P](
        ctor.asInstanceOf[ComponentClass[P, ComponentState]])
  }

  /* we're having some instability with createElement and overloads, so just inline it for now*/
  @js.native
  sealed trait Hack extends js.Object {
    def createElement[P /* <: js.Object */ ](
        `type`: ComponentClass[P, ComponentState],
        props: Attributes with P,
        children: ReactNode*): ReactElement = js.native
  }

  @inline final class BuildComponent[P] private[dsl] (
      ctor: ComponentClass[P, ComponentState],
      _key: js.UndefOr[Key] = js.undefined,
      _ref: js.UndefOr[Ref[Component[P, ComponentState, _]]] = js.undefined) {

    @inline def withKey(newKey: Key): BuildComponent[P] =
      new BuildComponent(ctor, newKey, _ref)

    @inline def withRef(
        newRef: Ref[Component[P, ComponentState, _]]): BuildComponent[P] =
      new BuildComponent(ctor, _key, newRef)

    @inline protected def fullProps(props: P)
      : ClassAttributes[Component[P, ComponentState, _]] with P =
      Object.assign[ClassAttributes[Component[P, ComponentState, _]], P](
        new ClassAttributes[Component[P, ComponentState, _]] {
          key = _key
          ref = _ref.map(r => r: LegacyRef[Component[P, ComponentState, _]])
        },
        props,
      )

    @inline def props(props: P, children: ReactNode*): ReactElement = {
      if (LinkingInfo.developmentMode && js.isUndefined(ctor))
        console.warn("Component was undefined",
                     props.asInstanceOf[js.Any],
                     _key.asInstanceOf[js.Any],
                     _ref.asInstanceOf[js.Any],
                     children)

      ^.asInstanceOf[Hack].createElement(ctor, fullProps(props), children: _*)
    }

    @inline def noprops(children: ReactNode*): ReactElement = {
      if (LinkingInfo.developmentMode && js.isUndefined(ctor))
        console.warn("Component was undefined",
                     _key.asInstanceOf[js.Any],
                     _ref.asInstanceOf[js.Any],
                     children)

      ^.asInstanceOf[Hack].createElement(ctor, fullProps(null.asInstanceOf[P]), children: _*)
    }
  }

}
