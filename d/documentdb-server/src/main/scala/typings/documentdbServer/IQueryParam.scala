package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameter interface for parameterized queries */
trait IQueryParam extends StObject {
  
  /** Name to use in the query */
  var name: String
  
  /** Value of the parameter */
  var value: js.Any
}
object IQueryParam {
  
  @scala.inline
  def apply(name: String, value: js.Any): IQueryParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryParam]
  }
  
  @scala.inline
  implicit class IQueryParamMutableBuilder[Self <: IQueryParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
