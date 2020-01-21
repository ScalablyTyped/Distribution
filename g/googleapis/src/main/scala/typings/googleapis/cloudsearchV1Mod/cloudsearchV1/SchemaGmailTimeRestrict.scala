package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail Time restricts (i.e. received today, this week).
  */
@js.native
trait SchemaGmailTimeRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGmailTimeRestrict {
  @scala.inline
  def apply(`type`: String = null): SchemaGmailTimeRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGmailTimeRestrict]
  }
}

