package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentDisposition extends js.Object {
  var contentDisposition: js.UndefOr[String] = js.undefined
  var ifMatch: js.UndefOr[String] = js.undefined
}

object ContentDisposition {
  @scala.inline
  def apply(contentDisposition: String = null, ifMatch: String = null): ContentDisposition = {
    val __obj = js.Dynamic.literal()
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (ifMatch != null) __obj.updateDynamic("ifMatch")(ifMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDisposition]
  }
}

