package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHostProto extends StObject {
  
  /**
    * Lower-case, fully qualified hostname.
    */
  var hostName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If present, then any checks that compare this Principal to LOAS peer info must confirm the peer's machine owner is equal to 'host_owner'. If absent, then any peer machine owner is acceptable.
    */
  var hostOwner: js.UndefOr[String | Null] = js.undefined
}
object SchemaHostProto {
  
  inline def apply(): SchemaHostProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHostProto]
  }
  
  extension [Self <: SchemaHostProto](x: Self) {
    
    inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setHostNameNull: Self = StObject.set(x, "hostName", null)
    
    inline def setHostNameUndefined: Self = StObject.set(x, "hostName", js.undefined)
    
    inline def setHostOwner(value: String): Self = StObject.set(x, "hostOwner", value.asInstanceOf[js.Any])
    
    inline def setHostOwnerNull: Self = StObject.set(x, "hostOwner", null)
    
    inline def setHostOwnerUndefined: Self = StObject.set(x, "hostOwner", js.undefined)
  }
}
