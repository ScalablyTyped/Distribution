package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the user that encountered the threat.
  */
@js.native
trait Schema$UserInfo extends js.Object {
  /**
    * The UN M.49 region code associated with the user&#39;s location.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * Unique user identifier defined by the client.
    */
  var userId: js.UndefOr[String] = js.native
}

object Schema$UserInfo {
  @scala.inline
  def apply(regionCode: String = null, userId: String = null): Schema$UserInfo = {
    val __obj = js.Dynamic.literal()
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserInfo]
  }
}

