package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ThreatHit extends js.Object {
  /**
    * Client-reported identification.
    */
  var clientInfo: js.UndefOr[Schema$ClientInfo] = js.native
  /**
    * The threat entry responsible for the hit. Full hash should be reported
    * for hash-based hits.
    */
  var entry: js.UndefOr[Schema$ThreatEntry] = js.native
  /**
    * The platform type reported.
    */
  var platformType: js.UndefOr[String] = js.native
  /**
    * The resources related to the threat hit.
    */
  var resources: js.UndefOr[js.Array[Schema$ThreatSource]] = js.native
  /**
    * The threat type reported.
    */
  var threatType: js.UndefOr[String] = js.native
  /**
    * Details about the user that encountered the threat.
    */
  var userInfo: js.UndefOr[Schema$UserInfo] = js.native
}

object Schema$ThreatHit {
  @scala.inline
  def apply(
    clientInfo: Schema$ClientInfo = null,
    entry: Schema$ThreatEntry = null,
    platformType: String = null,
    resources: js.Array[Schema$ThreatSource] = null,
    threatType: String = null,
    userInfo: Schema$UserInfo = null
  ): Schema$ThreatHit = {
    val __obj = js.Dynamic.literal()
    if (clientInfo != null) __obj.updateDynamic("clientInfo")(clientInfo.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (threatType != null) __obj.updateDynamic("threatType")(threatType.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ThreatHit]
  }
}

