package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.IOidcToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PushConfig. */
trait IPushConfig extends StObject {
  
  /** PushConfig attributes */
  var attributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** PushConfig oidcToken */
  var oidcToken: js.UndefOr[IOidcToken | Null] = js.undefined
  
  /** PushConfig pushEndpoint */
  var pushEndpoint: js.UndefOr[String | Null] = js.undefined
}
object IPushConfig {
  
  inline def apply(): IPushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPushConfig]
  }
  
  extension [Self <: IPushConfig](x: Self) {
    
    inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setOidcToken(value: IOidcToken): Self = StObject.set(x, "oidcToken", value.asInstanceOf[js.Any])
    
    inline def setOidcTokenNull: Self = StObject.set(x, "oidcToken", null)
    
    inline def setOidcTokenUndefined: Self = StObject.set(x, "oidcToken", js.undefined)
    
    inline def setPushEndpoint(value: String): Self = StObject.set(x, "pushEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPushEndpointNull: Self = StObject.set(x, "pushEndpoint", null)
    
    inline def setPushEndpointUndefined: Self = StObject.set(x, "pushEndpoint", js.undefined)
  }
}
