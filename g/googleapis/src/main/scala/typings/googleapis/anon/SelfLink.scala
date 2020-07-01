package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfLink extends js.Object {
  var selfLink: js.UndefOr[String] = js.native
  var totalItems: js.UndefOr[Double] = js.native
}

object SelfLink {
  @scala.inline
  def apply(selfLink: String = null, totalItems: js.UndefOr[Double] = js.undefined): SelfLink = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfLink]
  }
}

