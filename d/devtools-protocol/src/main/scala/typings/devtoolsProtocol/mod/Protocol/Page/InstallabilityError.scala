package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallabilityError extends StObject {
  
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
  implicit class InstallabilityErrorMutableBuilder[Self <: InstallabilityError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorArguments(value: js.Array[InstallabilityErrorArgument]): Self = StObject.set(x, "errorArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorArgumentsVarargs(value: InstallabilityErrorArgument*): Self = StObject.set(x, "errorArguments", js.Array(value :_*))
    
    @scala.inline
    def setErrorId(value: String): Self = StObject.set(x, "errorId", value.asInstanceOf[js.Any])
  }
}
