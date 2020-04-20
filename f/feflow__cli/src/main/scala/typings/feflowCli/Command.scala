package typings.feflowCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /**
    * Plugin registration command method parameter description
    * @param cmd  Plugin command name eg：devtool
    * @param desc Plugin command description eg： Feflow devtool for better develop a devkit or plugin
    * @param fn   Plugin callback function
    */
  def register(cmd: String, desc: String, fn: js.Function0[Unit]): Unit
}

object Command {
  @scala.inline
  def apply(register: (String, String, js.Function0[Unit]) => Unit): Command = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction3(register))
    __obj.asInstanceOf[Command]
  }
}

