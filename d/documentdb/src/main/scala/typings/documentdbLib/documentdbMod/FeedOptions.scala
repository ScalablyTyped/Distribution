package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedOptions extends RequestOptions {
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[java.lang.String] = js.undefined
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths. */
  var enableScanInQuery: js.UndefOr[scala.Boolean] = js.undefined
  /** Max number of items to be returned in the enumeration operation. */
  var maxItemCount: js.UndefOr[scala.Double] = js.undefined
}

