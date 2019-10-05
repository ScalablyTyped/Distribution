package typings.fineDashUploader.libS3Mod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3FailedUploadTextDisplayOptions extends js.Object {
  /**
    * You will most likely want to keep this at the default value of 'custom'. See the UI options documentation for more info on this option.
    *
    * @default `'custom'`
    */
  var mode: js.UndefOr[String] = js.undefined
}

object S3FailedUploadTextDisplayOptions {
  @scala.inline
  def apply(mode: String = null): S3FailedUploadTextDisplayOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[S3FailedUploadTextDisplayOptions]
  }
}

