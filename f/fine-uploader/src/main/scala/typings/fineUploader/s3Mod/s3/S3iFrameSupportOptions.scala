package typings.fineUploader.s3Mod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3iFrameSupportOptions extends js.Object {
  /**
    * This is required if you plan on supporting browsers that do not implement the File API, such as IE9 and older.
    * This must point to a blank page on the same origin/domain as the page hosting Fine Uploader
    *
    * @default `null`
    */
  var localBlankPagePath: js.UndefOr[String] = js.undefined
}

object S3iFrameSupportOptions {
  @scala.inline
  def apply(localBlankPagePath: String = null): S3iFrameSupportOptions = {
    val __obj = js.Dynamic.literal()
    if (localBlankPagePath != null) __obj.updateDynamic("localBlankPagePath")(localBlankPagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3iFrameSupportOptions]
  }
}

