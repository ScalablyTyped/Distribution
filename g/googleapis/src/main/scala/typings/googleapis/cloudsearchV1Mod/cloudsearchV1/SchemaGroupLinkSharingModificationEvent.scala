package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupLinkSharingModificationEvent extends StObject {
  
  var newStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaGroupLinkSharingModificationEvent {
  
  inline def apply(): SchemaGroupLinkSharingModificationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupLinkSharingModificationEvent]
  }
  
  extension [Self <: SchemaGroupLinkSharingModificationEvent](x: Self) {
    
    inline def setNewStatus(value: String): Self = StObject.set(x, "newStatus", value.asInstanceOf[js.Any])
    
    inline def setNewStatusNull: Self = StObject.set(x, "newStatus", null)
    
    inline def setNewStatusUndefined: Self = StObject.set(x, "newStatus", js.undefined)
  }
}
