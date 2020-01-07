package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud SCC managed properties. These properties are managed by Cloud SCC and
  * cannot be modified by the user.
  */
@js.native
trait Schema$SecurityCenterProperties extends js.Object {
  /**
    * The full resource name of the GCP resource this asset represents. This
    * field is immutable after create time. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * Owners of the Google Cloud resource.
    */
  var resourceOwners: js.UndefOr[js.Array[String]] = js.native
  /**
    * The full resource name of the immediate parent of the resource. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceParent: js.UndefOr[String] = js.native
  /**
    * The full resource name of the project the resource belongs to. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceProject: js.UndefOr[String] = js.native
  /**
    * The type of the GCP resource. Examples include: APPLICATION, PROJECT, and
    * ORGANIZATION. This is a case insensitive field defined by Cloud SCC
    * and/or the producer of the resource and is immutable after create time.
    */
  var resourceType: js.UndefOr[String] = js.native
}

object Schema$SecurityCenterProperties {
  @scala.inline
  def apply(
    resourceName: String = null,
    resourceOwners: js.Array[String] = null,
    resourceParent: String = null,
    resourceProject: String = null,
    resourceType: String = null
  ): Schema$SecurityCenterProperties = {
    val __obj = js.Dynamic.literal()
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (resourceOwners != null) __obj.updateDynamic("resourceOwners")(resourceOwners.asInstanceOf[js.Any])
    if (resourceParent != null) __obj.updateDynamic("resourceParent")(resourceParent.asInstanceOf[js.Any])
    if (resourceProject != null) __obj.updateDynamic("resourceProject")(resourceProject.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityCenterProperties]
  }
}

