package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedString extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#localizedString. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The locale string. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** The string value. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object LocalizedString {
  @scala.inline
  def apply(kind: java.lang.String = null, locale: java.lang.String = null, value: java.lang.String = null): LocalizedString = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LocalizedString]
  }
}

