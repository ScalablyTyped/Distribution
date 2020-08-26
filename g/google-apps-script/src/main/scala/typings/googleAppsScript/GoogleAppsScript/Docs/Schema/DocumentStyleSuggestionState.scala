package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentStyleSuggestionState extends js.Object {
  var backgroundSuggestionState: js.UndefOr[BackgroundSuggestionState] = js.native
  var defaultFooterIdSuggested: js.UndefOr[Boolean] = js.native
  var defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  var evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.native
  var evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  var firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.native
  var firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  var marginBottomSuggested: js.UndefOr[Boolean] = js.native
  var marginLeftSuggested: js.UndefOr[Boolean] = js.native
  var marginRightSuggested: js.UndefOr[Boolean] = js.native
  var marginTopSuggested: js.UndefOr[Boolean] = js.native
  var pageNumberStartSuggested: js.UndefOr[Boolean] = js.native
  var pageSizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.native
  var useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.native
  var useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.native
}

object DocumentStyleSuggestionState {
  @scala.inline
  def apply(): DocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStyleSuggestionState]
  }
  @scala.inline
  implicit class DocumentStyleSuggestionStateOps[Self <: DocumentStyleSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundSuggestionState(value: BackgroundSuggestionState): Self = this.set("backgroundSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundSuggestionState: Self = this.set("backgroundSuggestionState", js.undefined)
    @scala.inline
    def setDefaultFooterIdSuggested(value: Boolean): Self = this.set("defaultFooterIdSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFooterIdSuggested: Self = this.set("defaultFooterIdSuggested", js.undefined)
    @scala.inline
    def setDefaultHeaderIdSuggested(value: Boolean): Self = this.set("defaultHeaderIdSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHeaderIdSuggested: Self = this.set("defaultHeaderIdSuggested", js.undefined)
    @scala.inline
    def setEvenPageFooterIdSuggested(value: Boolean): Self = this.set("evenPageFooterIdSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvenPageFooterIdSuggested: Self = this.set("evenPageFooterIdSuggested", js.undefined)
    @scala.inline
    def setEvenPageHeaderIdSuggested(value: Boolean): Self = this.set("evenPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvenPageHeaderIdSuggested: Self = this.set("evenPageHeaderIdSuggested", js.undefined)
    @scala.inline
    def setFirstPageFooterIdSuggested(value: Boolean): Self = this.set("firstPageFooterIdSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageFooterIdSuggested: Self = this.set("firstPageFooterIdSuggested", js.undefined)
    @scala.inline
    def setFirstPageHeaderIdSuggested(value: Boolean): Self = this.set("firstPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageHeaderIdSuggested: Self = this.set("firstPageHeaderIdSuggested", js.undefined)
    @scala.inline
    def setMarginBottomSuggested(value: Boolean): Self = this.set("marginBottomSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottomSuggested: Self = this.set("marginBottomSuggested", js.undefined)
    @scala.inline
    def setMarginLeftSuggested(value: Boolean): Self = this.set("marginLeftSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeftSuggested: Self = this.set("marginLeftSuggested", js.undefined)
    @scala.inline
    def setMarginRightSuggested(value: Boolean): Self = this.set("marginRightSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRightSuggested: Self = this.set("marginRightSuggested", js.undefined)
    @scala.inline
    def setMarginTopSuggested(value: Boolean): Self = this.set("marginTopSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTopSuggested: Self = this.set("marginTopSuggested", js.undefined)
    @scala.inline
    def setPageNumberStartSuggested(value: Boolean): Self = this.set("pageNumberStartSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageNumberStartSuggested: Self = this.set("pageNumberStartSuggested", js.undefined)
    @scala.inline
    def setPageSizeSuggestionState(value: SizeSuggestionState): Self = this.set("pageSizeSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeSuggestionState: Self = this.set("pageSizeSuggestionState", js.undefined)
    @scala.inline
    def setUseEvenPageHeaderFooterSuggested(value: Boolean): Self = this.set("useEvenPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEvenPageHeaderFooterSuggested: Self = this.set("useEvenPageHeaderFooterSuggested", js.undefined)
    @scala.inline
    def setUseFirstPageHeaderFooterSuggested(value: Boolean): Self = this.set("useFirstPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFirstPageHeaderFooterSuggested: Self = this.set("useFirstPageHeaderFooterSuggested", js.undefined)
  }
  
}

