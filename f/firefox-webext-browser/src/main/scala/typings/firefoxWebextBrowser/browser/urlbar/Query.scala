package typings.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A query performed in the urlbar. */
trait Query extends js.Object {
  /** Whether the query's browser context is private. */
  var isPrivate: Boolean
  /** The maximum number of results shown to the user. */
  var maxResults: Double
  /** The query's search string. */
  var searchString: String
  /** List of acceptable source types to return. */
  var sources: js.Array[SourceType]
}

object Query {
  @scala.inline
  def apply(isPrivate: Boolean, maxResults: Double, searchString: String, sources: js.Array[SourceType]): Query = {
    val __obj = js.Dynamic.literal(isPrivate = isPrivate.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

