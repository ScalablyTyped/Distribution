package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendServiceGroupHealth extends js.Object {
  var healthStatus: js.UndefOr[js.Array[HealthStatus]] = js.native
  /** [Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of backend services. */
  var kind: js.UndefOr[String] = js.native
}

object BackendServiceGroupHealth {
  @scala.inline
  def apply(): BackendServiceGroupHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceGroupHealth]
  }
  @scala.inline
  implicit class BackendServiceGroupHealthOps[Self <: BackendServiceGroupHealth] (val x: Self) extends AnyVal {
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
    def setHealthStatusVarargs(value: HealthStatus*): Self = this.set("healthStatus", js.Array(value :_*))
    @scala.inline
    def setHealthStatus(value: js.Array[HealthStatus]): Self = this.set("healthStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthStatus: Self = this.set("healthStatus", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

