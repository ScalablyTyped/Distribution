package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialButtonProps
import typings.fundamentalReact.anon.WeakValidationMapButtonPr
import typings.fundamentalReact.fundamentalReactStrings.Button
import typings.fundamentalReact.fundamentalReactStrings.button_
import typings.fundamentalReact.fundamentalReactStrings.reset
import typings.fundamentalReact.fundamentalReactStrings.submit
import typings.react.mod.HTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.RefObject
import typings.react.mod.ValidationMap
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Button/Button.ButtonProps> & {  displayName :'Button'} */
  object default {
    
    @scala.inline
    def apply(props: PropsWithChildren[ButtonProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    @scala.inline
    def apply(props: PropsWithChildren[ButtonProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/Button/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Button/Button", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/Button", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialButtonProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/Button", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Button | String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[Button | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/Button", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapButtonPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.emphasized
    - typings.fundamentalReact.fundamentalReactStrings.transparent
  */
  trait ButtonOptions extends StObject
  object ButtonOptions {
    
    @scala.inline
    def emphasized: typings.fundamentalReact.fundamentalReactStrings.emphasized = "emphasized".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.emphasized]
    
    @scala.inline
    def transparent: typings.fundamentalReact.fundamentalReactStrings.transparent = "transparent".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.transparent]
  }
  
  trait ButtonProps
    extends StObject
       with HTMLAttributes[HTMLButtonElement] {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var glyph: js.UndefOr[String] = js.undefined
    
    @JSName("onClick")
    var onClick_ButtonProps: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
      ] = js.undefined
    
    var option: js.UndefOr[ButtonOptions] = js.undefined
    
    var ref: js.UndefOr[RefObject[HTMLButtonElement]] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[ButtonTypes] = js.undefined
    
    var typeAttr: js.UndefOr[submit | reset | button_] = js.undefined
  }
  object ButtonProps {
    
    @scala.inline
    def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOption(value: ButtonOptions): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      @scala.inline
      def setRef(value: RefObject[HTMLButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setType(value: ButtonTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeAttr(value: submit | reset | button_): Self = StObject.set(x, "typeAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeAttrUndefined: Self = StObject.set(x, "typeAttr", js.undefined)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.standard
    - typings.fundamentalReact.fundamentalReactStrings.positive
    - typings.fundamentalReact.fundamentalReactStrings.negative
    - typings.fundamentalReact.fundamentalReactStrings.medium
    - typings.fundamentalReact.fundamentalReactStrings.ghost
    - typings.fundamentalReact.fundamentalReactStrings.attention
  */
  trait ButtonTypes extends StObject
  object ButtonTypes {
    
    @scala.inline
    def attention: typings.fundamentalReact.fundamentalReactStrings.attention = "attention".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.attention]
    
    @scala.inline
    def ghost: typings.fundamentalReact.fundamentalReactStrings.ghost = "ghost".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.ghost]
    
    @scala.inline
    def medium: typings.fundamentalReact.fundamentalReactStrings.medium = "medium".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.medium]
    
    @scala.inline
    def negative: typings.fundamentalReact.fundamentalReactStrings.negative = "negative".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.negative]
    
    @scala.inline
    def positive: typings.fundamentalReact.fundamentalReactStrings.positive = "positive".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.positive]
    
    @scala.inline
    def standard: typings.fundamentalReact.fundamentalReactStrings.standard = "standard".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.standard]
  }
}
