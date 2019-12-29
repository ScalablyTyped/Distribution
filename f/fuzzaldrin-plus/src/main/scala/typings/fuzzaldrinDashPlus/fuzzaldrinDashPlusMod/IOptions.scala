package typings.fuzzaldrinDashPlus.fuzzaldrinDashPlusMod

import typings.fuzzaldrinDashPlus.Anon_TagClass
import typings.fuzzaldrinDashPlus.fuzzaldrinDashPlusStrings.Backslash
import typings.fuzzaldrinDashPlus.fuzzaldrinDashPlusStrings.Slash
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var allowErrors: js.UndefOr[Boolean] = js.undefined
  var optCharRegEx: js.UndefOr[RegExp] = js.undefined
  var pathSeparator: js.UndefOr[Slash | Backslash | String] = js.undefined
  var preparedQuery: js.UndefOr[Query] = js.undefined
  var useExtensionBonus: js.UndefOr[Boolean] = js.undefined
  var usePathScoring: js.UndefOr[Boolean] = js.undefined
  var wrap: js.UndefOr[Anon_TagClass] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    allowErrors: js.UndefOr[Boolean] = js.undefined,
    optCharRegEx: RegExp = null,
    pathSeparator: Slash | Backslash | String = null,
    preparedQuery: Query = null,
    useExtensionBonus: js.UndefOr[Boolean] = js.undefined,
    usePathScoring: js.UndefOr[Boolean] = js.undefined,
    wrap: Anon_TagClass = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowErrors)) __obj.updateDynamic("allowErrors")(allowErrors.asInstanceOf[js.Any])
    if (optCharRegEx != null) __obj.updateDynamic("optCharRegEx")(optCharRegEx.asInstanceOf[js.Any])
    if (pathSeparator != null) __obj.updateDynamic("pathSeparator")(pathSeparator.asInstanceOf[js.Any])
    if (preparedQuery != null) __obj.updateDynamic("preparedQuery")(preparedQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(useExtensionBonus)) __obj.updateDynamic("useExtensionBonus")(useExtensionBonus.asInstanceOf[js.Any])
    if (!js.isUndefined(usePathScoring)) __obj.updateDynamic("usePathScoring")(usePathScoring.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

