package typings.gapiDotClientDotProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNamespacesResponse extends js.Object {
  /** The attachments that corresponded to the request params. */
  var namespaces: js.UndefOr[js.Array[Namespace]] = js.undefined
}

object ListNamespacesResponse {
  @scala.inline
  def apply(namespaces: js.Array[Namespace] = null): ListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces)
    __obj.asInstanceOf[ListNamespacesResponse]
  }
}

