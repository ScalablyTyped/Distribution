package typings
package gitlabLib.distInfrastructureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatedRequestOptions extends BaseRequestOptions {
  var maxPages: js.UndefOr[scala.Double] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var perPage: js.UndefOr[scala.Double] = js.undefined
  var showPagination: js.UndefOr[scala.Boolean] = js.undefined
}

object PaginatedRequestOptions {
  @scala.inline
  def apply(
    maxPages: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    perPage: scala.Int | scala.Double = null,
    showPagination: js.UndefOr[scala.Boolean] = js.undefined,
    sudo: java.lang.String | scala.Double = null
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

