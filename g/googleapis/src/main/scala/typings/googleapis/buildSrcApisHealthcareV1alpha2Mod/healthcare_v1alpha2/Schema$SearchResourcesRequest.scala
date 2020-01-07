package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to search the resources in the specified FHIR store.
  */
@js.native
trait Schema$SearchResourcesRequest extends js.Object {
  /**
    * The type of the resource to search.
    */
  var resourceType: js.UndefOr[String] = js.native
}

object Schema$SearchResourcesRequest {
  @scala.inline
  def apply(resourceType: String = null): Schema$SearchResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchResourcesRequest]
  }
}

