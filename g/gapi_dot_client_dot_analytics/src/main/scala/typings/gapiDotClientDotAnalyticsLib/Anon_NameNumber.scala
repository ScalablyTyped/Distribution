package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNumber extends js.Object {
  /** Step name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Step number. */
  var number: js.UndefOr[scala.Double] = js.undefined
  /** URL for this step. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_NameNumber {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    number: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): Anon_NameNumber = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_NameNumber]
  }
}

