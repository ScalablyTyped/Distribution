package typings.gapiDotClientDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelfLink extends js.Object {
  /** The URL for the collection of resharers. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Total number of people who reshared this activity. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object Anon_SelfLink {
  @scala.inline
  def apply(selfLink: String = null, totalItems: Int | Double = null): Anon_SelfLink = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SelfLink]
  }
}

