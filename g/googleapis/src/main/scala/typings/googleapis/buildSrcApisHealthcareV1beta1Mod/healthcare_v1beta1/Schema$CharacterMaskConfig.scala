package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mask a string by replacing its characters with a fixed character.
  */
@js.native
trait Schema$CharacterMaskConfig extends js.Object {
  /**
    * Character to mask the sensitive values. If not supplied, defaults to
    * &quot;*&quot;.
    */
  var maskingCharacter: js.UndefOr[String] = js.native
}

object Schema$CharacterMaskConfig {
  @scala.inline
  def apply(maskingCharacter: String = null): Schema$CharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    if (maskingCharacter != null) __obj.updateDynamic("maskingCharacter")(maskingCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CharacterMaskConfig]
  }
}

