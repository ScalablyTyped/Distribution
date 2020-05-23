package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  /** Step name. */
  var name: js.UndefOr[String] = js.undefined
  /** Step number. */
  var number: js.UndefOr[Double] = js.undefined
  /** URL for this step. */
  var url: js.UndefOr[String] = js.undefined
}

object Number {
  @scala.inline
  def apply(name: String = null, number: js.UndefOr[Double] = js.undefined, url: String = null): Number = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
}

