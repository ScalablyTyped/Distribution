package typings.googleapis.buildSrcApisCloudfunctionsV1Mod.cloudfunctions_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of `GenerateDownloadUrl` method.
  */
@js.native
trait Schema$GenerateDownloadUrlResponse extends js.Object {
  /**
    * The generated Google Cloud Storage signed URL that should be used for
    * function source code download.
    */
  var downloadUrl: js.UndefOr[String] = js.native
}

object Schema$GenerateDownloadUrlResponse {
  @scala.inline
  def apply(downloadUrl: String = null): Schema$GenerateDownloadUrlResponse = {
    val __obj = js.Dynamic.literal()
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GenerateDownloadUrlResponse]
  }
}

