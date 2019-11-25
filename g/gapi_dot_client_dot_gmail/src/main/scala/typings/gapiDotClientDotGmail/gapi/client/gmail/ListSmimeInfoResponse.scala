package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSmimeInfoResponse extends js.Object {
  /** List of SmimeInfo. */
  var smimeInfo: js.UndefOr[js.Array[SmimeInfo]] = js.undefined
}

object ListSmimeInfoResponse {
  @scala.inline
  def apply(smimeInfo: js.Array[SmimeInfo] = null): ListSmimeInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (smimeInfo != null) __obj.updateDynamic("smimeInfo")(smimeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSmimeInfoResponse]
  }
}

