package typings.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameNumber extends js.Object {
  /** Step name. */
  var name: js.UndefOr[String] = js.undefined
  /** Step number. */
  var number: js.UndefOr[Double] = js.undefined
  /** URL for this step. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonNameNumber {
  @scala.inline
  def apply(name: String = null, number: Int | Double = null, url: String = null): AnonNameNumber = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameNumber]
  }
}

