package typings.googleapisDashCommon.buildSrcApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentDirective extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var product: String
  var version: String
}

object UserAgentDirective {
  @scala.inline
  def apply(product: String, version: String, comment: String = null): UserAgentDirective = {
    val __obj = js.Dynamic.literal(product = product, version = version)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[UserAgentDirective]
  }
}

