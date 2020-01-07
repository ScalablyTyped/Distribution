package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PoolsListResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var resources: js.UndefOr[js.Array[Schema$Pool]] = js.native
}

object Schema$PoolsListResponse {
  @scala.inline
  def apply(nextPageToken: String = null, resources: js.Array[Schema$Pool] = null): Schema$PoolsListResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PoolsListResponse]
  }
}

