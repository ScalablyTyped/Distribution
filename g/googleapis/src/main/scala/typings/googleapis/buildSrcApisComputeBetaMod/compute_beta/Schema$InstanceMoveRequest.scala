package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceMoveRequest extends js.Object {
  /**
    * The URL of the destination zone to move the instance. This can be a full
    * or partial URL. For example, the following are all valid URLs to a zone:
    * - https://www.googleapis.com/compute/v1/projects/project/zones/zone  -
    * projects/project/zones/zone  - zones/zone
    */
  var destinationZone: js.UndefOr[String] = js.native
  /**
    * The URL of the target instance to move. This can be a full or partial
    * URL. For example, the following are all valid URLs to an instance:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance
    * - projects/project/zones/zone/instances/instance  -
    * zones/zone/instances/instance
    */
  var targetInstance: js.UndefOr[String] = js.native
}

object Schema$InstanceMoveRequest {
  @scala.inline
  def apply(destinationZone: String = null, targetInstance: String = null): Schema$InstanceMoveRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationZone != null) __obj.updateDynamic("destinationZone")(destinationZone.asInstanceOf[js.Any])
    if (targetInstance != null) __obj.updateDynamic("targetInstance")(targetInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceMoveRequest]
  }
}

