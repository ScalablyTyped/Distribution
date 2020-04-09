package typings.feflowCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hook extends js.Object {
  /**
    * Hook will execute befor any command
    * Hook registration command method parameter description
    * @param type  Hook name eg：report
    * @param fn  Hook callback function eg：report
    */
  def hook(`type`: String, fn: js.Function0[Unit]): Unit
}

object Hook {
  @scala.inline
  def apply(hook: (String, js.Function0[Unit]) => Unit): Hook = {
    val __obj = js.Dynamic.literal(hook = js.Any.fromFunction2(hook))
  
    __obj.asInstanceOf[Hook]
  }
}

