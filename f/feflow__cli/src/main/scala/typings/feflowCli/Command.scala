package typings.feflowCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  /**
    * Plugin registration command method parameter description
    * @param cmd  Plugin command name eg：devtool
    * @param desc Plugin command description eg： Feflow devtool for better develop a devkit or plugin
    * @param fn   Plugin callback function
    */
  def register(cmd: String, desc: String, fn: js.Function0[Unit]): Unit
}
object Command {
  
  inline def apply(register: (String, String, js.Function0[Unit]) => Unit): Command = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction3(register))
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    inline def setRegister(value: (String, String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction3(value))
  }
}
