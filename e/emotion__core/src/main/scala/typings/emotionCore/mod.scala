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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/core", "CacheProvider")
  @js.native
  val CacheProvider: Provider[EmotionCache] = js.native
  
  @JSImport("@emotion/core", "ClassNames")
  @js.native
  def ClassNames[Theme](props: ClassNamesProps[Theme]): ReactElement = js.native
  
  @JSImport("@emotion/core", "Global")
  @js.native
  def Global_[Theme](props: GlobalProps[Theme]): ReactElement = js.native
  
  @JSImport("@emotion/core", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.Object] = js.native
  
  @JSImport("@emotion/core", "css")
  @js.native
  def css(args: Interpolation[js.UndefOr[scala.Nothing]]*): SerializedStyles = js.native
  @JSImport("@emotion/core", "css")
  @js.native
  def css(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): SerializedStyles = js.native
  
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx(`type`: input, props: js.UndefOr[scala.Nothing], children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactNode*): ReactElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: ReactNode*): ReactElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): ReactSVGElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): ReactSVGElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactNode*): CElement[P, T] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): DOMElement[P, T] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): ReactElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  @JSImport("@emotion/core", "jsx")
  @js.native
  def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = js.native
  
  @JSImport("@emotion/core", "keyframes")
  @js.native
  def keyframes(args: Interpolation[js.UndefOr[scala.Nothing]]*): Keyframes = js.native
  @JSImport("@emotion/core", "keyframes")
  @js.native
  def keyframes(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): Keyframes = js.native
  
  @JSImport("@emotion/core", "withEmotionCache")
  @js.native
  def withEmotionCache[Props, RefType](
    func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref[RefType], ReactNode]
  ): SFC[Props with ClassAttributes[RefType]] = js.native
  
  @js.native
  trait ArrayClassNamesArg extends Array[ClassNamesArg]
  
  type ClassNamesArg = js.UndefOr[
    Null | String | Boolean | (StringDictionary[js.UndefOr[Boolean | Null]]) | ArrayClassNamesArg
  ]
  
  @js.native
  trait ClassNamesContent[Theme] extends StObject {
    
    def css(args: Interpolation[js.UndefOr[scala.Nothing]]*): String = js.native
    def css(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): String = js.native
    
    def cx(args: ClassNamesArg*): String = js.native
    
    var theme: Theme = js.native
  }
  
  @js.native
  trait ClassNamesProps[Theme] extends StObject {
    
    def children(content: ClassNamesContent[Theme]): ReactNode = js.native
  }
  object ClassNamesProps {
    
    @scala.inline
    def apply[Theme](children: ClassNamesContent[Theme] => ReactNode): ClassNamesProps[Theme] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ClassNamesProps[Theme]]
    }
    
    @scala.inline
    implicit class ClassNamesPropsMutableBuilder[Self <: ClassNamesProps[_], Theme] (val x: Self with ClassNamesProps[Theme]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ClassNamesContent[Theme] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GlobalProps[Theme] extends StObject {
    
    var styles: InterpolationWithTheme[Theme] = js.native
  }
  object GlobalProps {
    
    @scala.inline
    def apply[Theme](): GlobalProps[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalProps[Theme]]
    }
    
    @scala.inline
    implicit class GlobalPropsMutableBuilder[Self <: GlobalProps[_], Theme] (val x: Self with GlobalProps[Theme]) extends AnyVal {
      
      @scala.inline
      def setStyles(value: InterpolationWithTheme[Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: Theme => Interpolation[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesNull: Self = StObject.set(x, "styles", null)
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type InterpolationWithTheme[Theme] = Interpolation[js.UndefOr[scala.Nothing]] | (js.Function1[/* theme */ Theme, Interpolation[js.UndefOr[scala.Nothing]]])
  
  object global {
    
    object JSX {
      
      /**
        * Do we need to modify `LibraryManagedAttributes` too,
        * to make `className` props optional when `css` props is specified?
        */
      @js.native
      trait IntrinsicAttributes extends StObject {
        
        var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
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
          def setCss(value: InterpolationWithTheme[_]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
          
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
    
    @js.native
    trait DOMAttributes[T] extends StObject {
      
      var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
    }
    object DOMAttributes {
      
      @scala.inline
      def apply[T](): typings.emotionCore.mod.reactAugmentingMod.DOMAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.emotionCore.mod.reactAugmentingMod.DOMAttributes[T]]
      }
      
      @scala.inline
      implicit class DOMAttributesMutableBuilder[Self <: typings.emotionCore.mod.reactAugmentingMod.DOMAttributes[_], T] (val x: Self with typings.emotionCore.mod.reactAugmentingMod.DOMAttributes[T]) extends AnyVal {
        
        @scala.inline
        def setCss(value: InterpolationWithTheme[_]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCssNull: Self = StObject.set(x, "css", null)
        
        @scala.inline
        def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      }
    }
  }
}
