package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to ListNamespacesRequest that contains all the project&#39;s
  * namespaces.
  */
@js.native
trait Schema$ListNamespacesResponse extends js.Object {
  /**
    * The attachments that corresponded to the request params.
    */
  var namespaces: js.UndefOr[js.Array[Schema$Namespace]] = js.native
}

object Schema$ListNamespacesResponse {
  @scala.inline
  def apply(namespaces: js.Array[Schema$Namespace] = null): Schema$ListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListNamespacesResponse]
  }
}

