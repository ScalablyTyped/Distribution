package typings.glaze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Console, glaze.glaze/dist-types/logger.LogLevel> */
@js.native
trait PickConsoleLogLevel extends js.Object {
  
  var error: js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  var warn: js.Function1[/* repeated */ js.Any, Unit] = js.native
}
object PickConsoleLogLevel {
  
  @scala.inline
  def apply(error: /* repeated */ js.Any => Unit, warn: /* repeated */ js.Any => Unit): PickConsoleLogLevel = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[PickConsoleLogLevel]
  }
  
  @scala.inline
  implicit class PickConsoleLogLevelOps[Self <: PickConsoleLogLevel] (val x: Self) extends AnyVal {
    
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
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
}
