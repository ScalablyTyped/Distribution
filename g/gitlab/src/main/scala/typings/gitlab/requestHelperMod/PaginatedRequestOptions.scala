package typings.gitlab.requestHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatedRequestOptions extends BaseRequestOptions {
  var maxPages: js.UndefOr[Double] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var perPage: js.UndefOr[Double] = js.undefined
  var showPagination: js.UndefOr[Boolean] = js.undefined
}

object PaginatedRequestOptions {
  @scala.inline
  def apply(
    maxPages: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    perPage: js.UndefOr[Double] = js.undefined,
    showPagination: js.UndefOr[Boolean] = js.undefined,
    sudo: String | Double = null
  ): PaginatedRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxPages)) __obj.updateDynamic("maxPages")(maxPages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(perPage)) __obj.updateDynamic("perPage")(perPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPagination)) __obj.updateDynamic("showPagination")(showPagination.get.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatedRequestOptions]
  }
}

