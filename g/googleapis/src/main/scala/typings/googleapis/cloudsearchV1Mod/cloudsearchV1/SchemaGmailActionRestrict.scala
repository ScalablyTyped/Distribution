package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail Action restricts (i.e. read/replied/snoozed).
  */
@js.native
trait SchemaGmailActionRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGmailActionRestrict {
  @scala.inline
  def apply(`type`: String = null): SchemaGmailActionRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGmailActionRestrict]
  }
}

