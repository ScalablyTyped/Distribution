package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait z extends StObject {
  
  var headers: Map[Any, Any]
  
  var `type`: String
  
  var value: Any
}
object z {
  
  inline def apply(headers: Map[Any, Any], `type`: String, value: Any): z = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[z]
  }
  
  extension [Self <: z](x: Self) {
    
    inline def setHeaders(value: Map[Any, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
