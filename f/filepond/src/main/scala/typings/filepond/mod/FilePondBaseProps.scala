package typings.filepond.mod

import typings.filepond.filepondStrings.after
import typings.filepond.filepondStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondBaseProps extends StObject {
  
  /**
    * Enable or disable file browser.
    * @default true
    */
  var allowBrowse: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow only selecting directories with browse (no support for filtering dnd at this point)
    * @default false
    */
  var allowDirectoriesOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable drag n’ drop.
    * @default true
    */
  var allowDrop: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable adding multiple files.
    * @default false
    */
  var allowMultiple: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable pasting of files. Pasting files is not
    * supported on all browsers.
    * @default true
    */
  var allowPaste: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows user to process a file. When set to false, this removes the file upload button.
    * @default true
    */
  var allowProcess: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows the user to reorder the file items
    * @default false
    */
  var allowReorder: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow drop to replace a file, only works when allowMultiple is false.
    * @default true
    */
  var allowReplace: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows the user to revert file upload.
    * @default true
    */
  var allowRevert: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to false to prevent FilePond from setting the file input field `accept` attribute to the value of the `acceptedFileTypes`.
    */
  var allowSyncAcceptAttribute: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the given value to the capture attribute.
    * @default null
    */
  var captureMethod: js.UndefOr[CaptureAttribute | Null] = js.native
  
  /**
    * Enables custom validity messages.
    * @default false
    */
  var checkValidity: js.UndefOr[Boolean] = js.native
  
  /**
    * Class Name to put on wrapper.
    * @default null
    */
  var className: js.UndefOr[String | Null] = js.native
  
  /**
    * Sets the disabled attribute to the output field.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Require the file to be successfully reverted before continuing.
    * @default false
    */
  var forceRevert: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID to add to the root element.
    * @default null
    */
  var id: js.UndefOr[String | Null] = js.native
  
  /**
    * The interval to use before showing each item being added to the list.
    * @default 75
    */
  var itemInsertInterval: js.UndefOr[Double] = js.native
  
  /**
    * Default index in list to add items that have been dropped at the top of the list.
    * @default 'before'
    */
  var itemInsertLocation: js.UndefOr[
    before | after | (js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double])
  ] = js.native
  
  /**
    * Set to false to always add items to beginning or end of list.
    * @default true
    */
  var itemInsertLocationFreedom: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of files that filepond pond can handle.
    * @default null
    */
  var maxFiles: js.UndefOr[Double | Null] = js.native
  
  /**
    * The input field name to use.
    * @default 'filepond'
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Sets the required attribute to the output field.
    * @default false
    */
  var required: js.UndefOr[Boolean] = js.native
}
object FilePondBaseProps {
  
  @scala.inline
  def apply(): FilePondBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondBaseProps]
  }
  
  @scala.inline
  implicit class FilePondBasePropsMutableBuilder[Self <: FilePondBaseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowBrowse(value: Boolean): Self = StObject.set(x, "allowBrowse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowBrowseUndefined: Self = StObject.set(x, "allowBrowse", js.undefined)
    
    @scala.inline
    def setAllowDirectoriesOnly(value: Boolean): Self = StObject.set(x, "allowDirectoriesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDirectoriesOnlyUndefined: Self = StObject.set(x, "allowDirectoriesOnly", js.undefined)
    
    @scala.inline
    def setAllowDrop(value: Boolean): Self = StObject.set(x, "allowDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
    
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    @scala.inline
    def setAllowPaste(value: Boolean): Self = StObject.set(x, "allowPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPasteUndefined: Self = StObject.set(x, "allowPaste", js.undefined)
    
    @scala.inline
    def setAllowProcess(value: Boolean): Self = StObject.set(x, "allowProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowProcessUndefined: Self = StObject.set(x, "allowProcess", js.undefined)
    
    @scala.inline
    def setAllowReorder(value: Boolean): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
    
    @scala.inline
    def setAllowReplace(value: Boolean): Self = StObject.set(x, "allowReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReplaceUndefined: Self = StObject.set(x, "allowReplace", js.undefined)
    
    @scala.inline
    def setAllowRevert(value: Boolean): Self = StObject.set(x, "allowRevert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRevertUndefined: Self = StObject.set(x, "allowRevert", js.undefined)
    
    @scala.inline
    def setAllowSyncAcceptAttribute(value: Boolean): Self = StObject.set(x, "allowSyncAcceptAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSyncAcceptAttributeUndefined: Self = StObject.set(x, "allowSyncAcceptAttribute", js.undefined)
    
    @scala.inline
    def setCaptureMethod(value: CaptureAttribute): Self = StObject.set(x, "captureMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureMethodNull: Self = StObject.set(x, "captureMethod", null)
    
    @scala.inline
    def setCaptureMethodUndefined: Self = StObject.set(x, "captureMethod", js.undefined)
    
    @scala.inline
    def setCheckValidity(value: Boolean): Self = StObject.set(x, "checkValidity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckValidityUndefined: Self = StObject.set(x, "checkValidity", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameNull: Self = StObject.set(x, "className", null)
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setForceRevert(value: Boolean): Self = StObject.set(x, "forceRevert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRevertUndefined: Self = StObject.set(x, "forceRevert", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItemInsertInterval(value: Double): Self = StObject.set(x, "itemInsertInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemInsertIntervalUndefined: Self = StObject.set(x, "itemInsertInterval", js.undefined)
    
    @scala.inline
    def setItemInsertLocation(value: before | after | (js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double])): Self = StObject.set(x, "itemInsertLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemInsertLocationFreedom(value: Boolean): Self = StObject.set(x, "itemInsertLocationFreedom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemInsertLocationFreedomUndefined: Self = StObject.set(x, "itemInsertLocationFreedom", js.undefined)
    
    @scala.inline
    def setItemInsertLocationFunction2(value: (/* a */ FilePondFile, /* b */ FilePondFile) => Double): Self = StObject.set(x, "itemInsertLocation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemInsertLocationUndefined: Self = StObject.set(x, "itemInsertLocation", js.undefined)
    
    @scala.inline
    def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFilesNull: Self = StObject.set(x, "maxFiles", null)
    
    @scala.inline
    def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
