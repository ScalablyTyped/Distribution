package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPattern
  extends StObject
     with BaseNode
     with Pattern {
  
  var properties: js.Array[AssignmentProperty | RestElement]
  
  @JSName("type")
  var type_ObjectPattern: typings.estree.estreeStrings.ObjectPattern
}
object ObjectPattern {
  
  inline def apply(properties: js.Array[AssignmentProperty | RestElement]): ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[ObjectPattern]
  }
  
  extension [Self <: ObjectPattern](x: Self) {
    
    inline def setProperties(value: js.Array[AssignmentProperty | RestElement]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (AssignmentProperty | RestElement)*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: typings.estree.estreeStrings.ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
