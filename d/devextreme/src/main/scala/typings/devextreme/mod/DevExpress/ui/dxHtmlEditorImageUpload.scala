package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxFileUploader.Properties
import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.HtmlEditorImageUploadMode
import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.HtmlEditorImageUploadTab
import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.ImageUploadTab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorImageUpload extends StObject {
  
  /**
    * 
    */
  var fileUploadMode: js.UndefOr[HtmlEditorImageUploadMode] = js.undefined
  
  /**
    * 
    */
  var fileUploaderOptions: js.UndefOr[Properties] = js.undefined
  
  /**
    * 
    */
  var tabs: js.UndefOr[js.Array[ImageUploadTab | HtmlEditorImageUploadTab]] = js.undefined
  
  /**
    * 
    */
  var uploadDirectory: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var uploadUrl: js.UndefOr[String] = js.undefined
}
object dxHtmlEditorImageUpload {
  
  inline def apply(): dxHtmlEditorImageUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorImageUpload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxHtmlEditorImageUpload] (val x: Self) extends AnyVal {
    
    inline def setFileUploadMode(value: HtmlEditorImageUploadMode): Self = StObject.set(x, "fileUploadMode", value.asInstanceOf[js.Any])
    
    inline def setFileUploadModeUndefined: Self = StObject.set(x, "fileUploadMode", js.undefined)
    
    inline def setFileUploaderOptions(value: Properties): Self = StObject.set(x, "fileUploaderOptions", value.asInstanceOf[js.Any])
    
    inline def setFileUploaderOptionsUndefined: Self = StObject.set(x, "fileUploaderOptions", js.undefined)
    
    inline def setTabs(value: js.Array[ImageUploadTab | HtmlEditorImageUploadTab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    inline def setTabsVarargs(value: (ImageUploadTab | HtmlEditorImageUploadTab)*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setUploadDirectory(value: String): Self = StObject.set(x, "uploadDirectory", value.asInstanceOf[js.Any])
    
    inline def setUploadDirectoryUndefined: Self = StObject.set(x, "uploadDirectory", js.undefined)
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
