package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceMoveRequest extends js.Object {
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

object SchemaInstanceMoveRequest {
  @scala.inline
  def apply(): SchemaInstanceMoveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceMoveRequest]
  }
  @scala.inline
  implicit class SchemaInstanceMoveRequestOps[Self <: SchemaInstanceMoveRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationZone(value: String): Self = this.set("destinationZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationZone: Self = this.set("destinationZone", js.undefined)
    @scala.inline
    def setTargetInstance(value: String): Self = this.set("targetInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetInstance: Self = this.set("targetInstance", js.undefined)
  }
  
}

