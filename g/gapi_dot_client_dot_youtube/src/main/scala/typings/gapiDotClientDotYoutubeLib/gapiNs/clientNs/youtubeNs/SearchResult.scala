package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchResult extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The id object contains information that can be used to uniquely identify the resource that matches the search request. */
  var id: js.UndefOr[ResourceId] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#searchResult". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The snippet object contains basic details about a search result, such as its title or description. For example, if the search result is a video, then
               * the title will be the video's title and the description will be the video's description.
               */
  var snippet: js.UndefOr[SearchResultSnippet] = js.undefined
}

