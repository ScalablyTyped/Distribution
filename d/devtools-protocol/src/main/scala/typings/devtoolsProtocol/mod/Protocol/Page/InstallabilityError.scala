package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallabilityError extends StObject {
  
  /**
    * The list of error arguments (e.g. {name:'minimum-icon-size-in-pixels', value:'64'}).
    */
  var errorArguments: js.Array[InstallabilityErrorArgument]
  
  /**
    * The error id (e.g. 'manifest-missing-suitable-icon').
    */
  var errorId: String
}
object InstallabilityError {
  
  inline def apply(errorArguments: js.Array[InstallabilityErrorArgument], errorId: String): InstallabilityError = {
    val __obj = js.Dynamic.literal(errorArguments = errorArguments.asInstanceOf[js.Any], errorId = errorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallabilityError]
  }
  
  extension [Self <: InstallabilityError](x: Self) {
    
    inline def setErrorArguments(value: js.Array[InstallabilityErrorArgument]): Self = StObject.set(x, "errorArguments", value.asInstanceOf[js.Any])
    
    inline def setErrorArgumentsVarargs(value: InstallabilityErrorArgument*): Self = StObject.set(x, "errorArguments", js.Array(value*))
    
    inline def setErrorId(value: String): Self = StObject.set(x, "errorId", value.asInstanceOf[js.Any])
  }
}
