package typings.gitlab.distInfrastructureMod

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
    maxPages: Int | Double = null,
    page: Int | Double = null,
    perPage: Int | Double = null,
    showPagination: js.UndefOr[Boolean] = js.undefined,
    sudo: String | Double = null
  ): PaginatedRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (maxPages != null) __obj.updateDynamic("maxPages")(maxPages.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (perPage != null) __obj.updateDynamic("perPage")(perPage.asInstanceOf[js.Any])
    if (!js.isUndefined(showPagination)) __obj.updateDynamic("showPagination")(showPagination)
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatedRequestOptions]
  }
}

