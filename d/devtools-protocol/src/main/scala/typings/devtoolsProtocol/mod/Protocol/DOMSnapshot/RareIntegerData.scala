package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RareIntegerData extends StObject {
  
  var index: js.Array[integer]
  
  var value: js.Array[integer]
}
object RareIntegerData {
  
  inline def apply(index: js.Array[integer], value: js.Array[integer]): RareIntegerData = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RareIntegerData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RareIntegerData] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: js.Array[integer]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: integer*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setValue(value: js.Array[integer]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: integer*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
