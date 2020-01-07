package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail Time restricts (i.e. received today, this week).
  */
@js.native
trait Schema$GmailTimeRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GmailTimeRestrict {
  @scala.inline
  def apply(`type`: String = null): Schema$GmailTimeRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GmailTimeRestrict]
  }
}

