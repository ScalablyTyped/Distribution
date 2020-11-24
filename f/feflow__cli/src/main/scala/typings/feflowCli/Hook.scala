package typings.feflowCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hook extends js.Object {
  
  /**
    * Hook will execute befor any command
    * Hook registration command method parameter description
    * @param type  Hook name eg：report
    * @param fn  Hook callback function eg：report
    */
  def hook(`type`: String, fn: js.Function0[Unit]): Unit = js.native
}
object Hook {
  
  @scala.inline
  def apply(hook: (String, js.Function0[Unit]) => Unit): Hook = {
    val __obj = js.Dynamic.literal(hook = js.Any.fromFunction2(hook))
    __obj.asInstanceOf[Hook]
  }
  
  @scala.inline
  implicit class HookOps[Self <: Hook] (val x: Self) extends AnyVal {
    
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
    def setHook(value: (String, js.Function0[Unit]) => Unit): Self = this.set("hook", js.Any.fromFunction2(value))
  }
}
