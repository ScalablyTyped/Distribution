package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.buildSrcGaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceConfigRequest extends StObject {
  
  var baseConfig: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var gaxOptions: js.UndefOr[CallOptions] = js.undefined
  
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  var replicas: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.admin.instance.v1.IReplicaInfo */ Any
    ]
  ] = js.undefined
  
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object CreateInstanceConfigRequest {
  
  inline def apply(): CreateInstanceConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInstanceConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setBaseConfig(value: String): Self = StObject.set(x, "baseConfig", value.asInstanceOf[js.Any])
    
    inline def setBaseConfigUndefined: Self = StObject.set(x, "baseConfig", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
    
    inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setReplicas(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.admin.instance.v1.IReplicaInfo */ Any
        ]
    ): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.admin.instance.v1.IReplicaInfo */ Any)*
    ): Self = StObject.set(x, "replicas", js.Array(value*))
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
