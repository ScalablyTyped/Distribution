package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestElement
  extends StObject
     with BaseNode
     with Pattern {
  
  var argument: Pattern
  
  @JSName("type")
  var type_RestElement: typings.estree.estreeStrings.RestElement
}
object RestElement {
  
  inline def apply(argument: Pattern): RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[RestElement]
  }
  
  extension [Self <: RestElement](x: Self) {
    
    inline def setArgument(value: Pattern): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.RestElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
