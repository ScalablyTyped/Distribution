package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdNull extends StObject {
  
  var id: Null
}
object IdNull {
  
  inline def apply(id: Null): IdNull = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdNull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdNull] (val x: Self) extends AnyVal {
    
    inline def setId(value: Null): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
