package typings.extjs.Ext.form.field

import typings.extjs.Ext.IElement
import typings.extjs.Ext.button.IButton
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFile extends ITrigger {
  
  /** [Property] (Ext.button.Button) */
  var button: js.UndefOr[IButton] = js.native
  
  /** [Config Option] (Object) */
  var buttonConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var buttonMargin: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var buttonOnly: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var buttonText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var clearOnSubmit: js.UndefOr[Boolean] = js.native
  
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns HTMLElement
    */
  @JSName("extractFileInput")
  var extractFileInput_IFile: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  /** [Property] (Ext.Element) */
  var fileInputEl: js.UndefOr[IElement] = js.native
  
  /** [Method] Gets the markup to be inserted into the subTplMarkup  */
  var getTriggerMarkup: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns Boolean
    */
  @JSName("isFileUpload")
  var isFileUpload_IFile: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IFile: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Overridden to do nothing */
  @JSName("setValue")
  var setValue_IFile: js.UndefOr[js.Function0[Unit]] = js.native
}
object IFile {
  
  @scala.inline
  def apply(): IFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFile]
  }
  
  @scala.inline
  implicit class IFileMutableBuilder[Self <: IFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: IButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonConfig(value: js.Any): Self = StObject.set(x, "buttonConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonConfigUndefined: Self = StObject.set(x, "buttonConfig", js.undefined)
    
    @scala.inline
    def setButtonMargin(value: Double): Self = StObject.set(x, "buttonMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonMarginUndefined: Self = StObject.set(x, "buttonMargin", js.undefined)
    
    @scala.inline
    def setButtonOnly(value: Boolean): Self = StObject.set(x, "buttonOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonOnlyUndefined: Self = StObject.set(x, "buttonOnly", js.undefined)
    
    @scala.inline
    def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setClearOnSubmit(value: Boolean): Self = StObject.set(x, "clearOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearOnSubmitUndefined: Self = StObject.set(x, "clearOnSubmit", js.undefined)
    
    @scala.inline
    def setExtractFileInput(value: () => HTMLElement): Self = StObject.set(x, "extractFileInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtractFileInputUndefined: Self = StObject.set(x, "extractFileInput", js.undefined)
    
    @scala.inline
    def setFileInputEl(value: IElement): Self = StObject.set(x, "fileInputEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInputElUndefined: Self = StObject.set(x, "fileInputEl", js.undefined)
    
    @scala.inline
    def setGetTriggerMarkup(value: () => Unit): Self = StObject.set(x, "getTriggerMarkup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTriggerMarkupUndefined: Self = StObject.set(x, "getTriggerMarkup", js.undefined)
    
    @scala.inline
    def setIsFileUpload(value: () => Boolean): Self = StObject.set(x, "isFileUpload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFileUploadUndefined: Self = StObject.set(x, "isFileUpload", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setSetValue(value: () => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
