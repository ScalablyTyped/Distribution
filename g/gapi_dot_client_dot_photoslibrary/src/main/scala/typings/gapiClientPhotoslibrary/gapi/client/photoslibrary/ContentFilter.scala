package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentFilter extends js.Object {
  /**
    * The set of categories which are not to be included in the media item search
    * results. The items in the set are ORed. There's a maximum of 10
    * `excludedContentCategories` per request.
    */
  var excludedContentCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of categories to be included in the media item search results.
    * The items in the set are ORed. There's a maximum of 10
    * `includedContentCategories` per request.
    */
  var includedContentCategories: js.UndefOr[js.Array[String]] = js.native
}

object ContentFilter {
  @scala.inline
  def apply(): ContentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentFilter]
  }
  @scala.inline
  implicit class ContentFilterOps[Self <: ContentFilter] (val x: Self) extends AnyVal {
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
    def setExcludedContentCategoriesVarargs(value: String*): Self = this.set("excludedContentCategories", js.Array(value :_*))
    @scala.inline
    def setExcludedContentCategories(value: js.Array[String]): Self = this.set("excludedContentCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedContentCategories: Self = this.set("excludedContentCategories", js.undefined)
    @scala.inline
    def setIncludedContentCategoriesVarargs(value: String*): Self = this.set("includedContentCategories", js.Array(value :_*))
    @scala.inline
    def setIncludedContentCategories(value: js.Array[String]): Self = this.set("includedContentCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedContentCategories: Self = this.set("includedContentCategories", js.undefined)
  }
  
}

