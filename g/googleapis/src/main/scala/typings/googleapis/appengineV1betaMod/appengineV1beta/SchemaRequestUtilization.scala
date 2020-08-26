package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target scaling by request utilization. Only applicable in the App Engine
  * flexible environment.
  */
@js.native
trait SchemaRequestUtilization extends js.Object {
  /**
    * Target number of concurrent requests.
    */
  var targetConcurrentRequests: js.UndefOr[Double] = js.native
  /**
    * Target requests per second.
    */
  var targetRequestCountPerSecond: js.UndefOr[Double] = js.native
}

object SchemaRequestUtilization {
  @scala.inline
  def apply(): SchemaRequestUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestUtilization]
  }
  @scala.inline
  implicit class SchemaRequestUtilizationOps[Self <: SchemaRequestUtilization] (val x: Self) extends AnyVal {
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
    def setTargetConcurrentRequests(value: Double): Self = this.set("targetConcurrentRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetConcurrentRequests: Self = this.set("targetConcurrentRequests", js.undefined)
    @scala.inline
    def setTargetRequestCountPerSecond(value: Double): Self = this.set("targetRequestCountPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetRequestCountPerSecond: Self = this.set("targetRequestCountPerSecond", js.undefined)
  }
  
}

