package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.AuditConfigDelta
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.Binding
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.BindingDelta
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.GetIamPolicyRequest
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.GetPolicyOptions
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.IAMPolicy
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.Policy
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.PolicyDelta
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.SetIamPolicyRequest
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.TestIamPermissionsRequest
import typings.googleGax.mod.fallback.IamProtos.google.iam.v1.TestIamPermissionsResponse
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofv1AuditConfigDelta extends StObject {
  
  /** Represents an AuditConfigDelta. */
  var AuditConfigDelta: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.iam.v1.AuditConfigDelta] & TypeofAuditConfigDelta
  
  /** Represents a Binding. */
  var Binding: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.iam.v1.Binding] & TypeofBinding
  
  /** Represents a BindingDelta. */
  var BindingDelta: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.iam.v1.BindingDelta] & TypeofBindingDelta
  
  /** Represents a GetIamPolicyRequest. */
  var GetIamPolicyRequest: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.iam.v1.GetIamPolicyRequest] & TypeofGetIamPolicyRequest
  
  /** Represents a GetPolicyOptions. */
  var GetPolicyOptions: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.iam.v1.GetPolicyOptions] & TypeofGetPolicyOptions
  
  /** Represents a IAMPolicy */
  var IAMPolicy: (Instantiable1[
    /* rpcImpl */ RPCImpl, 
    typings.googleGax.mod.fallback.IamProtos.google.iam.v1.IAMPolicy
  ]) & TypeofIAMPolicy
  
  /** Represents a Policy. */
  var Policy: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.iam.v1.Policy] & TypeofPolicy
  
  /** Represents a PolicyDelta. */
  var PolicyDelta: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.iam.v1.PolicyDelta] & TypeofPolicyDelta
  
  /** Represents a SetIamPolicyRequest. */
  var SetIamPolicyRequest: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.iam.v1.SetIamPolicyRequest] & TypeofSetIamPolicyRequest
  
  /** Represents a TestIamPermissionsRequest. */
  var TestIamPermissionsRequest: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.iam.v1.TestIamPermissionsRequest] & TypeofTestIamPermissionsR
  
  /** Represents a TestIamPermissionsResponse. */
  var TestIamPermissionsResponse: (Instantiable0[
    typings.googleGax.mod.fallback.IamProtos.google.iam.v1.TestIamPermissionsResponse
  ]) & TypeofTestIamPermissionsRCreate
  
  /** Namespace logging. */
  val logging: TypeofloggingAuditData
}
object Typeofv1AuditConfigDelta {
  
  inline def apply(
    AuditConfigDelta: Instantiable0[AuditConfigDelta] & TypeofAuditConfigDelta,
    Binding: Instantiable0[Binding] & TypeofBinding,
    BindingDelta: Instantiable0[BindingDelta] & TypeofBindingDelta,
    GetIamPolicyRequest: Instantiable0[GetIamPolicyRequest] & TypeofGetIamPolicyRequest,
    GetPolicyOptions: Instantiable0[GetPolicyOptions] & TypeofGetPolicyOptions,
    IAMPolicy: (Instantiable1[/* rpcImpl */ RPCImpl, IAMPolicy]) & TypeofIAMPolicy,
    Policy: Instantiable0[Policy] & TypeofPolicy,
    PolicyDelta: Instantiable0[PolicyDelta] & TypeofPolicyDelta,
    SetIamPolicyRequest: Instantiable0[SetIamPolicyRequest] & TypeofSetIamPolicyRequest,
    TestIamPermissionsRequest: Instantiable0[TestIamPermissionsRequest] & TypeofTestIamPermissionsR,
    TestIamPermissionsResponse: Instantiable0[TestIamPermissionsResponse] & TypeofTestIamPermissionsRCreate,
    logging: TypeofloggingAuditData
  ): Typeofv1AuditConfigDelta = {
    val __obj = js.Dynamic.literal(AuditConfigDelta = AuditConfigDelta.asInstanceOf[js.Any], Binding = Binding.asInstanceOf[js.Any], BindingDelta = BindingDelta.asInstanceOf[js.Any], GetIamPolicyRequest = GetIamPolicyRequest.asInstanceOf[js.Any], GetPolicyOptions = GetPolicyOptions.asInstanceOf[js.Any], IAMPolicy = IAMPolicy.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyDelta = PolicyDelta.asInstanceOf[js.Any], SetIamPolicyRequest = SetIamPolicyRequest.asInstanceOf[js.Any], TestIamPermissionsRequest = TestIamPermissionsRequest.asInstanceOf[js.Any], TestIamPermissionsResponse = TestIamPermissionsResponse.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofv1AuditConfigDelta]
  }
  
  extension [Self <: Typeofv1AuditConfigDelta](x: Self) {
    
    inline def setAuditConfigDelta(value: Instantiable0[AuditConfigDelta] & TypeofAuditConfigDelta): Self = StObject.set(x, "AuditConfigDelta", value.asInstanceOf[js.Any])
    
    inline def setBinding(value: Instantiable0[Binding] & TypeofBinding): Self = StObject.set(x, "Binding", value.asInstanceOf[js.Any])
    
    inline def setBindingDelta(value: Instantiable0[BindingDelta] & TypeofBindingDelta): Self = StObject.set(x, "BindingDelta", value.asInstanceOf[js.Any])
    
    inline def setGetIamPolicyRequest(value: Instantiable0[GetIamPolicyRequest] & TypeofGetIamPolicyRequest): Self = StObject.set(x, "GetIamPolicyRequest", value.asInstanceOf[js.Any])
    
    inline def setGetPolicyOptions(value: Instantiable0[GetPolicyOptions] & TypeofGetPolicyOptions): Self = StObject.set(x, "GetPolicyOptions", value.asInstanceOf[js.Any])
    
    inline def setIAMPolicy(value: (Instantiable1[/* rpcImpl */ RPCImpl, IAMPolicy]) & TypeofIAMPolicy): Self = StObject.set(x, "IAMPolicy", value.asInstanceOf[js.Any])
    
    inline def setLogging(value: TypeofloggingAuditData): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: Instantiable0[Policy] & TypeofPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyDelta(value: Instantiable0[PolicyDelta] & TypeofPolicyDelta): Self = StObject.set(x, "PolicyDelta", value.asInstanceOf[js.Any])
    
    inline def setSetIamPolicyRequest(value: Instantiable0[SetIamPolicyRequest] & TypeofSetIamPolicyRequest): Self = StObject.set(x, "SetIamPolicyRequest", value.asInstanceOf[js.Any])
    
    inline def setTestIamPermissionsRequest(value: Instantiable0[TestIamPermissionsRequest] & TypeofTestIamPermissionsR): Self = StObject.set(x, "TestIamPermissionsRequest", value.asInstanceOf[js.Any])
    
    inline def setTestIamPermissionsResponse(value: Instantiable0[TestIamPermissionsResponse] & TypeofTestIamPermissionsRCreate): Self = StObject.set(x, "TestIamPermissionsResponse", value.asInstanceOf[js.Any])
  }
}
