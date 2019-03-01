package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RewriteResponse extends js.Object {
  /** true if the copy is finished; otherwise, false if the copy is in progress. This property is always present in the response. */
  var done: js.UndefOr[scala.Boolean] = js.undefined
  /** The kind of item this is. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The total size of the object being copied in bytes. This property is always present in the response. */
  var objectSize: js.UndefOr[java.lang.String] = js.undefined
  /** A resource containing the metadata for the copied-to object. This property is present in the response only when copying completes. */
  var resource: js.UndefOr[Object] = js.undefined
  /** A token to use in subsequent requests to continue copying data. This token is present in the response only when there is more data to copy. */
  var rewriteToken: js.UndefOr[java.lang.String] = js.undefined
  /** The total bytes written so far, which can be used to provide a waiting user with a progress indicator. This property is always present in the response. */
  var totalBytesRewritten: js.UndefOr[java.lang.String] = js.undefined
}

object RewriteResponse {
  @scala.inline
  def apply(
    done: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    objectSize: java.lang.String = null,
    resource: Object = null,
    rewriteToken: java.lang.String = null,
    totalBytesRewritten: java.lang.String = null
  ): RewriteResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (objectSize != null) __obj.updateDynamic("objectSize")(objectSize)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (rewriteToken != null) __obj.updateDynamic("rewriteToken")(rewriteToken)
    if (totalBytesRewritten != null) __obj.updateDynamic("totalBytesRewritten")(totalBytesRewritten)
    __obj.asInstanceOf[RewriteResponse]
  }
}

