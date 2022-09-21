package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBroadcastAccess extends StObject {
  
  /**
    * The policy that controls the broadcast's viewer access.
    */
  var accessPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A URL that can be used to access the broadcast of the meeting. This field will be empty if broadcast is not enabled. It will be populated by the backend. Clients cannot modify the value.
    */
  var viewUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaBroadcastAccess {
  
  inline def apply(): SchemaBroadcastAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBroadcastAccess]
  }
  
  extension [Self <: SchemaBroadcastAccess](x: Self) {
    
    inline def setAccessPolicy(value: String): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicyNull: Self = StObject.set(x, "accessPolicy", null)
    
    inline def setAccessPolicyUndefined: Self = StObject.set(x, "accessPolicy", js.undefined)
    
    inline def setViewUrl(value: String): Self = StObject.set(x, "viewUrl", value.asInstanceOf[js.Any])
    
    inline def setViewUrlNull: Self = StObject.set(x, "viewUrl", null)
    
    inline def setViewUrlUndefined: Self = StObject.set(x, "viewUrl", js.undefined)
  }
}
