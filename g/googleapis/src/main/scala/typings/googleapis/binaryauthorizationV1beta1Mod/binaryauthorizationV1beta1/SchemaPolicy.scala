package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A policy for container image binary authorization.
  */
@js.native
trait SchemaPolicy extends js.Object {
  /**
    * Optional. Admission policy whitelisting. A matching admission request
    * will always be permitted. This feature is typically used to exclude
    * Google or third-party infrastructure images from Binary Authorization
    * policies.
    */
  var admissionWhitelistPatterns: js.UndefOr[js.Array[SchemaAdmissionWhitelistPattern]] = js.native
  /**
    * Optional. Per-cluster admission rules. Cluster spec format:
    * `location.clusterId`. There can be at most one admission rule per cluster
    * spec. A `location` is either a compute zone (e.g. us-central1-a) or a
    * region (e.g. us-central1). For `clusterId` syntax restrictions see
    * https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.
    */
  var clusterAdmissionRules: js.UndefOr[StringDictionary[SchemaAdmissionRule]] = js.native
  /**
    * Required. Default admission rule for a cluster without a per-cluster,
    * per- kubernetes-service-account, or per-istio-service-identity admission
    * rule.
    */
  var defaultAdmissionRule: js.UndefOr[SchemaAdmissionRule] = js.native
  /**
    * Optional. A descriptive comment.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. Controls the evaluation of a Google-maintained global admission
    * policy for common system-level images. Images not covered by the global
    * policy will be subject to the project admission policy. This setting has
    * no effect when specified inside a global admission policy.
    */
  var globalPolicyEvaluationMode: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name, in the format `projects/x/policy`. There
    * is at most one policy per project.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Time when the policy was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaPolicy {
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  @scala.inline
  implicit class SchemaPolicyOps[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
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
    def setAdmissionWhitelistPatternsVarargs(value: SchemaAdmissionWhitelistPattern*): Self = this.set("admissionWhitelistPatterns", js.Array(value :_*))
    @scala.inline
    def setAdmissionWhitelistPatterns(value: js.Array[SchemaAdmissionWhitelistPattern]): Self = this.set("admissionWhitelistPatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdmissionWhitelistPatterns: Self = this.set("admissionWhitelistPatterns", js.undefined)
    @scala.inline
    def setClusterAdmissionRules(value: StringDictionary[SchemaAdmissionRule]): Self = this.set("clusterAdmissionRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterAdmissionRules: Self = this.set("clusterAdmissionRules", js.undefined)
    @scala.inline
    def setDefaultAdmissionRule(value: SchemaAdmissionRule): Self = this.set("defaultAdmissionRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAdmissionRule: Self = this.set("defaultAdmissionRule", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGlobalPolicyEvaluationMode(value: String): Self = this.set("globalPolicyEvaluationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalPolicyEvaluationMode: Self = this.set("globalPolicyEvaluationMode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

