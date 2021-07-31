package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallabilityErrorArgument extends StObject {
  
  /**
    * Argument name (e.g. name:'minimum-icon-size-in-pixels').
    */
  var name: String
  
  /**
    * Argument value (e.g. value:'64').
    */
  var value: String
}
object InstallabilityErrorArgument {
  
  @scala.inline
  def apply(name: String, value: String): InstallabilityErrorArgument = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallabilityErrorArgument]
  }
  
  @scala.inline
  implicit class InstallabilityErrorArgumentMutableBuilder[Self <: InstallabilityErrorArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
