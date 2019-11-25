package typings.firefoxDashWebextDashBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* urlbar types */
/** A query performed in the urlbar. */
trait Query extends js.Object {
  /** List of acceptable source types to return. */
  var acceptableSources: js.Array[SourceType]
  /** Whether the query's browser context is private. */
  var isPrivate: Boolean
  /** The maximum number of results shown to the user. */
  var maxResults: Double
  /** The query's search string. */
  var searchString: String
}

object Query {
  @scala.inline
  def apply(
    acceptableSources: js.Array[SourceType],
    isPrivate: Boolean,
    maxResults: Double,
    searchString: String
  ): Query = {
    val __obj = js.Dynamic.literal(acceptableSources = acceptableSources.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Query]
  }
}

