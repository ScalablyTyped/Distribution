package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arguments extends StObject {
  
  var arguments: js.Array[String]
  
  var entrypoint: String
  
  var privileged: Boolean
  
  var tty: Boolean
  
  var user: String
}
object Arguments {
  
  inline def apply(arguments: js.Array[String], entrypoint: String, privileged: Boolean, tty: Boolean, user: String): Arguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], entrypoint = entrypoint.asInstanceOf[js.Any], privileged = privileged.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  
  extension [Self <: Arguments](x: Self) {
    
    inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setEntrypoint(value: String): Self = StObject.set(x, "entrypoint", value.asInstanceOf[js.Any])
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    inline def setTty(value: Boolean): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
