package typings.feflowCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hook extends StObject {
  
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
  
  @scala.inline
  implicit class HookMutableBuilder[Self <: Hook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHook(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "hook", js.Any.fromFunction2(value))
  }
}
