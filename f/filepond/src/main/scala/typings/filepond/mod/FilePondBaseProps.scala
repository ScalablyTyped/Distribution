package typings.filepond.mod

import typings.filepond.filepondBooleans.`false`
import typings.filepond.filepondStrings.after
import typings.filepond.filepondStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePondBaseProps extends StObject {
  
  /**
    * Enable or disable file browser.
    * @default true
    */
  var allowBrowse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow only selecting directories with browse (no support for filtering dnd at this point)
    * @default false
    */
  var allowDirectoriesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable drag n’ drop.
    * @default true
    */
  var allowDrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable adding multiple files.
    * @default false
    */
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable pasting of files. Pasting files is not
    * supported on all browsers.
    * @default true
    */
  var allowPaste: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows user to process a file. When set to false, this removes the file upload button.
    * @default true
    */
  var allowProcess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows the user to reorder the file items
    * @default false
    */
  var allowReorder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow drop to replace a file, only works when allowMultiple is false.
    * @default true
    */
  var allowReplace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows the user to revert file upload.
    * @default true
    */
  var allowRevert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to false to prevent FilePond from setting the file input field `accept` attribute to the value of the `acceptedFileTypes`.
    */
  var allowSyncAcceptAttribute: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the given value to the capture attribute.
    * @default null
    */
  var captureMethod: js.UndefOr[CaptureAttribute | Null] = js.undefined
  
  /**
    * Enables custom validity messages.
    * @default false
    */
  var checkValidity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Class Name to put on wrapper.
    * @default null
    */
  var className: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shows Powered by PQINA in footer. Can be disabled by setting to false, but please do
    * link to https://pqina.nl somewhere else on your website, or otherwise donate to help
    * keep the project alive.
    * @default "Powered by PQINA"
    */
  var credits: js.UndefOr[`false`] = js.undefined
  
  /**
    * Sets the disabled attribute to the output field.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The base value used to calculate file size
    * @default 1000
    */
  var fileSizeBase: js.UndefOr[Double] = js.undefined
  
  /**
    * Require the file to be successfully reverted before continuing.
    * @default false
    */
  var forceRevert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID to add to the root element.
    * @default null
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The interval to use before showing each item being added to the list.
    * @default 75
    */
  var itemInsertInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Default index in list to add items that have been dropped at the top of the list.
    * @default 'before'
    */
  var itemInsertLocation: js.UndefOr[
    before | after | (js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double])
  ] = js.undefined
  
  /**
    * Set to false to always add items to beginning or end of list.
    * @default true
    */
  var itemInsertLocationFreedom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of files that filepond pond can handle.
    * @default null
    */
  var maxFiles: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The input field name to use.
    * @default 'filepond'
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the required attribute to the output field.
    * @default false
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Tells FilePond to store files in hidden file input elements so they can be posted along with
    * normal form post. This only works if the browser supports the DataTransfer constructor,
    * this is the case on Firefox, Chrome, Chromium powered browsers and Safari version 14.1
    * and higher.
    * @default false
    */
  var storeAsFile: js.UndefOr[Boolean] = js.undefined
}
object FilePondBaseProps {
  
