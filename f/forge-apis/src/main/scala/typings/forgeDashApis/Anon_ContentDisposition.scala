package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentDisposition extends js.Object {
  var contentDisposition: js.UndefOr[String] = js.undefined
  var ifMatch: js.UndefOr[String] = js.undefined
}

object Anon_ContentDisposition {
  @scala.inline
  def apply(contentDisposition: String = null, ifMatch: String = null): Anon_ContentDisposition = {
    val __obj = js.Dynamic.literal()
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition)
    if (ifMatch != null) __obj.updateDynamic("ifMatch")(ifMatch)
    __obj.asInstanceOf[Anon_ContentDisposition]
  }
}

