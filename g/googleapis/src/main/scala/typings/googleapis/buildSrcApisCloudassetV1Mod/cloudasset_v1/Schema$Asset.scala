package typings.googleapis.buildSrcApisCloudassetV1Mod.cloudasset_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud asset. This includes all Google Cloud Platform resources, Cloud IAM
  * policies, and other non-GCP assets.
  */
@js.native
trait Schema$Asset extends js.Object {
  /**
    * Type of the asset. Example: &quot;compute.googleapis.com/Disk&quot;.
    */
  var assetType: js.UndefOr[String] = js.native
  /**
    * Representation of the actual Cloud IAM policy set on a cloud resource.
    * For each resource, there must be at most one Cloud IAM policy set on it.
    */
  var iamPolicy: js.UndefOr[Schema$Policy] = js.native
  /**
    * The full name of the asset. For example:
    * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
    * See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
    * for more information.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Representation of the resource.
    */
  var resource: js.UndefOr[Schema$Resource] = js.native
}

object Schema$Asset {
  @scala.inline
  def apply(
    assetType: String = null,
    iamPolicy: Schema$Policy = null,
    name: String = null,
    resource: Schema$Resource = null
  ): Schema$Asset = {
    val __obj = js.Dynamic.literal()
    if (assetType != null) __obj.updateDynamic("assetType")(assetType.asInstanceOf[js.Any])
    if (iamPolicy != null) __obj.updateDynamic("iamPolicy")(iamPolicy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Asset]
  }
}

