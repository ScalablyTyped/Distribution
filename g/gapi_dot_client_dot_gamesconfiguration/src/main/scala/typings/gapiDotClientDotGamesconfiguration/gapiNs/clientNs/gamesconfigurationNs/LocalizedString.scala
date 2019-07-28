package typings.gapiDotClientDotGamesconfiguration.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedString extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#localizedString. */
  var kind: js.UndefOr[String] = js.undefined
  /** The locale string. */
  var locale: js.UndefOr[String] = js.undefined
  /** The string value. */
  var value: js.UndefOr[String] = js.undefined
}

object LocalizedString {
  @scala.inline
  def apply(kind: String = null, locale: String = null, value: String = null): LocalizedString = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LocalizedString]
  }
}

