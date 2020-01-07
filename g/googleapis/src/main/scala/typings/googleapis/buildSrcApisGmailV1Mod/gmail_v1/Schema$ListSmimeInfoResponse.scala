package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListSmimeInfoResponse extends js.Object {
  /**
    * List of SmimeInfo.
    */
  var smimeInfo: js.UndefOr[js.Array[Schema$SmimeInfo]] = js.native
}

object Schema$ListSmimeInfoResponse {
  @scala.inline
  def apply(smimeInfo: js.Array[Schema$SmimeInfo] = null): Schema$ListSmimeInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (smimeInfo != null) __obj.updateDynamic("smimeInfo")(smimeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListSmimeInfoResponse]
  }
}

