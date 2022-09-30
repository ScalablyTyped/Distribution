package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf

import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.IHttpRule
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.longrunning.IOperationInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a MethodOptions. */
trait IMethodOptions extends StObject {
  
  /** MethodOptions .google.api.http */
  @JSName(".google.api.http")
  var DotgoogleDotapiDothttp: js.UndefOr[IHttpRule | Null] = js.undefined
  
  /** MethodOptions .google.api.methodSignature */
  @JSName(".google.api.methodSignature")
  var DotgoogleDotapiDotmethodSignature: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** MethodOptions .google.longrunning.operationInfo */
  @JSName(".google.longrunning.operationInfo")
  var DotgoogleDotlongrunningDotoperationInfo: js.UndefOr[IOperationInfo | Null] = js.undefined
  
  /** MethodOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  
  /** MethodOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}
object IMethodOptions {
  
  inline def apply(): IMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMethodOptions]
  }
  
  extension [Self <: IMethodOptions](x: Self) {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDotgoogleDotapiDothttp(value: IHttpRule): Self = StObject.set(x, ".google.api.http", value.asInstanceOf[js.Any])
    
    inline def setDotgoogleDotapiDothttpNull: Self = StObject.set(x, ".google.api.http", null)
    
    inline def setDotgoogleDotapiDothttpUndefined: Self = StObject.set(x, ".google.api.http", js.undefined)
    
    inline def setDotgoogleDotapiDotmethodSignature(value: js.Array[String]): Self = StObject.set(x, ".google.api.methodSignature", value.asInstanceOf[js.Any])
    
    inline def setDotgoogleDotapiDotmethodSignatureNull: Self = StObject.set(x, ".google.api.methodSignature", null)
    
    inline def setDotgoogleDotapiDotmethodSignatureUndefined: Self = StObject.set(x, ".google.api.methodSignature", js.undefined)
    
    inline def setDotgoogleDotapiDotmethodSignatureVarargs(value: String*): Self = StObject.set(x, ".google.api.methodSignature", js.Array(value*))
    
    inline def setDotgoogleDotlongrunningDotoperationInfo(value: IOperationInfo): Self = StObject.set(x, ".google.longrunning.operationInfo", value.asInstanceOf[js.Any])
    
    inline def setDotgoogleDotlongrunningDotoperationInfoNull: Self = StObject.set(x, ".google.longrunning.operationInfo", null)
    
    inline def setDotgoogleDotlongrunningDotoperationInfoUndefined: Self = StObject.set(x, ".google.longrunning.operationInfo", js.undefined)
    
    inline def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    inline def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    inline def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
