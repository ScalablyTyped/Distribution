package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Project resource. For an overview of projects, see  Cloud Platform
  * Resource Hierarchy. (== resource_for v1.projects ==) (== resource_for
  * beta.projects ==)
  */
@js.native
trait SchemaProject extends js.Object {
  /**
    * Metadata key/value pairs available to all instances contained in this
    * project. See Custom metadata for more information.
    */
  var commonInstanceMetadata: js.UndefOr[SchemaMetadata] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * This signifies the default network tier used for configuring resources of
    * the project and can only take the following values: PREMIUM, STANDARD.
    * Initially the default network tier is PREMIUM.
    */
  var defaultNetworkTier: js.UndefOr[String] = js.native
  /**
    * [Output Only] Default service account used by VMs running in this
    * project.
    */
  var defaultServiceAccount: js.UndefOr[String] = js.native
  /**
    * An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Restricted features enabled for use on this project.
    */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server. This is not the project ID, and is just a unique
    * ID used by Compute Engine to identify resources.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#project for projects.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The project ID. For example: my-example-project. Use the project ID to
    * make requests to Compute Engine.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] Quotas assigned to this project.
    */
  var quotas: js.UndefOr[js.Array[SchemaQuota]] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The naming prefix for daily usage reports and the Google Cloud Storage
    * bucket where they are stored.
    */
  var usageExportLocation: js.UndefOr[SchemaUsageExportLocation] = js.native
  /**
    * [Output Only] The role this project has in a shared VPC configuration.
    * Currently only HOST projects are differentiated.
    */
  var xpnProjectStatus: js.UndefOr[String] = js.native
}

object SchemaProject {
  @scala.inline
  def apply(
    commonInstanceMetadata: SchemaMetadata = null,
    creationTimestamp: String = null,
    defaultNetworkTier: String = null,
    defaultServiceAccount: String = null,
    description: String = null,
    enabledFeatures: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    quotas: js.Array[SchemaQuota] = null,
    selfLink: String = null,
    usageExportLocation: SchemaUsageExportLocation = null,
    xpnProjectStatus: String = null
  ): SchemaProject = {
    val __obj = js.Dynamic.literal()
    if (commonInstanceMetadata != null) __obj.updateDynamic("commonInstanceMetadata")(commonInstanceMetadata.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (defaultNetworkTier != null) __obj.updateDynamic("defaultNetworkTier")(defaultNetworkTier.asInstanceOf[js.Any])
    if (defaultServiceAccount != null) __obj.updateDynamic("defaultServiceAccount")(defaultServiceAccount.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enabledFeatures != null) __obj.updateDynamic("enabledFeatures")(enabledFeatures.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (quotas != null) __obj.updateDynamic("quotas")(quotas.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (usageExportLocation != null) __obj.updateDynamic("usageExportLocation")(usageExportLocation.asInstanceOf[js.Any])
    if (xpnProjectStatus != null) __obj.updateDynamic("xpnProjectStatus")(xpnProjectStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProject]
  }
}

