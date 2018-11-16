package typings
package gapiDotClientDotKgsearchLib.gapiNs.clientNs.kgsearchNs

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

