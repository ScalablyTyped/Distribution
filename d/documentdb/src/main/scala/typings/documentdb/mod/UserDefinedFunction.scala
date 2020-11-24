package typings.documentdb.mod

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
  implicit class UserDefinedFunctionOps[Self <: UserDefinedFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUserDefinedFunctionType(value: UserDefinedFunctionType): Self = this.set("userDefinedFunctionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDefinedFunctionType: Self = this.set("userDefinedFunctionType", js.undefined)
  }
}
