package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive follow-up search restricts (e.g. &quot;followup:suggestions&quot;).
  */
@js.native
trait SchemaDriveFollowUpRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDriveFollowUpRestrict {
  @scala.inline
  def apply(`type`: String = null): SchemaDriveFollowUpRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDriveFollowUpRestrict]
  }
}

