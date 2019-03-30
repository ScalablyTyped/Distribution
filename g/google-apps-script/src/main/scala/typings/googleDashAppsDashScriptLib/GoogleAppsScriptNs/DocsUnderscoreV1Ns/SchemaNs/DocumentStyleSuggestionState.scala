package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentStyleSuggestionState extends js.Object {
  var backgroundSuggestionState: js.UndefOr[BackgroundSuggestionState] = js.undefined
  var defaultFooterIdSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var defaultHeaderIdSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var evenPageFooterIdSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var evenPageHeaderIdSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var firstPageFooterIdSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var firstPageHeaderIdSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var marginBottomSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var marginLeftSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var marginRightSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var marginTopSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var pageNumberStartSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var pageSizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.undefined
  var useEvenPageHeaderFooterSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var useFirstPageHeaderFooterSuggested: js.UndefOr[scala.Boolean] = js.undefined
}

object DocumentStyleSuggestionState {
  @scala.inline
  def apply(
    backgroundSuggestionState: BackgroundSuggestionState = null,
    defaultFooterIdSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    defaultHeaderIdSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    evenPageFooterIdSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    evenPageHeaderIdSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    firstPageFooterIdSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    firstPageHeaderIdSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    marginBottomSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    marginLeftSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    marginRightSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    marginTopSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    pageNumberStartSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    pageSizeSuggestionState: SizeSuggestionState = null,
    useEvenPageHeaderFooterSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    useFirstPageHeaderFooterSuggested: js.UndefOr[scala.Boolean] = js.undefined
  ): DocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (backgroundSuggestionState != null) __obj.updateDynamic("backgroundSuggestionState")(backgroundSuggestionState)
    if (!js.isUndefined(defaultFooterIdSuggested)) __obj.updateDynamic("defaultFooterIdSuggested")(defaultFooterIdSuggested)
    if (!js.isUndefined(defaultHeaderIdSuggested)) __obj.updateDynamic("defaultHeaderIdSuggested")(defaultHeaderIdSuggested)
    if (!js.isUndefined(evenPageFooterIdSuggested)) __obj.updateDynamic("evenPageFooterIdSuggested")(evenPageFooterIdSuggested)
    if (!js.isUndefined(evenPageHeaderIdSuggested)) __obj.updateDynamic("evenPageHeaderIdSuggested")(evenPageHeaderIdSuggested)
    if (!js.isUndefined(firstPageFooterIdSuggested)) __obj.updateDynamic("firstPageFooterIdSuggested")(firstPageFooterIdSuggested)
    if (!js.isUndefined(firstPageHeaderIdSuggested)) __obj.updateDynamic("firstPageHeaderIdSuggested")(firstPageHeaderIdSuggested)
    if (!js.isUndefined(marginBottomSuggested)) __obj.updateDynamic("marginBottomSuggested")(marginBottomSuggested)
    if (!js.isUndefined(marginLeftSuggested)) __obj.updateDynamic("marginLeftSuggested")(marginLeftSuggested)
    if (!js.isUndefined(marginRightSuggested)) __obj.updateDynamic("marginRightSuggested")(marginRightSuggested)
    if (!js.isUndefined(marginTopSuggested)) __obj.updateDynamic("marginTopSuggested")(marginTopSuggested)
    if (!js.isUndefined(pageNumberStartSuggested)) __obj.updateDynamic("pageNumberStartSuggested")(pageNumberStartSuggested)
    if (pageSizeSuggestionState != null) __obj.updateDynamic("pageSizeSuggestionState")(pageSizeSuggestionState)
    if (!js.isUndefined(useEvenPageHeaderFooterSuggested)) __obj.updateDynamic("useEvenPageHeaderFooterSuggested")(useEvenPageHeaderFooterSuggested)
    if (!js.isUndefined(useFirstPageHeaderFooterSuggested)) __obj.updateDynamic("useFirstPageHeaderFooterSuggested")(useFirstPageHeaderFooterSuggested)
    __obj.asInstanceOf[DocumentStyleSuggestionState]
  }
}

