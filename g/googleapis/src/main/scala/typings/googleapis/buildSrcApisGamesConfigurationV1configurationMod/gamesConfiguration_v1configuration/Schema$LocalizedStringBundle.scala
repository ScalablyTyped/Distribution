package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a localized string bundle resource.
  */
@js.native
trait Schema$LocalizedStringBundle extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#localizedStringBundle.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The locale strings.
    */
  var translations: js.UndefOr[js.Array[Schema$LocalizedString]] = js.native
}

object Schema$LocalizedStringBundle {
  @scala.inline
  def apply(kind: String = null, translations: js.Array[Schema$LocalizedString] = null): Schema$LocalizedStringBundle = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocalizedStringBundle]
  }
}

