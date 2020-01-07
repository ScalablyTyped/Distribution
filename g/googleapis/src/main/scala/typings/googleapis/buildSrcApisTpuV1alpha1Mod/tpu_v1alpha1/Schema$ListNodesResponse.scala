package typings.googleapis.buildSrcApisTpuV1alpha1Mod.tpu_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListNodes.
  */
@js.native
trait Schema$ListNodesResponse extends js.Object {
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The listed nodes.
    */
  var nodes: js.UndefOr[js.Array[Schema$Node]] = js.native
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ListNodesResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    nodes: js.Array[Schema$Node] = null,
    unreachable: js.Array[String] = null
  ): Schema$ListNodesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (unreachable != null) __obj.updateDynamic("unreachable")(unreachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListNodesResponse]
  }
}

