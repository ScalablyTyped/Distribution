package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail Action restricts (i.e. read/replied/snoozed).
  */
@js.native
trait Schema$GmailActionRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GmailActionRestrict {
  @scala.inline
  def apply(`type`: String = null): Schema$GmailActionRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GmailActionRestrict]
  }
}

