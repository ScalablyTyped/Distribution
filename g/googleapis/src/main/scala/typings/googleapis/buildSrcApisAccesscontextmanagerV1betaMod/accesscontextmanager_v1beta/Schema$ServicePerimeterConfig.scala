package typings.googleapis.buildSrcApisAccesscontextmanagerV1betaMod.accesscontextmanager_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `ServicePerimeterConfig` specifies a set of GCP resources that describe
  * specific Service Perimeter configuration.
  */
@js.native
trait Schema$ServicePerimeterConfig extends js.Object {
  /**
    * A list of `AccessLevel` resource names that allow resources within the
    * `ServicePerimeter` to be accessed from the internet. `AccessLevels`
    * listed must be in the same policy as this `ServicePerimeter`. Referencing
    * a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names
    * are listed, resources within the perimeter can only be accessed via GCP
    * calls with request origins within the perimeter. Example:
    * `&quot;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&quot;`. For Service
    * Perimeter Bridge, must be empty.
    */
  var accessLevels: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of GCP resources that are inside of the service perimeter.
    * Currently only projects are allowed. Format: `projects/{project_number}`
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
  /**
    * GCP services that are subject to the Service Perimeter restrictions. Must
    * contain a list of services. For example, if `storage.googleapis.com` is
    * specified, access to the storage buckets inside the perimeter must meet
    * the perimeter&#39;s access restrictions.
    */
  var restrictedServices: js.UndefOr[js.Array[String]] = js.native
  /**
    * GCP services that are not subject to the Service Perimeter restrictions.
    * Deprecated. Must be set to a single wildcard &quot;*&quot;.  The wildcard
    * means that unless explicitly specified by &quot;restricted_services&quot;
    * list, any service is treated as unrestricted.
    */
  var unrestrictedServices: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ServicePerimeterConfig {
  @scala.inline
  def apply(
    accessLevels: js.Array[String] = null,
    resources: js.Array[String] = null,
    restrictedServices: js.Array[String] = null,
    unrestrictedServices: js.Array[String] = null
  ): Schema$ServicePerimeterConfig = {
    val __obj = js.Dynamic.literal()
    if (accessLevels != null) __obj.updateDynamic("accessLevels")(accessLevels.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (restrictedServices != null) __obj.updateDynamic("restrictedServices")(restrictedServices.asInstanceOf[js.Any])
    if (unrestrictedServices != null) __obj.updateDynamic("unrestrictedServices")(unrestrictedServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServicePerimeterConfig]
  }
}

