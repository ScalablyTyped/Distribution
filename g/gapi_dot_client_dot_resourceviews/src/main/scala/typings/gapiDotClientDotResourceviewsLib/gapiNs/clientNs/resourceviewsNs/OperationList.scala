package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationList extends js.Object {
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The operation resources. */
  var items: js.UndefOr[js.Array[Operation]] = js.undefined
  /** Type of resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A token used to continue a truncated list request (output only). */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Server defined URL for this resource (output only). */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

