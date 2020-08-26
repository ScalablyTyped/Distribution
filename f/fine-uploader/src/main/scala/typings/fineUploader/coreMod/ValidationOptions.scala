package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptions extends js.Object {
  /**
    * Used by the file selection dialog.
    *
    * Restrict the valid file types that appear in the selection dialog by listing valid content-type specifiers
    *
    * @default `null`
    */
  var acceptFiles: js.UndefOr[js.Any] = js.native
  /**
    * Specify file valid file extensions here to restrict uploads to specific types
    *
    * @default `[]`
    */
  var allowedExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * ImageOptions
    */
  var image: js.UndefOr[ImageOptions] = js.native
  /**
    * Maximum number of items that can be potentially uploaded in this session.
    *
    * Will reject all items that are added or retried after this limit is reached
    *
    * @default `0`
    */
  var itemLimit: js.UndefOr[Double] = js.native
  /**
    * The minimum allowable size, in bytes, for an item
    *
    * @default `0`
    */
  var minSizeLimit: js.UndefOr[Double] = js.native
  /**
    * The maximum allowable size, in bytes, for an item
    *
    * @default `0`
    */
  var sizeLimit: js.UndefOr[Double] = js.native
  /**
    * When `true` the first invalid item will stop processing further files
    *
    * @default `true`
    */
  var stopOnFirstInvalidFile: js.UndefOr[Boolean] = js.native
}

object ValidationOptions {
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
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
    def setAcceptFiles(value: js.Any): Self = this.set("acceptFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptFiles: Self = this.set("acceptFiles", js.undefined)
    @scala.inline
    def setAllowedExtensionsVarargs(value: String*): Self = this.set("allowedExtensions", js.Array(value :_*))
    @scala.inline
    def setAllowedExtensions(value: js.Array[String]): Self = this.set("allowedExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedExtensions: Self = this.set("allowedExtensions", js.undefined)
    @scala.inline
    def setImage(value: ImageOptions): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setItemLimit(value: Double): Self = this.set("itemLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemLimit: Self = this.set("itemLimit", js.undefined)
    @scala.inline
    def setMinSizeLimit(value: Double): Self = this.set("minSizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSizeLimit: Self = this.set("minSizeLimit", js.undefined)
    @scala.inline
    def setSizeLimit(value: Double): Self = this.set("sizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeLimit: Self = this.set("sizeLimit", js.undefined)
    @scala.inline
    def setStopOnFirstInvalidFile(value: Boolean): Self = this.set("stopOnFirstInvalidFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOnFirstInvalidFile: Self = this.set("stopOnFirstInvalidFile", js.undefined)
  }
  
}

