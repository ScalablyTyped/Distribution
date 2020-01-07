package typings.googleapis.buildSrcApisBinaryauthorizationV1beta1Mod.binaryauthorization_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A policy for container image binary authorization.
  */
@js.native
trait Schema$Policy extends js.Object {
  /**
    * Optional. Admission policy whitelisting. A matching admission request
    * will always be permitted. This feature is typically used to exclude
    * Google or third-party infrastructure images from Binary Authorization
    * policies.
    */
  var admissionWhitelistPatterns: js.UndefOr[js.Array[Schema$AdmissionWhitelistPattern]] = js.native
  /**
    * Optional. Per-cluster admission rules. Cluster spec format:
    * `location.clusterId`. There can be at most one admission rule per cluster
    * spec. A `location` is either a compute zone (e.g. us-central1-a) or a
    * region (e.g. us-central1). For `clusterId` syntax restrictions see
    * https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.
    */
  var clusterAdmissionRules: js.UndefOr[StringDictionary[Schema$AdmissionRule]] = js.native
  /**
    * Required. Default admission rule for a cluster without a per-cluster,
    * per- kubernetes-service-account, or per-istio-service-identity admission
    * rule.
    */
  var defaultAdmissionRule: js.UndefOr[Schema$AdmissionRule] = js.native
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

object Schema$Policy {
  @scala.inline
  def apply(
    admissionWhitelistPatterns: js.Array[Schema$AdmissionWhitelistPattern] = null,
    clusterAdmissionRules: StringDictionary[Schema$AdmissionRule] = null,
    defaultAdmissionRule: Schema$AdmissionRule = null,
    description: String = null,
    globalPolicyEvaluationMode: String = null,
    name: String = null,
    updateTime: String = null
  ): Schema$Policy = {
    val __obj = js.Dynamic.literal()
    if (admissionWhitelistPatterns != null) __obj.updateDynamic("admissionWhitelistPatterns")(admissionWhitelistPatterns.asInstanceOf[js.Any])
    if (clusterAdmissionRules != null) __obj.updateDynamic("clusterAdmissionRules")(clusterAdmissionRules.asInstanceOf[js.Any])
    if (defaultAdmissionRule != null) __obj.updateDynamic("defaultAdmissionRule")(defaultAdmissionRule.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (globalPolicyEvaluationMode != null) __obj.updateDynamic("globalPolicyEvaluationMode")(globalPolicyEvaluationMode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Policy]
  }
}

