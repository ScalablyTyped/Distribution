package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ServiceOptions. */
trait IServiceOptions extends StObject {
  
  /** ServiceOptions .google.api.defaultHost */
  @JSName(".google.api.defaultHost")
  var DotgoogleDotapiDotdefaultHost: js.UndefOr[String | Null] = js.undefined
  
  /** ServiceOptions .google.api.oauthScopes */
  @JSName(".google.api.oauthScopes")
  var DotgoogleDotapiDotoauthScopes: js.UndefOr[String | Null] = js.undefined
  
  /** ServiceOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  
  /** ServiceOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}
object IServiceOptions {
  
  inline def apply(): IServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServiceOptions]
  }
  
  extension [Self <: IServiceOptions](x: Self) {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDotgoogleDotapiDotdefaultHost(value: String): Self = StObject.set(x, ".google.api.defaultHost", value.asInstanceOf[js.Any])
    
    inline def setDotgoogleDotapiDotdefaultHostNull: Self = StObject.set(x, ".google.api.defaultHost", null)
    
    inline def setDotgoogleDotapiDotdefaultHostUndefined: Self = StObject.set(x, ".google.api.defaultHost", js.undefined)
    
    inline def setDotgoogleDotapiDotoauthScopes(value: String): Self = StObject.set(x, ".google.api.oauthScopes", value.asInstanceOf[js.Any])
    
    inline def setDotgoogleDotapiDotoauthScopesNull: Self = StObject.set(x, ".google.api.oauthScopes", null)
    
    inline def setDotgoogleDotapiDotoauthScopesUndefined: Self = StObject.set(x, ".google.api.oauthScopes", js.undefined)
    
    inline def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    inline def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    inline def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
