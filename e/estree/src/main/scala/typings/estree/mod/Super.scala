package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Super
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_Super: typings.estree.estreeStrings.Super
}
object Super {
  
  inline def apply(): Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[Super]
  }
  
  extension [Self <: Super](x: Self) {
    
    inline def setType(value: typings.estree.estreeStrings.Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
