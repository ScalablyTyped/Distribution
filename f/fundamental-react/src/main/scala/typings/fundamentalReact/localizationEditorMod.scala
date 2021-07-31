package typings.fundamentalReact

import typings.fundamentalReact.anon.ButtonProps
import typings.fundamentalReact.anon.InputProps
import typings.fundamentalReact.anon.PartialLocalizationEditor
import typings.fundamentalReact.anon.WeakValidationMapLocaliza
import typings.fundamentalReact.fundamentalReactStrings.LocalizationEditor
import typings.react.mod.HTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localizationEditorMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/LocalizationEditor/LocalizationEditor.LocalizationEditorProps> & {  displayName :'LocalizationEditor'} */
  object default {
    
    @scala.inline
    def apply(props: PropsWithChildren[LocalizationEditorProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    @scala.inline
    def apply(props: PropsWithChildren[LocalizationEditorProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialLocalizationEditor] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialLocalizationEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", "default.displayName")
    @js.native
    def displayName: js.UndefOr[LocalizationEditor | String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[LocalizationEditor | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapLocaliza] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapLocaliza]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait LocalizationEditorProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var control: ButtonProps
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var inputClassName: js.UndefOr[String] = js.undefined
    
    var listProps: js.UndefOr[js.Any] = js.undefined
    
    var menu: js.Array[InputProps]
    
    var popoverProps: js.UndefOr[js.Any] = js.undefined
    
    var textarea: js.UndefOr[Boolean] = js.undefined
  }
  object LocalizationEditorProps {
    
    @scala.inline
    def apply(control: ButtonProps, menu: js.Array[InputProps]): LocalizationEditorProps = {
      val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizationEditorProps]
    }
    
    @scala.inline
    implicit class LocalizationEditorPropsMutableBuilder[Self <: LocalizationEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setControl(value: ButtonProps): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      @scala.inline
      def setListProps(value: js.Any): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      @scala.inline
      def setMenu(value: js.Array[InputProps]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuVarargs(value: InputProps*): Self = StObject.set(x, "menu", js.Array(value :_*))
      
      @scala.inline
      def setPopoverProps(value: js.Any): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setTextarea(value: Boolean): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    }
  }
}
