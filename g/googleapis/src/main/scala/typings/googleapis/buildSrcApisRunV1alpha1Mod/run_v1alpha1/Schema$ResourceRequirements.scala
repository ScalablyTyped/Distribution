package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceRequirements describes the compute resource requirements.
  */
@js.native
trait Schema$ResourceRequirements extends js.Object {
  /**
    * Limits describes the maximum amount of compute resources allowed. The
    * values of the map is string form of the &#39;quantity&#39; k8s type:
    * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var limits: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Limits describes the maximum amount of compute resources allowed. This is
    * a temporary field created to migrate away from the map&lt;string,
    * Quantity&gt; limits field. This is done to become compliant with k8s
    * style API. This field is deprecated in favor of limits field.
    */
  var limitsInMap: js.UndefOr[StringDictionary[Schema$Quantity]] = js.native
  /**
    * Requests describes the minimum amount of compute resources required. If
    * Requests is omitted for a container, it defaults to Limits if that is
    * explicitly specified, otherwise to an implementation-defined value. The
    * values of the map is string form of the &#39;quantity&#39; k8s type:
    * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var requests: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Requests describes the minimum amount of compute resources required. If
    * Requests is omitted for a container, it defaults to Limits if that is
    * explicitly specified, otherwise to an implementation-defined value. This
    * is a temporary field created to migrate away from the map&lt;string,
    * Quantity&gt; requests field. This is done to become compliant with k8s
    * style API. This field is deprecated in favor of requests field.
    */
  var requestsInMap: js.UndefOr[StringDictionary[Schema$Quantity]] = js.native
}

object Schema$ResourceRequirements {
  @scala.inline
  def apply(
    limits: StringDictionary[String] = null,
    limitsInMap: StringDictionary[Schema$Quantity] = null,
    requests: StringDictionary[String] = null,
    requestsInMap: StringDictionary[Schema$Quantity] = null
  ): Schema$ResourceRequirements = {
    val __obj = js.Dynamic.literal()
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (limitsInMap != null) __obj.updateDynamic("limitsInMap")(limitsInMap.asInstanceOf[js.Any])
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    if (requestsInMap != null) __obj.updateDynamic("requestsInMap")(requestsInMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceRequirements]
  }
}

