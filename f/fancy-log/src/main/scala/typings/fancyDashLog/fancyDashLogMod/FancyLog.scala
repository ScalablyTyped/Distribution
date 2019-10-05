package typings.fancyDashLog.fancyDashLogMod

import typings.fancyDashLog.fancyDashLogMod.FancyLog.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fancy-log", "FancyLog")
@js.native
object FancyLog extends js.Object {
  @js.native
  trait Logger extends js.Object {
    def apply(args: js.Any*): Logger = js.native
    def dir(args: js.Any*): Logger = js.native
    def error(args: js.Any*): Logger = js.native
    def info(args: js.Any*): Logger = js.native
    def warn(args: js.Any*): Logger = js.native
  }
  
}

