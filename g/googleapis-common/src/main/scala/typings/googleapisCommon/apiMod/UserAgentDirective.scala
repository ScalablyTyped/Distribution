package typings.googleapisCommon.apiMod

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
    val __obj = js.Dynamic.literal(product = product.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentDirective]
  }
}

