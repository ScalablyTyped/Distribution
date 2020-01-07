package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to check entries against lists.
  */
@js.native
trait Schema$FindThreatMatchesRequest extends js.Object {
  /**
    * The client metadata.
    */
  var client: js.UndefOr[Schema$ClientInfo] = js.native
  /**
    * The lists and entries to be checked for matches.
    */
  var threatInfo: js.UndefOr[Schema$ThreatInfo] = js.native
}

object Schema$FindThreatMatchesRequest {
  @scala.inline
  def apply(client: Schema$ClientInfo = null, threatInfo: Schema$ThreatInfo = null): Schema$FindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (threatInfo != null) __obj.updateDynamic("threatInfo")(threatInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FindThreatMatchesRequest]
  }
}

