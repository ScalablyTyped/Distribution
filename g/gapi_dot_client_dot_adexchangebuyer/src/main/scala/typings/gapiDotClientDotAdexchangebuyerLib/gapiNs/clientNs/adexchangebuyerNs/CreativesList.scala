package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreativesList extends js.Object {
  /** A list of creatives. */
  var items: js.UndefOr[js.Array[Creative]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Continuation token used to page through creatives. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

