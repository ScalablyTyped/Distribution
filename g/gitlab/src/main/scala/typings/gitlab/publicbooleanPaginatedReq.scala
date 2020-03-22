package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  public  :boolean} & gitlab.gitlab/dist/types/core/infrastructure.PaginatedRequestOptions */
trait publicbooleanPaginatedReq
  extends /* key */ StringDictionary[js.Any] {
  var maxPages: js.UndefOr[Double] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var perPage: js.UndefOr[Double] = js.undefined
  var public: Boolean
  var showPagination: js.UndefOr[Boolean] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object publicbooleanPaginatedReq {
  @scala.inline
  def apply(
    public: Boolean,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    maxPages: Int | Double = null,
    page: Int | Double = null,
    perPage: Int | Double = null,
    showPagination: js.UndefOr[Boolean] = js.undefined,
    sudo: String | Double = null
  ): publicbooleanPaginatedReq = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxPages != null) __obj.updateDynamic("maxPages")(maxPages.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (perPage != null) __obj.updateDynamic("perPage")(perPage.asInstanceOf[js.Any])
    if (!js.isUndefined(showPagination)) __obj.updateDynamic("showPagination")(showPagination.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[publicbooleanPaginatedReq]
  }
}

