package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedInstanceInstanceHealth extends js.Object {
  /**
    * [Output Only] The current detailed instance health state.
    */
  var detailedHealthState: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL for the health check that verifies whether the
    * instance is healthy.
    */
  var healthCheck: js.UndefOr[String] = js.native
  /**
    * [Output Only] The current instance health state.
    */
  var healthState: js.UndefOr[String] = js.native
}

object SchemaManagedInstanceInstanceHealth {
  @scala.inline
  def apply(): SchemaManagedInstanceInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceInstanceHealth]
  }
  @scala.inline
  implicit class SchemaManagedInstanceInstanceHealthOps[Self <: SchemaManagedInstanceInstanceHealth] (val x: Self) extends AnyVal {
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
    def setDetailedHealthState(value: String): Self = this.set("detailedHealthState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailedHealthState: Self = this.set("detailedHealthState", js.undefined)
    @scala.inline
    def setHealthCheck(value: String): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
    @scala.inline
    def setHealthState(value: String): Self = this.set("healthState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthState: Self = this.set("healthState", js.undefined)
  }
  
}

