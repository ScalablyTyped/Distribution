package typings.googleAppsScript.GoogleAppsScript.Sites

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageAdvancedParameters extends js.Object {
  /** whether to include deleted pages (default false) */
  var includeDeleted: js.UndefOr[Boolean] = js.native
  /** whether to include draft pages (default false) */
  var includeDrafts: js.UndefOr[Boolean] = js.native
  /** the max number of results (default 200) */
  var max: js.UndefOr[Integer] = js.native
  /** only return pages matching this query */
  var search: js.UndefOr[String] = js.native
  /** start the results here */
  var start: js.UndefOr[Integer] = js.native
  /** only get pages of this type */
  var `type`: js.UndefOr[js.Array[PageType]] = js.native
}

object PageAdvancedParameters {
  @scala.inline
  def apply(): PageAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageAdvancedParameters]
  }
  @scala.inline
  implicit class PageAdvancedParametersOps[Self <: PageAdvancedParameters] (val x: Self) extends AnyVal {
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
    def setIncludeDeleted(value: Boolean): Self = this.set("includeDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDeleted: Self = this.set("includeDeleted", js.undefined)
    @scala.inline
    def setIncludeDrafts(value: Boolean): Self = this.set("includeDrafts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDrafts: Self = this.set("includeDrafts", js.undefined)
    @scala.inline
    def setMax(value: Integer): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setStart(value: Integer): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTypeVarargs(value: PageType*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: js.Array[PageType]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

