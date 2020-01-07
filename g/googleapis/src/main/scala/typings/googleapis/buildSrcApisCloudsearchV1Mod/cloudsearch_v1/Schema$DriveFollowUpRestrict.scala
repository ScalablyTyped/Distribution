package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive follow-up search restricts (e.g. &quot;followup:suggestions&quot;).
  */
@js.native
trait Schema$DriveFollowUpRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Schema$DriveFollowUpRestrict {
  @scala.inline
  def apply(`type`: String = null): Schema$DriveFollowUpRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DriveFollowUpRestrict]
  }
}

