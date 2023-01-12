package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.FocusInEvent
import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.FocusOutEvent
import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.MarkupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorOptions
  extends StObject
     with EditorOptions[dxHtmlEditor] {
  
  /**
    * Allows users to break content into multiple lines within a single block element. The Shift + Enter key combination generates the new line.
    */
  var allowSoftLineBreak: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows you to customize the DevExtreme Quill and 3rd-party modules.
    */
  var customizeModules: js.UndefOr[js.Function1[/* config */ Any, Unit]] = js.undefined
  
  /**
    * 
    */
  var imageUpload: js.UndefOr[dxHtmlEditorImageUpload] = js.undefined
  
  /**
    * Configures media resizing.
    */
  var mediaResizing: js.UndefOr[dxHtmlEditorMediaResizing] = js.undefined
  
  /**
    * Configures mentions.
    */
  var mentions: js.UndefOr[js.Array[dxHtmlEditorMention]] = js.undefined
  
  /**
    * The value to be assigned to the `name` attribute of the underlying HTML element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed when the UI component gets focus.
    */
  var onFocusIn: js.UndefOr[js.Function1[/* e */ FocusInEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component loses focus.
    */
  var onFocusOut: js.UndefOr[js.Function1[/* e */ FocusOutEvent, Unit]] = js.undefined
  
  /**
    * Specifies the text displayed when the input field is empty.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * Configures table context menu settings.
    */
  var tableContextMenu: js.UndefOr[dxHtmlEditorTableContextMenu] = js.undefined
  
  /**
    * Configures table resize.
    */
  var tableResizing: js.UndefOr[dxHtmlEditorTableResizing] = js.undefined
  
  /**
    * Configures the UI component&apos;s toolbar.
    */
  var toolbar: js.UndefOr[dxHtmlEditorToolbar] = js.undefined
  
  /**
    * Specifies in which markup language the value is stored.
    */
  var valueType: js.UndefOr[MarkupType] = js.undefined
  
  /**
    * Configures variables, which are placeholders to be replaced with actual values when processing text.
    */
  var variables: js.UndefOr[dxHtmlEditorVariables] = js.undefined
}
object dxHtmlEditorOptions {
  
  inline def apply(): dxHtmlEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxHtmlEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowSoftLineBreak(value: Boolean): Self = StObject.set(x, "allowSoftLineBreak", value.asInstanceOf[js.Any])
    
    inline def setAllowSoftLineBreakUndefined: Self = StObject.set(x, "allowSoftLineBreak", js.undefined)
    
    inline def setCustomizeModules(value: /* config */ Any => Unit): Self = StObject.set(x, "customizeModules", js.Any.fromFunction1(value))
    
    inline def setCustomizeModulesUndefined: Self = StObject.set(x, "customizeModules", js.undefined)
    
    inline def setImageUpload(value: dxHtmlEditorImageUpload): Self = StObject.set(x, "imageUpload", value.asInstanceOf[js.Any])
    
    inline def setImageUploadUndefined: Self = StObject.set(x, "imageUpload", js.undefined)
    
    inline def setMediaResizing(value: dxHtmlEditorMediaResizing): Self = StObject.set(x, "mediaResizing", value.asInstanceOf[js.Any])
    
    inline def setMediaResizingUndefined: Self = StObject.set(x, "mediaResizing", js.undefined)
    
    inline def setMentions(value: js.Array[dxHtmlEditorMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: dxHtmlEditorMention*): Self = StObject.set(x, "mentions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnFocusIn(value: /* e */ FocusInEvent => Unit): Self = StObject.set(x, "onFocusIn", js.Any.fromFunction1(value))
    
    inline def setOnFocusInUndefined: Self = StObject.set(x, "onFocusIn", js.undefined)
    
    inline def setOnFocusOut(value: /* e */ FocusOutEvent => Unit): Self = StObject.set(x, "onFocusOut", js.Any.fromFunction1(value))
    
    inline def setOnFocusOutUndefined: Self = StObject.set(x, "onFocusOut", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setTableContextMenu(value: dxHtmlEditorTableContextMenu): Self = StObject.set(x, "tableContextMenu", value.asInstanceOf[js.Any])
    
    inline def setTableContextMenuUndefined: Self = StObject.set(x, "tableContextMenu", js.undefined)
    
    inline def setTableResizing(value: dxHtmlEditorTableResizing): Self = StObject.set(x, "tableResizing", value.asInstanceOf[js.Any])
    
    inline def setTableResizingUndefined: Self = StObject.set(x, "tableResizing", js.undefined)
    
    inline def setToolbar(value: dxHtmlEditorToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setValueType(value: MarkupType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    
    inline def setVariables(value: dxHtmlEditorVariables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
