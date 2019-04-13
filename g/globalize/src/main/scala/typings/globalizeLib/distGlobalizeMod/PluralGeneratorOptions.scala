package typings
package globalizeLib.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralGeneratorOptions extends js.Object {
  /**
  		 * cardinal (default), or ordinal.
  		 */
  var `type`: js.UndefOr[
    globalizeLib.globalizeLibStrings.cardinal | globalizeLib.globalizeLibStrings.ordinal
  ] = js.undefined
}

object PluralGeneratorOptions {
  @scala.inline
  def apply(
    `type`: globalizeLib.globalizeLibStrings.cardinal | globalizeLib.globalizeLibStrings.ordinal = null
  ): PluralGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralGeneratorOptions]
  }
}

