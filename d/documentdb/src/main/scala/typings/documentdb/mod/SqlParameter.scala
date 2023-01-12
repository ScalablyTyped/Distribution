package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlParameter extends StObject {
  
  /** The name of the parameter. */
  var name: String
  
  /** The value of the parameter. */
  var value: Any
}
object SqlParameter {
  
  inline def apply(name: String, value: Any): SqlParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlParameter] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
