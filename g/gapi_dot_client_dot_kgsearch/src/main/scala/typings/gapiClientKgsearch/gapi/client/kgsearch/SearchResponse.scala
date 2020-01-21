package typings.gapiClientKgsearch.gapi.client.kgsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResponse extends js.Object {
  /**
    * The local context applicable for the response. See more details at
    * http://www.w3.org/TR/json-ld/#context-definitions.
    */
  var `@context`: js.UndefOr[js.Any] = js.undefined
  /** The schema type of top-level JSON-LD object, e.g. ItemList. */
  var `@type`: js.UndefOr[js.Any] = js.undefined
  /** The item list of search results. */
  var itemListElement: js.UndefOr[js.Array[_]] = js.undefined
}

object SearchResponse {
  @scala.inline
  def apply(`@context`: js.Any = null, `@type`: js.Any = null, itemListElement: js.Array[_] = null): SearchResponse = {
    val __obj = js.Dynamic.literal()
    if (`@context` != null) __obj.updateDynamic("@context")(`@context`.asInstanceOf[js.Any])
    if (`@type` != null) __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    if (itemListElement != null) __obj.updateDynamic("itemListElement")(itemListElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse]
  }
}

