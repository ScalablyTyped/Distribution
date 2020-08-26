package typings.fineUploader.s3Mod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3iFrameSupportOptions extends js.Object {
  /**
    * This is required if you plan on supporting browsers that do not implement the File API, such as IE9 and older.
    * This must point to a blank page on the same origin/domain as the page hosting Fine Uploader
    *
    * @default `null`
    */
  var localBlankPagePath: js.UndefOr[String] = js.native
}

object S3iFrameSupportOptions {
  @scala.inline
  def apply(): S3iFrameSupportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3iFrameSupportOptions]
  }
  @scala.inline
  implicit class S3iFrameSupportOptionsOps[Self <: S3iFrameSupportOptions] (val x: Self) extends AnyVal {
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
    def setLocalBlankPagePath(value: String): Self = this.set("localBlankPagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalBlankPagePath: Self = this.set("localBlankPagePath", js.undefined)
  }
  
}

