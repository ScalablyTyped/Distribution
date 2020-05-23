package typings.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelfLink extends js.Object {
  /** The URL for the collection of resharers. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Total number of people who reshared this activity. */
  var totalItems: js.UndefOr[Double] = js.undefined
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

