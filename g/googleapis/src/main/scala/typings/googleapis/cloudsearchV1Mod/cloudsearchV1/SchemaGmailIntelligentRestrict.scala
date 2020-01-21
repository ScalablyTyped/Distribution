package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail Intelligent restricts (i.e. smartlabels, important).
  */
@js.native
trait SchemaGmailIntelligentRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGmailIntelligentRestrict {
  @scala.inline
  def apply(`type`: String = null): SchemaGmailIntelligentRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGmailIntelligentRestrict]
  }
}

