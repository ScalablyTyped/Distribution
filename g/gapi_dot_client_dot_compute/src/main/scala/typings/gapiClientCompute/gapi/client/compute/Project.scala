package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  /** Metadata key/value pairs available to all instances contained in this project. See Custom metadata for more information. */
  var commonInstanceMetadata: js.UndefOr[Metadata] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** [Output Only] Default service account used by VMs running in this project. */
  var defaultServiceAccount: js.UndefOr[String] = js.undefined
  /** An optional textual description of the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** Restricted features enabled for use on this project. */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server. This is not the project ID, and is just a unique ID
    * used by Compute Engine to identify resources.
    */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#project for projects. */
  var kind: js.UndefOr[String] = js.undefined
  /** The project ID. For example: my-example-project. Use the project ID to make requests to Compute Engine. */
  var name: js.UndefOr[String] = js.undefined
  /** [Output Only] Quotas assigned to this project. */
  var quotas: js.UndefOr[js.Array[Quota]] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are stored. */
  var usageExportLocation: js.UndefOr[UsageExportLocation] = js.undefined
  /** [Output Only] The role this project has in a shared VPC configuration. Currently only HOST projects are differentiated. */
  var xpnProjectStatus: js.UndefOr[String] = js.undefined
}

object Project {
  @scala.inline
  def apply(
    commonInstanceMetadata: Metadata = null,
    creationTimestamp: String = null,
    defaultServiceAccount: String = null,
    description: String = null,
    enabledFeatures: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    quotas: js.Array[Quota] = null,
    selfLink: String = null,
    usageExportLocation: UsageExportLocation = null,
    xpnProjectStatus: String = null
  ): Project = {
    val __obj = js.Dynamic.literal()
    if (commonInstanceMetadata != null) __obj.updateDynamic("commonInstanceMetadata")(commonInstanceMetadata.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Project]
  }
}

