package typings.fundamentalReact

import typings.fundamentalReact.anon.ButtonProps
import typings.fundamentalReact.anon.InputProps
import typings.fundamentalReact.anon.PartialLocalizationEditor
import typings.fundamentalReact.anon.WeakValidationMapLocaliza
import typings.fundamentalReact.fundamentalReactStrings.LocalizationEditor
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localizationEditorMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/LocalizationEditor/LocalizationEditor.LocalizationEditorProps> & {  displayName :'LocalizationEditor'} */
  object default {
    
    inline def apply(props: LocalizationEditorProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: LocalizationEditorProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialLocalizationEditor] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialLocalizationEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", "default.displayName")
    @js.native
    def displayName: js.UndefOr[LocalizationEditor | String] = js.native
    inline def displayName_=(x: js.UndefOr[LocalizationEditor | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapLocaliza] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapLocaliza]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait LocalizationEditorProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var control: ButtonProps
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var inputClassName: js.UndefOr[String] = js.undefined
    
    var listProps: js.UndefOr[Any] = js.undefined
    
    var menu: js.Array[InputProps]
    
    var popoverProps: js.UndefOr[Any] = js.undefined
    
    var textarea: js.UndefOr[Boolean] = js.undefined
  }
  object LocalizationEditorProps {
    
    inline def apply(control: ButtonProps, menu: js.Array[InputProps]): LocalizationEditorProps = {
      val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizationEditorProps]
    }
    
    extension [Self <: LocalizationEditorProps](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setControl(value: ButtonProps): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setListProps(value: Any): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      inline def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      inline def setMenu(value: js.Array[InputProps]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuVarargs(value: InputProps*): Self = StObject.set(x, "menu", js.Array(value*))
      
      inline def setPopoverProps(value: Any): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setTextarea(value: Boolean): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      inline def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    }
  }
}
