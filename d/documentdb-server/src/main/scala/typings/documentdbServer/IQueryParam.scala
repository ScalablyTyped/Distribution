package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameter interface for parameterized queries */
trait IQueryParam extends StObject {
  
  /** Name to use in the query */
  var name: String
  
  /** Value of the parameter */
  var value: Any
}
object IQueryParam {
  
  inline def apply(name: String, value: Any): IQueryParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IQueryParam] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
