package typings.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentDisposition extends js.Object {
  var contentDisposition: js.UndefOr[String] = js.undefined
  var ifMatch: js.UndefOr[String] = js.undefined
}

object AnonContentDisposition {
  @scala.inline
  def apply(contentDisposition: String = null, ifMatch: String = null): AnonContentDisposition = {
    val __obj = js.Dynamic.literal()
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (ifMatch != null) __obj.updateDynamic("ifMatch")(ifMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentDisposition]
  }
}

