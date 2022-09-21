package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesSetNameRequest extends StObject {
  
  /**
    * The current name of this resource, used to prevent conflicts. Provide the latest name when making a request to change name.
    */
  var currentName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name to be applied to the instance. Needs to be RFC 1035 compliant.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstancesSetNameRequest {
  
  inline def apply(): SchemaInstancesSetNameRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetNameRequest]
  }
  
  extension [Self <: SchemaInstancesSetNameRequest](x: Self) {
    
    inline def setCurrentName(value: String): Self = StObject.set(x, "currentName", value.asInstanceOf[js.Any])
    
    inline def setCurrentNameNull: Self = StObject.set(x, "currentName", null)
    
    inline def setCurrentNameUndefined: Self = StObject.set(x, "currentName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
