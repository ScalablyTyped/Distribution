package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefinedFunction extends UserScriptable {
  
  /** Type of function */
  var userDefinedFunctionType: js.UndefOr[UserDefinedFunctionType] = js.native
}
object UserDefinedFunction {
  
  @scala.inline
  def apply(id: String): UserDefinedFunction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedFunction]
  }
  
  @scala.inline
  implicit class UserDefinedFunctionMutableBuilder[Self <: UserDefinedFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserDefinedFunctionType(value: UserDefinedFunctionType): Self = StObject.set(x, "userDefinedFunctionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedFunctionTypeUndefined: Self = StObject.set(x, "userDefinedFunctionType", js.undefined)
  }
}
