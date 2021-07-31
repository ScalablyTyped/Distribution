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
  
  @scala.inline
  def apply(): IPushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPushConfig]
  }
  
  @scala.inline
  implicit class IPushConfigMutableBuilder[Self <: IPushConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setOidcToken(value: IOidcToken): Self = StObject.set(x, "oidcToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcTokenNull: Self = StObject.set(x, "oidcToken", null)
    
    @scala.inline
    def setOidcTokenUndefined: Self = StObject.set(x, "oidcToken", js.undefined)
    
    @scala.inline
    def setPushEndpoint(value: String): Self = StObject.set(x, "pushEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushEndpointNull: Self = StObject.set(x, "pushEndpoint", null)
    
    @scala.inline
    def setPushEndpointUndefined: Self = StObject.set(x, "pushEndpoint", js.undefined)
  }
}
