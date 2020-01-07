package typings.googleapis.buildSrcApisTpuV1alpha1Mod.tpu_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for ReimageNode.
  */
@js.native
trait Schema$ReimageNodeRequest extends js.Object {
  /**
    * The version for reimage to create.
    */
  var tensorflowVersion: js.UndefOr[String] = js.native
}

object Schema$ReimageNodeRequest {
  @scala.inline
  def apply(tensorflowVersion: String = null): Schema$ReimageNodeRequest = {
    val __obj = js.Dynamic.literal()
    if (tensorflowVersion != null) __obj.updateDynamic("tensorflowVersion")(tensorflowVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReimageNodeRequest]
  }
}

