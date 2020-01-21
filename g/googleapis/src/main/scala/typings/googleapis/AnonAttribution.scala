package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttribution extends js.Object {
  var attribution: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnonAttribution {
  @scala.inline
  def apply(attribution: String = null, url: String = null): AnonAttribution = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttribution]
  }
}

