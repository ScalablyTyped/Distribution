package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BackendServiceGroupHealth extends js.Object {
  /**
    * Metadata defined as annotations on the network endpoint group.
    */
  var annotations: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Health state of the backend instances or endpoints in requested instance
    * or network endpoint group, determined based on configured health checks.
    */
  var healthStatus: js.UndefOr[js.Array[Schema$HealthStatus]] = js.native
  /**
    * [Output Only] Type of resource. Always compute#backendServiceGroupHealth
    * for the health of backend services.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$BackendServiceGroupHealth {
  @scala.inline
  def apply(
    annotations: StringDictionary[String] = null,
    healthStatus: js.Array[Schema$HealthStatus] = null,
    kind: String = null
  ): Schema$BackendServiceGroupHealth = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BackendServiceGroupHealth]
  }
}

