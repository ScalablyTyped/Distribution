package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RareBooleanData extends StObject {
  
  var index: js.Array[integer]
}
object RareBooleanData {
  
  inline def apply(index: js.Array[integer]): RareBooleanData = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RareBooleanData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RareBooleanData] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: js.Array[integer]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: integer*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
