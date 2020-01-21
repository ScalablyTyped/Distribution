package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of `GenerateDownloadUrl` method.
  */
@js.native
trait SchemaGenerateDownloadUrlResponse extends js.Object {
  /**
    * The generated Google Cloud Storage signed URL that should be used for
    * function source code download.
    */
  var downloadUrl: js.UndefOr[String] = js.native
}

object SchemaGenerateDownloadUrlResponse {
  @scala.inline
  def apply(downloadUrl: String = null): SchemaGenerateDownloadUrlResponse = {
    val __obj = js.Dynamic.literal()
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGenerateDownloadUrlResponse]
  }
}

