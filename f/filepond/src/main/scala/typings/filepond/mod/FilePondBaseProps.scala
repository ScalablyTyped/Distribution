package typings.filepond.mod

import typings.filepond.filepondStrings.after
import typings.filepond.filepondStrings.before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondBaseProps extends js.Object {
  
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
  implicit class FilePondBasePropsOps[Self <: FilePondBaseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowBrowse(value: Boolean): Self = this.set("allowBrowse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowBrowse: Self = this.set("allowBrowse", js.undefined)
    
    @scala.inline
    def setAllowDirectoriesOnly(value: Boolean): Self = this.set("allowDirectoriesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDirectoriesOnly: Self = this.set("allowDirectoriesOnly", js.undefined)
    
    @scala.inline
    def setAllowDrop(value: Boolean): Self = this.set("allowDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDrop: Self = this.set("allowDrop", js.undefined)
    
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    
    @scala.inline
    def setAllowPaste(value: Boolean): Self = this.set("allowPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPaste: Self = this.set("allowPaste", js.undefined)
    
    @scala.inline
    def setAllowProcess(value: Boolean): Self = this.set("allowProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowProcess: Self = this.set("allowProcess", js.undefined)
    
    @scala.inline
    def setAllowReorder(value: Boolean): Self = this.set("allowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReorder: Self = this.set("allowReorder", js.undefined)
    
    @scala.inline
    def setAllowReplace(value: Boolean): Self = this.set("allowReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReplace: Self = this.set("allowReplace", js.undefined)
    
    @scala.inline
    def setAllowRevert(value: Boolean): Self = this.set("allowRevert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRevert: Self = this.set("allowRevert", js.undefined)
    
    @scala.inline
    def setAllowSyncAcceptAttribute(value: Boolean): Self = this.set("allowSyncAcceptAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSyncAcceptAttribute: Self = this.set("allowSyncAcceptAttribute", js.undefined)
    
    @scala.inline
    def setCaptureMethod(value: CaptureAttribute): Self = this.set("captureMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureMethod: Self = this.set("captureMethod", js.undefined)
    
    @scala.inline
    def setCaptureMethodNull: Self = this.set("captureMethod", null)
    
    @scala.inline
    def setCheckValidity(value: Boolean): Self = this.set("checkValidity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckValidity: Self = this.set("checkValidity", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClassNameNull: Self = this.set("className", null)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setForceRevert(value: Boolean): Self = this.set("forceRevert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRevert: Self = this.set("forceRevert", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setItemInsertInterval(value: Double): Self = this.set("itemInsertInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemInsertInterval: Self = this.set("itemInsertInterval", js.undefined)
    
    @scala.inline
    def setItemInsertLocationFunction2(value: (/* a */ FilePondFile, /* b */ FilePondFile) => Double): Self = this.set("itemInsertLocation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemInsertLocation(value: before | after | (js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double])): Self = this.set("itemInsertLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemInsertLocation: Self = this.set("itemInsertLocation", js.undefined)
    
    @scala.inline
    def setItemInsertLocationFreedom(value: Boolean): Self = this.set("itemInsertLocationFreedom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemInsertLocationFreedom: Self = this.set("itemInsertLocationFreedom", js.undefined)
    
    @scala.inline
    def setMaxFiles(value: Double): Self = this.set("maxFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFiles: Self = this.set("maxFiles", js.undefined)
    
    @scala.inline
    def setMaxFilesNull: Self = this.set("maxFiles", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}
