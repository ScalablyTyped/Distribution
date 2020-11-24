package typings.feflowCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends js.Object {
  
  /**
    * Plugin registration command method parameter description
    * @param cmd  Plugin command name eg：devtool
    * @param desc Plugin command description eg： Feflow devtool for better develop a devkit or plugin
    * @param fn   Plugin callback function
    */
  def register(cmd: String, desc: String, fn: js.Function0[Unit]): Unit = js.native
}
object Command {
  
  @scala.inline
  def apply(register: (String, String, js.Function0[Unit]) => Unit): Command = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction3(register))
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    
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
    def setRegister(value: (String, String, js.Function0[Unit]) => Unit): Self = this.set("register", js.Any.fromFunction3(value))
  }
}
