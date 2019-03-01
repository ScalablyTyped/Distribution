package typings
package fuzzaldrinDashPlusLib.fuzzaldrinDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var allowErrors: js.UndefOr[scala.Boolean] = js.undefined
  var optCharRegEx: js.UndefOr[stdLib.RegExp] = js.undefined
  var pathSeparator: js.UndefOr[
    fuzzaldrinDashPlusLib.fuzzaldrinDashPlusLibStrings.`/` | fuzzaldrinDashPlusLib.fuzzaldrinDashPlusLibStrings.BACKSLASHBACKSLASH | java.lang.String
  ] = js.undefined
  var preparedQuery: js.UndefOr[Query] = js.undefined
  var useExtensionBonus: js.UndefOr[scala.Boolean] = js.undefined
  var usePathScoring: js.UndefOr[scala.Boolean] = js.undefined
  var wrap: js.UndefOr[fuzzaldrinDashPlusLib.Anon_TagClass] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    allowErrors: js.UndefOr[scala.Boolean] = js.undefined,
    optCharRegEx: stdLib.RegExp = null,
    pathSeparator: fuzzaldrinDashPlusLib.fuzzaldrinDashPlusLibStrings.`/` | fuzzaldrinDashPlusLib.fuzzaldrinDashPlusLibStrings.BACKSLASHBACKSLASH | java.lang.String = null,
    preparedQuery: Query = null,
    useExtensionBonus: js.UndefOr[scala.Boolean] = js.undefined,
    usePathScoring: js.UndefOr[scala.Boolean] = js.undefined,
    wrap: fuzzaldrinDashPlusLib.Anon_TagClass = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowErrors)) __obj.updateDynamic("allowErrors")(allowErrors)
    if (optCharRegEx != null) __obj.updateDynamic("optCharRegEx")(optCharRegEx)
    if (pathSeparator != null) __obj.updateDynamic("pathSeparator")(pathSeparator.asInstanceOf[js.Any])
    if (preparedQuery != null) __obj.updateDynamic("preparedQuery")(preparedQuery)
    if (!js.isUndefined(useExtensionBonus)) __obj.updateDynamic("useExtensionBonus")(useExtensionBonus)
    if (!js.isUndefined(usePathScoring)) __obj.updateDynamic("usePathScoring")(usePathScoring)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[IOptions]
  }
}

