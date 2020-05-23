package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentStyleSuggestionState extends js.Object {
  var backgroundSuggestionState: js.UndefOr[BackgroundSuggestionState] = js.undefined
  var defaultFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
  var defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
  var evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
  var evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
  var firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
  var firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
  var marginBottomSuggested: js.UndefOr[Boolean] = js.undefined
  var marginLeftSuggested: js.UndefOr[Boolean] = js.undefined
  var marginRightSuggested: js.UndefOr[Boolean] = js.undefined
  var marginTopSuggested: js.UndefOr[Boolean] = js.undefined
  var pageNumberStartSuggested: js.UndefOr[Boolean] = js.undefined
  var pageSizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.undefined
  var useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined
  var useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined
}

object DocumentStyleSuggestionState {
  @scala.inline
  def apply(
    backgroundSuggestionState: BackgroundSuggestionState = null,
    defaultFooterIdSuggested: js.UndefOr[Boolean] = js.undefined,
    defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined,
    evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined,
    evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined,
    firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined,
    firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined,
    marginBottomSuggested: js.UndefOr[Boolean] = js.undefined,
    marginLeftSuggested: js.UndefOr[Boolean] = js.undefined,
    marginRightSuggested: js.UndefOr[Boolean] = js.undefined,
    marginTopSuggested: js.UndefOr[Boolean] = js.undefined,
    pageNumberStartSuggested: js.UndefOr[Boolean] = js.undefined,
    pageSizeSuggestionState: SizeSuggestionState = null,
    useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined,
    useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined
  ): DocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (backgroundSuggestionState != null) __obj.updateDynamic("backgroundSuggestionState")(backgroundSuggestionState.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultFooterIdSuggested)) __obj.updateDynamic("defaultFooterIdSuggested")(defaultFooterIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultHeaderIdSuggested)) __obj.updateDynamic("defaultHeaderIdSuggested")(defaultHeaderIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evenPageFooterIdSuggested)) __obj.updateDynamic("evenPageFooterIdSuggested")(evenPageFooterIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evenPageHeaderIdSuggested)) __obj.updateDynamic("evenPageHeaderIdSuggested")(evenPageHeaderIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstPageFooterIdSuggested)) __obj.updateDynamic("firstPageFooterIdSuggested")(firstPageFooterIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstPageHeaderIdSuggested)) __obj.updateDynamic("firstPageHeaderIdSuggested")(firstPageHeaderIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottomSuggested)) __obj.updateDynamic("marginBottomSuggested")(marginBottomSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeftSuggested)) __obj.updateDynamic("marginLeftSuggested")(marginLeftSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRightSuggested)) __obj.updateDynamic("marginRightSuggested")(marginRightSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTopSuggested)) __obj.updateDynamic("marginTopSuggested")(marginTopSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageNumberStartSuggested)) __obj.updateDynamic("pageNumberStartSuggested")(pageNumberStartSuggested.get.asInstanceOf[js.Any])
    if (pageSizeSuggestionState != null) __obj.updateDynamic("pageSizeSuggestionState")(pageSizeSuggestionState.asInstanceOf[js.Any])
    if (!js.isUndefined(useEvenPageHeaderFooterSuggested)) __obj.updateDynamic("useEvenPageHeaderFooterSuggested")(useEvenPageHeaderFooterSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useFirstPageHeaderFooterSuggested)) __obj.updateDynamic("useFirstPageHeaderFooterSuggested")(useFirstPageHeaderFooterSuggested.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentStyleSuggestionState]
  }
}

