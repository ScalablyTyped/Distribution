package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  /** Metadata key/value pairs available to all instances contained in this project. See Custom metadata for more information. */
  var commonInstanceMetadata: js.UndefOr[Metadata] = js.native
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  /** [Output Only] Default service account used by VMs running in this project. */
  var defaultServiceAccount: js.UndefOr[String] = js.native
  /** An optional textual description of the resource. */
  var description: js.UndefOr[String] = js.native
  /** Restricted features enabled for use on this project. */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server. This is not the project ID, and is just a unique ID
    * used by Compute Engine to identify resources.
    */
  var id: js.UndefOr[String] = js.native
  /** [Output Only] Type of the resource. Always compute#project for projects. */
  var kind: js.UndefOr[String] = js.native
  /** The project ID. For example: my-example-project. Use the project ID to make requests to Compute Engine. */
  var name: js.UndefOr[String] = js.native
  /** [Output Only] Quotas assigned to this project. */
  var quotas: js.UndefOr[js.Array[Quota]] = js.native
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are stored. */
  var usageExportLocation: js.UndefOr[UsageExportLocation] = js.native
  /** [Output Only] The role this project has in a shared VPC configuration. Currently only HOST projects are differentiated. */
  var xpnProjectStatus: js.UndefOr[String] = js.native
}

object Project {
  @scala.inline
  def apply(): Project = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Project]
  }
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
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
    def setCommonInstanceMetadata(value: Metadata): Self = this.set("commonInstanceMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonInstanceMetadata: Self = this.set("commonInstanceMetadata", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDefaultServiceAccount(value: String): Self = this.set("defaultServiceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultServiceAccount: Self = this.set("defaultServiceAccount", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnabledFeaturesVarargs(value: String*): Self = this.set("enabledFeatures", js.Array(value :_*))
    @scala.inline
    def setEnabledFeatures(value: js.Array[String]): Self = this.set("enabledFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledFeatures: Self = this.set("enabledFeatures", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setQuotasVarargs(value: Quota*): Self = this.set("quotas", js.Array(value :_*))
    @scala.inline
    def setQuotas(value: js.Array[Quota]): Self = this.set("quotas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotas: Self = this.set("quotas", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setUsageExportLocation(value: UsageExportLocation): Self = this.set("usageExportLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageExportLocation: Self = this.set("usageExportLocation", js.undefined)
    @scala.inline
    def setXpnProjectStatus(value: String): Self = this.set("xpnProjectStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXpnProjectStatus: Self = this.set("xpnProjectStatus", js.undefined)
  }
  
}

