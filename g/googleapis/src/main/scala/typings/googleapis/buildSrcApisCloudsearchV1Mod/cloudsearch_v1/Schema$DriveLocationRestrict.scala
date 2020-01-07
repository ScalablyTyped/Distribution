package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive location search restricts (e.g. &quot;is:starred&quot;).
  */
@js.native
trait Schema$DriveLocationRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Schema$DriveLocationRestrict {
  @scala.inline
  def apply(`type`: String = null): Schema$DriveLocationRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DriveLocationRestrict]
  }
}

