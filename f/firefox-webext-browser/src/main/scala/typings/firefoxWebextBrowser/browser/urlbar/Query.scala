package typings.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A query performed in the urlbar. */
@js.native
trait Query extends js.Object {
  /** Whether the query's browser context is private. */
  var isPrivate: Boolean = js.native
  /** The maximum number of results shown to the user. */
  var maxResults: Double = js.native
  /** The query's search string. */
  var searchString: String = js.native
  /** List of acceptable source types to return. */
  var sources: js.Array[SourceType] = js.native
}

object Query {
  @scala.inline
  def apply(isPrivate: Boolean, maxResults: Double, searchString: String, sources: js.Array[SourceType]): Query = {
    val __obj = js.Dynamic.literal(isPrivate = isPrivate.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
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
    def setIsPrivate(value: Boolean): Self = this.set("isPrivate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: SourceType*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[SourceType]): Self = this.set("sources", value.asInstanceOf[js.Any])
  }
  
}

