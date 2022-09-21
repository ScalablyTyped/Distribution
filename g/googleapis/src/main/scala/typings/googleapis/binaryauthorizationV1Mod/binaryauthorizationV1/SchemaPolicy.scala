package typings.googleapis.binaryauthorizationV1Mod.binaryauthorizationV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicy extends StObject {
  
  /**
    * Optional. Admission policy allowlisting. A matching admission request will always be permitted. This feature is typically used to exclude Google or third-party infrastructure images from Binary Authorization policies.
    */
  var admissionWhitelistPatterns: js.UndefOr[js.Array[SchemaAdmissionWhitelistPattern]] = js.undefined
  
  /**
    * Optional. Per-cluster admission rules. Cluster spec format: `location.clusterId`. There can be at most one admission rule per cluster spec. A `location` is either a compute zone (e.g. us-central1-a) or a region (e.g. us-central1). For `clusterId` syntax restrictions see https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.
    */
  var clusterAdmissionRules: js.UndefOr[StringDictionary[SchemaAdmissionRule] | Null] = js.undefined
  
  /**
    * Required. Default admission rule for a cluster without a per-cluster, per- kubernetes-service-account, or per-istio-service-identity admission rule.
    */
  var defaultAdmissionRule: js.UndefOr[SchemaAdmissionRule] = js.undefined
  
  /**
    * Optional. A descriptive comment.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A checksum, returned by the server, that can be sent on update requests to ensure the policy has an up-to-date value before attempting to update it. See https://google.aip.dev/154.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Controls the evaluation of a Google-maintained global admission policy for common system-level images. Images not covered by the global policy will be subject to the project admission policy. This setting has no effect when specified inside a global admission policy.
    */
  var globalPolicyEvaluationMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Per-istio-service-identity admission rules. Istio service identity spec format: `spiffe:///ns//sa/` or `/ns//sa/` e.g. `spiffe://example.com/ns/test-ns/sa/default`
    */
  var istioServiceIdentityAdmissionRules: js.UndefOr[StringDictionary[SchemaAdmissionRule] | Null] = js.undefined
  
  /**
    * Optional. Per-kubernetes-namespace admission rules. K8s namespace spec format: `[a-z.-]+`, e.g. `some-namespace`
    */
  var kubernetesNamespaceAdmissionRules: js.UndefOr[StringDictionary[SchemaAdmissionRule] | Null] = js.undefined
  
  /**
    * Optional. Per-kubernetes-service-account admission rules. Service account spec format: `namespace:serviceaccount`. e.g. `test-ns:default`
    */
  var kubernetesServiceAccountAdmissionRules: js.UndefOr[StringDictionary[SchemaAdmissionRule] | Null] = js.undefined
  
  /**
    * Output only. The resource name, in the format `projects/x/policy`. There is at most one policy per project.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time when the policy was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPolicy {
  
  inline def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  
  extension [Self <: SchemaPolicy](x: Self) {
    
    inline def setAdmissionWhitelistPatterns(value: js.Array[SchemaAdmissionWhitelistPattern]): Self = StObject.set(x, "admissionWhitelistPatterns", value.asInstanceOf[js.Any])
    
    inline def setAdmissionWhitelistPatternsUndefined: Self = StObject.set(x, "admissionWhitelistPatterns", js.undefined)
    
    inline def setAdmissionWhitelistPatternsVarargs(value: SchemaAdmissionWhitelistPattern*): Self = StObject.set(x, "admissionWhitelistPatterns", js.Array(value*))
    
    inline def setClusterAdmissionRules(value: StringDictionary[SchemaAdmissionRule]): Self = StObject.set(x, "clusterAdmissionRules", value.asInstanceOf[js.Any])
    
    inline def setClusterAdmissionRulesNull: Self = StObject.set(x, "clusterAdmissionRules", null)
    
    inline def setClusterAdmissionRulesUndefined: Self = StObject.set(x, "clusterAdmissionRules", js.undefined)
    
    inline def setDefaultAdmissionRule(value: SchemaAdmissionRule): Self = StObject.set(x, "defaultAdmissionRule", value.asInstanceOf[js.Any])
    
    inline def setDefaultAdmissionRuleUndefined: Self = StObject.set(x, "defaultAdmissionRule", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setGlobalPolicyEvaluationMode(value: String): Self = StObject.set(x, "globalPolicyEvaluationMode", value.asInstanceOf[js.Any])
    
    inline def setGlobalPolicyEvaluationModeNull: Self = StObject.set(x, "globalPolicyEvaluationMode", null)
    
    inline def setGlobalPolicyEvaluationModeUndefined: Self = StObject.set(x, "globalPolicyEvaluationMode", js.undefined)
    
    inline def setIstioServiceIdentityAdmissionRules(value: StringDictionary[SchemaAdmissionRule]): Self = StObject.set(x, "istioServiceIdentityAdmissionRules", value.asInstanceOf[js.Any])
    
    inline def setIstioServiceIdentityAdmissionRulesNull: Self = StObject.set(x, "istioServiceIdentityAdmissionRules", null)
    
    inline def setIstioServiceIdentityAdmissionRulesUndefined: Self = StObject.set(x, "istioServiceIdentityAdmissionRules", js.undefined)
    
    inline def setKubernetesNamespaceAdmissionRules(value: StringDictionary[SchemaAdmissionRule]): Self = StObject.set(x, "kubernetesNamespaceAdmissionRules", value.asInstanceOf[js.Any])
    
    inline def setKubernetesNamespaceAdmissionRulesNull: Self = StObject.set(x, "kubernetesNamespaceAdmissionRules", null)
    
    inline def setKubernetesNamespaceAdmissionRulesUndefined: Self = StObject.set(x, "kubernetesNamespaceAdmissionRules", js.undefined)
    
    inline def setKubernetesServiceAccountAdmissionRules(value: StringDictionary[SchemaAdmissionRule]): Self = StObject.set(x, "kubernetesServiceAccountAdmissionRules", value.asInstanceOf[js.Any])
    
    inline def setKubernetesServiceAccountAdmissionRulesNull: Self = StObject.set(x, "kubernetesServiceAccountAdmissionRules", null)
    
    inline def setKubernetesServiceAccountAdmissionRulesUndefined: Self = StObject.set(x, "kubernetesServiceAccountAdmissionRules", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
