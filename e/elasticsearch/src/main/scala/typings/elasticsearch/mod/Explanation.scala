package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explanation extends StObject {
  
  var description: String
  
  var details: js.Array[Explanation]
  
  var value: Double
}
object Explanation {
  
  inline def apply(description: String, details: js.Array[Explanation], value: Double): Explanation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explanation]
  }
  
  extension [Self <: Explanation](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: js.Array[Explanation]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsVarargs(value: Explanation*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
