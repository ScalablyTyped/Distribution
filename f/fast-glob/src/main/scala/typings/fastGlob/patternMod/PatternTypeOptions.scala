package typings.fastGlob.patternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternTypeOptions extends js.Object {
  var braceExpansion: js.UndefOr[Boolean] = js.undefined
  var caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined
  var extglob: js.UndefOr[Boolean] = js.undefined
}

object PatternTypeOptions {
  @scala.inline
  def apply(
    braceExpansion: js.UndefOr[Boolean] = js.undefined,
    caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined,
    extglob: js.UndefOr[Boolean] = js.undefined
  ): PatternTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(braceExpansion)) __obj.updateDynamic("braceExpansion")(braceExpansion.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitiveMatch)) __obj.updateDynamic("caseSensitiveMatch")(caseSensitiveMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(extglob)) __obj.updateDynamic("extglob")(extglob.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternTypeOptions]
  }
}

