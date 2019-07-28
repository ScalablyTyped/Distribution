package typings.globalize.distGlobalizeMod

import typings.globalize.globalizeStrings.cardinal
import typings.globalize.globalizeStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralGeneratorOptions extends js.Object {
  /**
  		 * cardinal (default), or ordinal.
  		 */
  var `type`: js.UndefOr[cardinal | ordinal] = js.undefined
}

object PluralGeneratorOptions {
  @scala.inline
  def apply(`type`: cardinal | ordinal = null): PluralGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralGeneratorOptions]
  }
}

