package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpansionFile extends js.Object {
  /**
    * If set this field indicates that this APK has an Expansion File uploaded to it: this APK does not reference another APK's Expansion File. The field's
    * value is the size of the uploaded Expansion File in bytes.
    */
  var fileSize: js.UndefOr[String] = js.native
  /** If set this APK's Expansion File references another APK's Expansion File. The file_size field will not be set. */
  var referencesVersion: js.UndefOr[Double] = js.native
}

object ExpansionFile {
  @scala.inline
  def apply(): ExpansionFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionFile]
  }
  @scala.inline
  implicit class ExpansionFileOps[Self <: ExpansionFile] (val x: Self) extends AnyVal {
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
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    @scala.inline
    def setReferencesVersion(value: Double): Self = this.set("referencesVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferencesVersion: Self = this.set("referencesVersion", js.undefined)
  }
  
}

