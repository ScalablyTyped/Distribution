package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  userId ? :number} & gitlab.gitlab/dist/types/core/infrastructure.PaginatedRequestOptions */
trait userIdnumberPaginatedRequ
  extends /* key */ StringDictionary[js.Any] {
  var maxPages: js.UndefOr[Double] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var perPage: js.UndefOr[Double] = js.undefined
  var showPagination: js.UndefOr[Boolean] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
  var userId: js.UndefOr[Double] = js.undefined
}

object userIdnumberPaginatedRequ {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    maxPages: Int | Double = null,
    page: Int | Double = null,
    perPage: Int | Double = null,
    showPagination: js.UndefOr[Boolean] = js.undefined,
    sudo: String | Double = null,
    userId: Int | Double = null
  ): userIdnumberPaginatedRequ = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxPages != null) __obj.updateDynamic("maxPages")(maxPages.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (perPage != null) __obj.updateDynamic("perPage")(perPage.asInstanceOf[js.Any])
    if (!js.isUndefined(showPagination)) __obj.updateDynamic("showPagination")(showPagination.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[userIdnumberPaginatedRequ]
  }
}

