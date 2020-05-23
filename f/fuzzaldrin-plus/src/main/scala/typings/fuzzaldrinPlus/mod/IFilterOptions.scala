package typings.fuzzaldrinPlus.mod

import typings.fuzzaldrinPlus.anon.TagClass
import typings.fuzzaldrinPlus.fuzzaldrinPlusStrings.Backslash
import typings.fuzzaldrinPlus.fuzzaldrinPlusStrings.Slash
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined fuzzaldrin-plus.fuzzaldrin-plus.IOptions & {  key ? :string,   maxResults ? :number,   maxInners ? :number} */
trait IFilterOptions extends js.Object {
  var allowErrors: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var maxInners: js.UndefOr[Double] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var optCharRegEx: js.UndefOr[RegExp] = js.undefined
  var pathSeparator: js.UndefOr[Slash | Backslash | String] = js.undefined
  var preparedQuery: js.UndefOr[Query] = js.undefined
  var useExtensionBonus: js.UndefOr[Boolean] = js.undefined
  var usePathScoring: js.UndefOr[Boolean] = js.undefined
  var wrap: js.UndefOr[TagClass] = js.undefined
}

object IFilterOptions {
  @scala.inline
  def apply(
    allowErrors: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxInners: js.UndefOr[Double] = js.undefined,
    maxResults: js.UndefOr[Double] = js.undefined,
    optCharRegEx: RegExp = null,
    pathSeparator: Slash | Backslash | String = null,
    preparedQuery: Query = null,
    useExtensionBonus: js.UndefOr[Boolean] = js.undefined,
    usePathScoring: js.UndefOr[Boolean] = js.undefined,
    wrap: TagClass = null
  ): IFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowErrors)) __obj.updateDynamic("allowErrors")(allowErrors.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInners)) __obj.updateDynamic("maxInners")(maxInners.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (optCharRegEx != null) __obj.updateDynamic("optCharRegEx")(optCharRegEx.asInstanceOf[js.Any])
    if (pathSeparator != null) __obj.updateDynamic("pathSeparator")(pathSeparator.asInstanceOf[js.Any])
    if (preparedQuery != null) __obj.updateDynamic("preparedQuery")(preparedQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(useExtensionBonus)) __obj.updateDynamic("useExtensionBonus")(useExtensionBonus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePathScoring)) __obj.updateDynamic("usePathScoring")(usePathScoring.get.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilterOptions]
  }
}

