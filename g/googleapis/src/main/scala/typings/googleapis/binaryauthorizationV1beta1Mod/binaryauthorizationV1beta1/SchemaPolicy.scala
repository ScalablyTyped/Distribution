package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A policy for container image binary authorization.
  */
trait SchemaPolicy extends StObject {
  
  /**
    * Optional. Admission policy whitelisting. A matching admission request
    * will always be permitted. This feature is typically used to exclude
    * Google or third-party infrastructure images from Binary Authorization
    * policies.
    */
  var admissionWhitelistPatterns: js.UndefOr[js.Array[SchemaAdmissionWhitelistPattern]] = js.undefined
  
  /**
    * Optional. Per-cluster admission rules. Cluster spec format:
    * `location.clusterId`. There can be at most one admission rule per cluster
    * spec. A `location` is either a compute zone (e.g. us-central1-a) or a
    * region (e.g. us-central1). For `clusterId` syntax restrictions see
    * https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.
    */
  var clusterAdmissionRules: js.UndefOr[StringDictionary[SchemaAdmissionRule]] = js.undefined
  
  /**
    * Required. Default admission rule for a cluster without a per-cluster,
    * per- kubernetes-service-account, or per-istio-service-identity admission
    * rule.
    */
  var defaultAdmissionRule: js.UndefOr[SchemaAdmissionRule] = js.undefined
  
  /**
    * Optional. A descriptive comment.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Controls the evaluation of a Google-maintained global admission
    * policy for common system-level images. Images not covered by the global
    * policy will be subject to the project admission policy. This setting has
    * no effect when specified inside a global admission policy.
    */
  var globalPolicyEvaluationMode: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The resource name, in the format `projects/x/policy`. There
    * is at most one policy per project.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Time when the policy was last updated.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaPolicy {
  
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  
  @scala.inline
  implicit class SchemaPolicyMutableBuilder[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmissionWhitelistPatterns(value: js.Array[SchemaAdmissionWhitelistPattern]): Self = StObject.set(x, "admissionWhitelistPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdmissionWhitelistPatternsUndefined: Self = StObject.set(x, "admissionWhitelistPatterns", js.undefined)
    
    @scala.inline
    def setAdmissionWhitelistPatternsVarargs(value: SchemaAdmissionWhitelistPattern*): Self = StObject.set(x, "admissionWhitelistPatterns", js.Array(value :_*))
    
    @scala.inline
    def setClusterAdmissionRules(value: StringDictionary[SchemaAdmissionRule]): Self = StObject.set(x, "clusterAdmissionRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterAdmissionRulesUndefined: Self = StObject.set(x, "clusterAdmissionRules", js.undefined)
    
    @scala.inline
    def setDefaultAdmissionRule(value: SchemaAdmissionRule): Self = StObject.set(x, "defaultAdmissionRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAdmissionRuleUndefined: Self = StObject.set(x, "defaultAdmissionRule", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGlobalPolicyEvaluationMode(value: String): Self = StObject.set(x, "globalPolicyEvaluationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalPolicyEvaluationModeUndefined: Self = StObject.set(x, "globalPolicyEvaluationMode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
