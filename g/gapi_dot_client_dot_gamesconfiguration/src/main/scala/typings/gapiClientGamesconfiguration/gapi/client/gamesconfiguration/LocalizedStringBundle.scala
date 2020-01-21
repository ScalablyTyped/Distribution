package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedStringBundle extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#localizedStringBundle. */
  var kind: js.UndefOr[String] = js.undefined
  /** The locale strings. */
  var translations: js.UndefOr[js.Array[LocalizedString]] = js.undefined
}

object LocalizedStringBundle {
  @scala.inline
  def apply(kind: String = null, translations: js.Array[LocalizedString] = null): LocalizedStringBundle = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedStringBundle]
  }
}

