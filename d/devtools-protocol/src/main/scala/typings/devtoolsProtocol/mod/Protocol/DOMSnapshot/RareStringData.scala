package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RareStringData extends StObject {
  
  var index: js.Array[integer]
  
  var value: js.Array[StringIndex]
}
object RareStringData {
  
  inline def apply(index: js.Array[integer], value: js.Array[StringIndex]): RareStringData = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RareStringData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RareStringData] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: js.Array[integer]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: integer*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setValue(value: js.Array[StringIndex]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: StringIndex*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
