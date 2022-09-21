package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var inMemory: Boolean
  
  var isAsync: Boolean
}
object Id {
  
  inline def apply(id: String, inMemory: Boolean, isAsync: Boolean): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inMemory = inMemory.asInstanceOf[js.Any], isAsync = isAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInMemory(value: Boolean): Self = StObject.set(x, "inMemory", value.asInstanceOf[js.Any])
    
    inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
  }
}
