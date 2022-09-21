package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivateData extends StObject {
  
  /**
    * A buyer specified reference ID. This can be queried in the list operations (max-length: 1024 unicode code units).
    */
  var referenceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrivateData {
  
  inline def apply(): SchemaPrivateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateData]
  }
  
  extension [Self <: SchemaPrivateData](x: Self) {
    
    inline def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    inline def setReferenceIdNull: Self = StObject.set(x, "referenceId", null)
    
    inline def setReferenceIdUndefined: Self = StObject.set(x, "referenceId", js.undefined)
  }
}
