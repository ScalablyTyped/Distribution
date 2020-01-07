package typings.googleapis.buildSrcApisCloudfunctionsV1beta2Mod.cloudfunctions_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request of `GenerateDownloadUrl` method.
  */
@js.native
trait Schema$GenerateDownloadUrlRequest extends js.Object {
  /**
    * The optional version of function.
    */
  var versionId: js.UndefOr[String] = js.native
}

object Schema$GenerateDownloadUrlRequest {
  @scala.inline
  def apply(versionId: String = null): Schema$GenerateDownloadUrlRequest = {
    val __obj = js.Dynamic.literal()
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GenerateDownloadUrlRequest]
  }
}

