package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail Intelligent restricts (i.e. smartlabels, important).
  */
@js.native
trait Schema$GmailIntelligentRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GmailIntelligentRestrict {
  @scala.inline
  def apply(`type`: String = null): Schema$GmailIntelligentRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GmailIntelligentRestrict]
  }
}