  inline def apply(): FilePondBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondBaseProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilePondBaseProps] (val x: Self) extends AnyVal {
    
    inline def setAllowBrowse(value: Boolean): Self = StObject.set(x, "allowBrowse", value.asInstanceOf[js.Any])
    
    inline def setAllowBrowseUndefined: Self = StObject.set(x, "allowBrowse", js.undefined)
    
    inline def setAllowDirectoriesOnly(value: Boolean): Self = StObject.set(x, "allowDirectoriesOnly", value.asInstanceOf[js.Any])
    
    inline def setAllowDirectoriesOnlyUndefined: Self = StObject.set(x, "allowDirectoriesOnly", js.undefined)
    
    inline def setAllowDrop(value: Boolean): Self = StObject.set(x, "allowDrop", value.asInstanceOf[js.Any])
    
    inline def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
    
    inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    inline def setAllowPaste(value: Boolean): Self = StObject.set(x, "allowPaste", value.asInstanceOf[js.Any])
    
    inline def setAllowPasteUndefined: Self = StObject.set(x, "allowPaste", js.undefined)
    
    inline def setAllowProcess(value: Boolean): Self = StObject.set(x, "allowProcess", value.asInstanceOf[js.Any])
    
    inline def setAllowProcessUndefined: Self = StObject.set(x, "allowProcess", js.undefined)
    
    inline def setAllowReorder(value: Boolean): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
    
    inline def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
    
    inline def setAllowReplace(value: Boolean): Self = StObject.set(x, "allowReplace", value.asInstanceOf[js.Any])
    
    inline def setAllowReplaceUndefined: Self = StObject.set(x, "allowReplace", js.undefined)
    
    inline def setAllowRevert(value: Boolean): Self = StObject.set(x, "allowRevert", value.asInstanceOf[js.Any])
    
    inline def setAllowRevertUndefined: Self = StObject.set(x, "allowRevert", js.undefined)
    
    inline def setAllowSyncAcceptAttribute(value: Boolean): Self = StObject.set(x, "allowSyncAcceptAttribute", value.asInstanceOf[js.Any])
    
    inline def setAllowSyncAcceptAttributeUndefined: Self = StObject.set(x, "allowSyncAcceptAttribute", js.undefined)
    
    inline def setCaptureMethod(value: CaptureAttribute): Self = StObject.set(x, "captureMethod", value.asInstanceOf[js.Any])
    
    inline def setCaptureMethodNull: Self = StObject.set(x, "captureMethod", null)
    
    inline def setCaptureMethodUndefined: Self = StObject.set(x, "captureMethod", js.undefined)
    
    inline def setCheckValidity(value: Boolean): Self = StObject.set(x, "checkValidity", value.asInstanceOf[js.Any])
    
    inline def setCheckValidityUndefined: Self = StObject.set(x, "checkValidity", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCredits(value: `false`): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    inline def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFileSizeBase(value: Double): Self = StObject.set(x, "fileSizeBase", value.asInstanceOf[js.Any])
    
    inline def setFileSizeBaseUndefined: Self = StObject.set(x, "fileSizeBase", js.undefined)
    
    inline def setForceRevert(value: Boolean): Self = StObject.set(x, "forceRevert", value.asInstanceOf[js.Any])
    
    inline def setForceRevertUndefined: Self = StObject.set(x, "forceRevert", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItemInsertInterval(value: Double): Self = StObject.set(x, "itemInsertInterval", value.asInstanceOf[js.Any])
    
    inline def setItemInsertIntervalUndefined: Self = StObject.set(x, "itemInsertInterval", js.undefined)
    
    inline def setItemInsertLocation(value: before | after | (js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double])): Self = StObject.set(x, "itemInsertLocation", value.asInstanceOf[js.Any])
    
    inline def setItemInsertLocationFreedom(value: Boolean): Self = StObject.set(x, "itemInsertLocationFreedom", value.asInstanceOf[js.Any])
    
    inline def setItemInsertLocationFreedomUndefined: Self = StObject.set(x, "itemInsertLocationFreedom", js.undefined)
    
    inline def setItemInsertLocationFunction2(value: (/* a */ FilePondFile, /* b */ FilePondFile) => Double): Self = StObject.set(x, "itemInsertLocation", js.Any.fromFunction2(value))
    
    inline def setItemInsertLocationUndefined: Self = StObject.set(x, "itemInsertLocation", js.undefined)
    
    inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
    
    inline def setMaxFilesNull: Self = StObject.set(x, "maxFiles", null)
    
    inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setStoreAsFile(value: Boolean): Self = StObject.set(x, "storeAsFile", value.asInstanceOf[js.Any])
    
    inline def setStoreAsFileUndefined: Self = StObject.set(x, "storeAsFile", js.undefined)
  }
}
