package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectClassNamesResponse extends StObject {
  
  /**
    * Class name list.
    */
  var classNames: js.Array[String]
}
object CollectClassNamesResponse {
  
  inline def apply(classNames: js.Array[String]): CollectClassNamesResponse = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectClassNamesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectClassNamesResponse] (val x: Self) extends AnyVal {
    
    inline def setClassNames(value: js.Array[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value*))
  }
}
