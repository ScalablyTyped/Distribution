package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service with manual scaling runs continuously, allowing you to perform
  * complex initialization and rely on the state of its memory over time.
  */
@js.native
trait SchemaManualScaling extends js.Object {
  /**
    * Number of instances to assign to the service at the start. This number
    * can later be altered by using the Modules API
    * (https://cloud.google.com/appengine/docs/python/modules/functions)
    * set_num_instances() function.
    */
  var instances: js.UndefOr[Double] = js.native
}

object SchemaManualScaling {
  @scala.inline
  def apply(): SchemaManualScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManualScaling]
  }
  @scala.inline
  implicit class SchemaManualScalingOps[Self <: SchemaManualScaling] (val x: Self) extends AnyVal {
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
    def setInstances(value: Double): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
  }
  
}

