package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceCreateResponse extends StObject {
  
  var ID: String
  
  var Warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object ServiceCreateResponse {
  
  inline def apply(ID: String): ServiceCreateResponse = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCreateResponse]
  }
  
  extension [Self <: ServiceCreateResponse](x: Self) {
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "Warnings", js.Array(value :_*))
  }
}
