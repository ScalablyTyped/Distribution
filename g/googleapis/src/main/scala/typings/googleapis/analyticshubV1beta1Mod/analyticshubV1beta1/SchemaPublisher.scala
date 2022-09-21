package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublisher extends StObject {
  
  /**
    * Optional. Name of the listing publisher.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Email or URL of the listing publisher. Max Length: 1000 bytes.
    */
  var primaryContact: js.UndefOr[String | Null] = js.undefined
}
object SchemaPublisher {
  
  inline def apply(): SchemaPublisher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisher]
  }
  
  extension [Self <: SchemaPublisher](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimaryContact(value: String): Self = StObject.set(x, "primaryContact", value.asInstanceOf[js.Any])
    
    inline def setPrimaryContactNull: Self = StObject.set(x, "primaryContact", null)
    
    inline def setPrimaryContactUndefined: Self = StObject.set(x, "primaryContact", js.undefined)
  }
}
