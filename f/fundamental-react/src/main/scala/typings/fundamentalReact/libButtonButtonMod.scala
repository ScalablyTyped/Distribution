package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialButtonProps
import typings.fundamentalReact.anon.WeakValidationMapButtonPr
import typings.fundamentalReact.fundamentalReactStrings.Button
import typings.fundamentalReact.fundamentalReactStrings.button_
import typings.fundamentalReact.fundamentalReactStrings.reset
import typings.fundamentalReact.fundamentalReactStrings.submit
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.RefObject
import typings.react.mod.ValidationMap
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonButtonMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Button/Button.ButtonProps> & {  displayName :'Button'} */
  object default {
    
    inline def apply(props: ButtonProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: ButtonProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/Button/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Button/Button", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/Button", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialButtonProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/Button", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Button | String] = js.native
    inline def displayName_=(x: js.UndefOr[Button | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/Button", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapButtonPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.emphasized
    - typings.fundamentalReact.fundamentalReactStrings.transparent
  */
  trait ButtonOptions extends StObject
  object ButtonOptions {
    
    inline def emphasized: typings.fundamentalReact.fundamentalReactStrings.emphasized = "emphasized".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.emphasized]
    
    inline def transparent: typings.fundamentalReact.fundamentalReactStrings.transparent = "transparent".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.transparent]
  }
  
  trait ButtonProps
    extends StObject
       with HTMLAttributes[HTMLButtonElement] {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var glyph: js.UndefOr[String] = js.undefined
    
    /** Determines whether the icon should be placed before the text */
    var iconBeforeText: js.UndefOr[Boolean] = js.undefined
    
    var option: js.UndefOr[ButtonOptions] = js.undefined
    
    var ref: js.UndefOr[RefObject[HTMLButtonElement]] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[ButtonTypes] = js.undefined
    
    var typeAttr: js.UndefOr[submit | reset | button_] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setIconBeforeText(value: Boolean): Self = StObject.set(x, "iconBeforeText", value.asInstanceOf[js.Any])
      
      inline def setIconBeforeTextUndefined: Self = StObject.set(x, "iconBeforeText", js.undefined)
      
      inline def setOption(value: ButtonOptions): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setRef(value: RefObject[HTMLButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setType(value: ButtonTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeAttr(value: submit | reset | button_): Self = StObject.set(x, "typeAttr", value.asInstanceOf[js.Any])
      
      inline def setTypeAttrUndefined: Self = StObject.set(x, "typeAttr", js.undefined)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    inline def attention: typings.fundamentalReact.fundamentalReactStrings.attention = "attention".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.attention]
    
    inline def ghost: typings.fundamentalReact.fundamentalReactStrings.ghost = "ghost".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.ghost]
    
    inline def medium: typings.fundamentalReact.fundamentalReactStrings.medium = "medium".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.medium]
    
    inline def negative: typings.fundamentalReact.fundamentalReactStrings.negative = "negative".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.negative]
    
    inline def positive: typings.fundamentalReact.fundamentalReactStrings.positive = "positive".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.positive]
    
    inline def standard: typings.fundamentalReact.fundamentalReactStrings.standard = "standard".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.standard]
  }
}
