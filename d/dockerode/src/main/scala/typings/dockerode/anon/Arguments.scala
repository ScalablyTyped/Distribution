package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arguments extends StObject {
  
  var arguments: js.Array[String] = js.native
  
  var entrypoint: String = js.native
  
  var privileged: Boolean = js.native
  
  var tty: Boolean = js.native
  
  var user: String = js.native
}
object Arguments {
  
  @scala.inline
  def apply(arguments: js.Array[String], entrypoint: String, privileged: Boolean, tty: Boolean, user: String): Arguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], entrypoint = entrypoint.asInstanceOf[js.Any], privileged = privileged.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  
  @scala.inline
  implicit class ArgumentsMutableBuilder[Self <: Arguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setEntrypoint(value: String): Self = StObject.set(x, "entrypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTty(value: Boolean): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
