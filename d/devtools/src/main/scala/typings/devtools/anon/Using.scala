package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Using extends StObject {
  
  var `using`: String
  
  var value: String
}
object Using {
  
  inline def apply(`using`: String, value: String): Using = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("using")(`using`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Using]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Using] (val x: Self) extends AnyVal {
    
    inline def setUsing(value: String): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
