package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallabilityError extends js.Object {
  
  /**
    * The list of error arguments (e.g. {name:'minimum-icon-size-in-pixels', value:'64'}).
    */
  var errorArguments: js.Array[InstallabilityErrorArgument] = js.native
  
  /**
    * The error id (e.g. 'manifest-missing-suitable-icon').
    */
  var errorId: String = js.native
}
object InstallabilityError {
  
  @scala.inline
  def apply(errorArguments: js.Array[InstallabilityErrorArgument], errorId: String): InstallabilityError = {
    val __obj = js.Dynamic.literal(errorArguments = errorArguments.asInstanceOf[js.Any], errorId = errorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallabilityError]
  }
  
  @scala.inline
  implicit class InstallabilityErrorOps[Self <: InstallabilityError] (val x: Self) extends AnyVal {
    
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
    def setErrorArgumentsVarargs(value: InstallabilityErrorArgument*): Self = this.set("errorArguments", js.Array(value :_*))
    
    @scala.inline
    def setErrorArguments(value: js.Array[InstallabilityErrorArgument]): Self = this.set("errorArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorId(value: String): Self = this.set("errorId", value.asInstanceOf[js.Any])
  }
}
