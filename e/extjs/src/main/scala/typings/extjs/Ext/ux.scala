package typings.extjs.Ext

import typings.extjs.Ext.form.field.ITrigger
import typings.extjs.Ext.grid.column.IColumn
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ux {
  
  trait ICheckColumn
    extends StObject
       with IColumn {
    
    /** [Method] Disables this CheckColumn
      * @param silent Boolean
      */
    @JSName("onDisable")
    var onDisable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Enables this CheckColumn
      * @param silent Boolean
      */
    @JSName("onEnable")
    var onEnable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var stopSelection: js.UndefOr[Boolean] = js.undefined
  }
  object ICheckColumn {
    
    inline def apply(): ICheckColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckColumn]
    }
    
    extension [Self <: ICheckColumn](x: Self) {
      
      inline def setOnDisable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "onDisable", js.Any.fromFunction1(value))
      
      inline def setOnDisableUndefined: Self = StObject.set(x, "onDisable", js.undefined)
      
      inline def setOnEnable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "onEnable", js.Any.fromFunction1(value))
      
      inline def setOnEnableUndefined: Self = StObject.set(x, "onEnable", js.undefined)
      
      inline def setStopSelection(value: Boolean): Self = StObject.set(x, "stopSelection", value.asInstanceOf[js.Any])
      
      inline def setStopSelectionUndefined: Self = StObject.set(x, "stopSelection", js.undefined)
    }
  }
  
  object form {
    
    trait IFileUploadField
      extends StObject
         with ITrigger {
      
      /** [Property] (Ext.button.Button) */
      var button: js.UndefOr[typings.extjs.Ext.button.IButton] = js.undefined
      
      /** [Config Option] (Object) */
      var buttonConfig: js.UndefOr[js.Any] = js.undefined
      
      /** [Config Option] (Number) */
      var buttonMargin: js.UndefOr[Double] = js.undefined
      
      /** [Config Option] (Boolean) */
      var buttonOnly: js.UndefOr[Boolean] = js.undefined
      
      /** [Config Option] (String) */
      var buttonText: js.UndefOr[java.lang.String] = js.undefined
      
      /** [Config Option] (Boolean) */
      var clearOnSubmit: js.UndefOr[Boolean] = js.undefined
      
      /** [Method] Only relevant if the instance s isFileUpload method returns true
        * @returns HTMLElement
        */
      @JSName("extractFileInput")
      var extractFileInput_IFileUploadField: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
      
      /** [Property] (Ext.Element) */
      var fileInputEl: js.UndefOr[IElement] = js.undefined
      
      /** [Method] Gets the markup to be inserted into the subTplMarkup  */
      var getTriggerMarkup: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
        * @returns Boolean
        */
      @JSName("isFileUpload")
      var isFileUpload_IFileUploadField: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      /** [Method] Allows addition of behavior to the show operation  */
      @JSName("onShow")
      var onShow_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /** [Method] Overridden to do nothing */
      @JSName("setValue")
      var setValue_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.undefined
    }
    object IFileUploadField {
      
      inline def apply(): IFileUploadField = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFileUploadField]
      }
      
      extension [Self <: IFileUploadField](x: Self) {
        
        inline def setButton(value: typings.extjs.Ext.button.IButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        inline def setButtonConfig(value: js.Any): Self = StObject.set(x, "buttonConfig", value.asInstanceOf[js.Any])
        
        inline def setButtonConfigUndefined: Self = StObject.set(x, "buttonConfig", js.undefined)
        
        inline def setButtonMargin(value: Double): Self = StObject.set(x, "buttonMargin", value.asInstanceOf[js.Any])
        
        inline def setButtonMarginUndefined: Self = StObject.set(x, "buttonMargin", js.undefined)
        
        inline def setButtonOnly(value: Boolean): Self = StObject.set(x, "buttonOnly", value.asInstanceOf[js.Any])
        
        inline def setButtonOnlyUndefined: Self = StObject.set(x, "buttonOnly", js.undefined)
        
        inline def setButtonText(value: java.lang.String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
        
        inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
        
        inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
        
        inline def setClearOnSubmit(value: Boolean): Self = StObject.set(x, "clearOnSubmit", value.asInstanceOf[js.Any])
        
        inline def setClearOnSubmitUndefined: Self = StObject.set(x, "clearOnSubmit", js.undefined)
        
        inline def setExtractFileInput(value: () => HTMLElement): Self = StObject.set(x, "extractFileInput", js.Any.fromFunction0(value))
        
        inline def setExtractFileInputUndefined: Self = StObject.set(x, "extractFileInput", js.undefined)
        
        inline def setFileInputEl(value: IElement): Self = StObject.set(x, "fileInputEl", value.asInstanceOf[js.Any])
        
        inline def setFileInputElUndefined: Self = StObject.set(x, "fileInputEl", js.undefined)
        
        inline def setGetTriggerMarkup(value: () => Unit): Self = StObject.set(x, "getTriggerMarkup", js.Any.fromFunction0(value))
        
        inline def setGetTriggerMarkupUndefined: Self = StObject.set(x, "getTriggerMarkup", js.undefined)
        
        inline def setIsFileUpload(value: () => Boolean): Self = StObject.set(x, "isFileUpload", js.Any.fromFunction0(value))
        
        inline def setIsFileUploadUndefined: Self = StObject.set(x, "isFileUpload", js.undefined)
        
        inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
        
        inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
        
        inline def setSetValue(value: () => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction0(value))
        
        inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      }
    }
  }
}
