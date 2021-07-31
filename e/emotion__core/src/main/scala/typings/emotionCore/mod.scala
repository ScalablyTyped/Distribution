package typings.emotionCore

import org.scalablytyped.runtime.StringDictionary
import typings.emotionCore.emotionCoreStrings.input
import typings.emotionSerialize.mod.Interpolation
import typings.emotionSerialize.mod.Keyframes
import typings.emotionUtils.mod.EmotionCache
import typings.emotionUtils.mod.SerializedStyles
import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactSVGElement
import typings.react.mod.Ref
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.Array
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.SVGElement
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@emotion/core", "CacheProvider")
  @js.native
  val CacheProvider: Provider[EmotionCache] = js.native
  
  @scala.inline
  def ClassNames[Theme](props: ClassNamesProps[Theme]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ClassNames")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @scala.inline
  def Global_[Theme](props: GlobalProps[Theme]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Global")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@emotion/core", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.Object] = js.native
  
  @scala.inline
  def css(args: Interpolation[Unit]*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[js.Any]).asInstanceOf[SerializedStyles]
  @scala.inline
  def css(template: TemplateStringsArray, args: Interpolation[Unit]*): SerializedStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(template.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SerializedStyles]
  
  @scala.inline
  def jsx(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  @scala.inline
  def jsx(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  @scala.inline
  def jsx(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  @scala.inline
  def jsx[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def jsx[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def jsx[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  @scala.inline
  def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  @scala.inline
  def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Unit,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  @scala.inline
  def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  @scala.inline
  def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  @scala.inline
  def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  @scala.inline
  def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  @scala.inline
  def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  @scala.inline
  def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Unit,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  @scala.inline
  def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  @scala.inline
  def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  @scala.inline
  def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  
  @scala.inline
  def jsx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  @scala.inline
  def jsx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  @scala.inline
  def jsx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  
  @scala.inline
  def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  @scala.inline
  def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  @scala.inline
  def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Unit,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  
  @scala.inline
  def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  @scala.inline
  def keyframes(args: Interpolation[Unit]*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(args.asInstanceOf[js.Any]).asInstanceOf[Keyframes]
  @scala.inline
  def keyframes(template: TemplateStringsArray, args: Interpolation[Unit]*): Keyframes = (^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(template.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Keyframes]
  
  @scala.inline
  def withEmotionCache[Props, RefType](
    func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref[RefType], ReactNode]
  ): SFC[Props & ClassAttributes[RefType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withEmotionCache")(func.asInstanceOf[js.Any]).asInstanceOf[SFC[Props & ClassAttributes[RefType]]]
  
  @js.native
  trait ArrayClassNamesArg
    extends StObject
       with Array[ClassNamesArg]
  
  type ClassNamesArg = js.UndefOr[
    Null | String | Boolean | (StringDictionary[js.UndefOr[Boolean | Null]]) | ArrayClassNamesArg
  ]
  
  @js.native
  trait ClassNamesContent[Theme] extends StObject {
    
    def css(args: Interpolation[Unit]*): String = js.native
    def css(template: TemplateStringsArray, args: Interpolation[Unit]*): String = js.native
    
    def cx(args: ClassNamesArg*): String = js.native
    
    var theme: Theme = js.native
  }
  
  trait ClassNamesProps[Theme] extends StObject {
    
    def children(content: ClassNamesContent[Theme]): ReactNode
  }
  object ClassNamesProps {
    
    @scala.inline
    def apply[Theme](children: ClassNamesContent[Theme] => ReactNode): ClassNamesProps[Theme] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ClassNamesProps[Theme]]
    }
    
    @scala.inline
    implicit class ClassNamesPropsMutableBuilder[Self <: ClassNamesProps[?], Theme] (val x: Self & ClassNamesProps[Theme]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ClassNamesContent[Theme] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait GlobalProps[Theme] extends StObject {
    
    var styles: InterpolationWithTheme[Theme]
  }
  object GlobalProps {
    
    @scala.inline
    def apply[Theme](): GlobalProps[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalProps[Theme]]
    }
    
    @scala.inline
    implicit class GlobalPropsMutableBuilder[Self <: GlobalProps[?], Theme] (val x: Self & GlobalProps[Theme]) extends AnyVal {
      
      @scala.inline
      def setStyles(value: InterpolationWithTheme[Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: Theme => Interpolation[Unit]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesNull: Self = StObject.set(x, "styles", null)
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type InterpolationWithTheme[Theme] = Interpolation[Unit] | (js.Function1[/* theme */ Theme, Interpolation[Unit]])
  
  object global {
    
    object JSX {
      
      /**
        * Do we need to modify `LibraryManagedAttributes` too,
        * to make `className` props optional when `css` props is specified?
        */
      trait IntrinsicAttributes extends StObject {
        
        var css: js.UndefOr[InterpolationWithTheme[js.Any]] = js.undefined
      }
      object IntrinsicAttributes {
        
        @scala.inline
        def apply(): IntrinsicAttributes = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IntrinsicAttributes]
        }
        
        @scala.inline
        implicit class IntrinsicAttributesMutableBuilder[Self <: IntrinsicAttributes] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCss(value: InterpolationWithTheme[js.Any]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCssFunction1(value: js.Any => Interpolation[Unit]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
          
          @scala.inline
          def setCssNull: Self = StObject.set(x, "css", null)
          
          @scala.inline
          def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        }
      }
    }
  }
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait DOMAttributes[T] extends StObject {
      
      var css: js.UndefOr[InterpolationWithTheme[js.Any]] = js.undefined
    }
    object DOMAttributes {
      
      @scala.inline
      def apply[T](): typings.emotionCore.mod.reactAugmentingMod.DOMAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.emotionCore.mod.reactAugmentingMod.DOMAttributes[T]]
      }
      
      @scala.inline
      implicit class DOMAttributesMutableBuilder[Self <: typings.emotionCore.mod.reactAugmentingMod.DOMAttributes[?], T] (val x: Self & typings.emotionCore.mod.reactAugmentingMod.DOMAttributes[T]) extends AnyVal {
        
        @scala.inline
        def setCss(value: InterpolationWithTheme[js.Any]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCssFunction1(value: js.Any => Interpolation[Unit]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCssNull: Self = StObject.set(x, "css", null)
        
        @scala.inline
        def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      }
    }
  }
}
