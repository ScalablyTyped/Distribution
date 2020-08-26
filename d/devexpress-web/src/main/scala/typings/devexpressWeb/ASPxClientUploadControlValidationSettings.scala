package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that relate to the ASPxClientUploadControl.ValidationErrorOccurred client event.
  */
@js.native
trait ASPxClientUploadControlValidationSettings extends js.Object {
  /**
    * Gets the allowed file extensions.
    */
  var allowedFileExtensions: js.Array[String] = js.native
  /**
    * Gets which characters in a file name are not allowed.
    */
  var invalidFileNameCharacters: js.Array[String] = js.native
  /**
    * Gets the maximum count of files that can be selected for uploading at once.
    */
  var maxFileCount: Double = js.native
  /**
    * Gets the maximum file size.
    */
  var maxFileSize: Double = js.native
}

object ASPxClientUploadControlValidationSettings {
  @scala.inline
  def apply(
    allowedFileExtensions: js.Array[String],
    invalidFileNameCharacters: js.Array[String],
    maxFileCount: Double,
    maxFileSize: Double
  ): ASPxClientUploadControlValidationSettings = {
    val __obj = js.Dynamic.literal(allowedFileExtensions = allowedFileExtensions.asInstanceOf[js.Any], invalidFileNameCharacters = invalidFileNameCharacters.asInstanceOf[js.Any], maxFileCount = maxFileCount.asInstanceOf[js.Any], maxFileSize = maxFileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlValidationSettings]
  }
  @scala.inline
  implicit class ASPxClientUploadControlValidationSettingsOps[Self <: ASPxClientUploadControlValidationSettings] (val x: Self) extends AnyVal {
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
    def setAllowedFileExtensionsVarargs(value: String*): Self = this.set("allowedFileExtensions", js.Array(value :_*))
    @scala.inline
    def setAllowedFileExtensions(value: js.Array[String]): Self = this.set("allowedFileExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidFileNameCharactersVarargs(value: String*): Self = this.set("invalidFileNameCharacters", js.Array(value :_*))
    @scala.inline
    def setInvalidFileNameCharacters(value: js.Array[String]): Self = this.set("invalidFileNameCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxFileCount(value: Double): Self = this.set("maxFileCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
  }
  
}

