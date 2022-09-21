package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.AcquirePermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFamilyInfo extends StObject {
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Family membership info of the user that made the request.
    */
  var membership: js.UndefOr[AcquirePermission | Null] = js.undefined
}
object SchemaFamilyInfo {
  
  inline def apply(): SchemaFamilyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFamilyInfo]
  }
  
  extension [Self <: SchemaFamilyInfo](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMembership(value: AcquirePermission): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipNull: Self = StObject.set(x, "membership", null)
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}
