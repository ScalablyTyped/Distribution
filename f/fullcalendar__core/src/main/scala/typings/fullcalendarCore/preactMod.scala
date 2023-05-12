package typings.fullcalendarCore

import typings.fullcalendarCore.fullcalendarCoreStrings.input
import typings.preact.mod.Attributes
import typings.preact.mod.ClassAttributes
import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.preact.mod.ComponentType
import typings.preact.mod.ContainerNode
import typings.preact.mod.Context
import typings.preact.mod.FunctionComponent
import typings.preact.mod.Options_
import typings.preact.mod.RefObject
import typings.preact.mod.VNode
import typings.preact.srcJsxMod.JSXInternal.DOMAttributes
import typings.preact.srcJsxMod.JSXInternal.HTMLAttributes
import typings.preact.srcJsxMod.JSXInternal.SVGAttributes
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.SVGElement
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preactMod {
  
  @JSImport("@fullcalendar/core/preact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@fullcalendar/core/preact", "Component")
  @js.native
  open class Component[P, S] ()
    extends typings.preact.mod.Component[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
  }
  /* static members */
  object Component {
    
    @JSImport("@fullcalendar/core/preact", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fullcalendar/core/preact", "Component.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@fullcalendar/core/preact", "Component.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Any] = js.native
    inline def defaultProps_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@fullcalendar/core/preact", "Component.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@fullcalendar/core/preact", "Component.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError: js.UndefOr[js.Function1[/* error */ Any, js.Object | Null]] = js.native
    inline def getDerivedStateFromError_=(x: js.UndefOr[js.Function1[/* error */ Any, js.Object | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
    
    // Static members cannot reference class type parameters. This is not
    // supported in TypeScript. Reusing the same type arguments from `Component`
    // will lead to an impossible state where one cannot satisfy the type
    // constraint under no circumstances, see #1356.In general type arguments
    // seem to be a bit buggy and not supported well at the time of this
    // writing with TS 3.3.3333.
    @JSImport("@fullcalendar/core/preact", "Component.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ js.Object, js.Object | Null]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ js.Object, js.Object | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@fullcalendar/core/preact", "Fragment")
  @js.native
  val Fragment: FunctionComponent[js.Object] = js.native
  
  inline def cloneElement(vnode: VNode[Any], props: Any, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def cloneElement(vnode: VNode[Any], props: Unit, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  
  inline def cloneElement_P[P](vnode: VNode[P], props: Any, children: ComponentChildren*): VNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[P]]
  inline def cloneElement_P[P](vnode: VNode[P], props: Unit, children: ComponentChildren*): VNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[P]]
  
  inline def createContext[T](defaultValue: T): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
  
  inline def createElement(
    `type`: input,
    props: DOMAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
    children: ComponentChildren*
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def createElement(`type`: input, props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def createElement[T /* <: HTMLElement */](
    `type`: String,
    props: ClassAttributes[T] & HTMLAttributes[EventTarget] & SVGAttributes[SVGElement],
    children: ComponentChildren*
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def createElement[T /* <: HTMLElement */](`type`: String, props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def createElement[P](`type`: ComponentType[P], props: Attributes & P, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def createElement[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 174, starting with typings.fullcalendarCore.fullcalendarCoreStrings.a, typings.fullcalendarCore.fullcalendarCoreStrings.abbr, typings.fullcalendarCore.fullcalendarCoreStrings.address */ Any,
    props: ClassAttributes[T] & P,
    children: ComponentChildren*
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 174, starting with typings.fullcalendarCore.fullcalendarCoreStrings.a, typings.fullcalendarCore.fullcalendarCoreStrings.abbr, typings.fullcalendarCore.fullcalendarCoreStrings.address */ Any,
    props: Null,
    children: ComponentChildren*
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  
  inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]
  
  inline def flushSync(runBeforeFlush: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(runBeforeFlush.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def h(
    `type`: input,
    props: DOMAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
    children: ComponentChildren*
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def h(`type`: input, props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def h[T /* <: HTMLElement */](
    `type`: String,
    props: ClassAttributes[T] & HTMLAttributes[EventTarget] & SVGAttributes[SVGElement],
    children: ComponentChildren*
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def h[T /* <: HTMLElement */](`type`: String, props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def h[P](`type`: ComponentType[P], props: Attributes & P, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def h[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def h[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 174, starting with typings.fullcalendarCore.fullcalendarCoreStrings.a, typings.fullcalendarCore.fullcalendarCoreStrings.abbr, typings.fullcalendarCore.fullcalendarCoreStrings.address */ Any,
    props: ClassAttributes[T] & P,
    children: ComponentChildren*
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  inline def h[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 174, starting with typings.fullcalendarCore.fullcalendarCoreStrings.a, typings.fullcalendarCore.fullcalendarCoreStrings.abbr, typings.fullcalendarCore.fullcalendarCoreStrings.address */ Any,
    props: Null,
    children: ComponentChildren*
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
  
  inline def hydrate(vnode: ComponentChild, parent: ContainerNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isValidElement(vnode: Any): /* is preact.preact.VNode<{}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(vnode.asInstanceOf[js.Any]).asInstanceOf[/* is preact.preact.VNode<{}> */ Boolean]
  
  @JSImport("@fullcalendar/core/preact", "options")
  @js.native
  val options: Options_ = js.native
  
  inline def render(vnode: ComponentChild, parent: ContainerNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def render(vnode: ComponentChild, parent: ContainerNode, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def render(vnode: ComponentChild, parent: ContainerNode, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toChildArray(children: ComponentChildren): js.Array[VNode[js.Object] | String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toChildArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[VNode[js.Object] | String | Double]]
}
