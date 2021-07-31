package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBrowserCommandLineResponse extends StObject {
  
  /**
    * Commandline parameters
    */
  var arguments: js.Array[String]
}
object GetBrowserCommandLineResponse {
  
  @scala.inline
  def apply(arguments: js.Array[String]): GetBrowserCommandLineResponse = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrowserCommandLineResponse]
  }
  
  @scala.inline
  implicit class GetBrowserCommandLineResponseMutableBuilder[Self <: GetBrowserCommandLineResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value :_*))
  }
}
