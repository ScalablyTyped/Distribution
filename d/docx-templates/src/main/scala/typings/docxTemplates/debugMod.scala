package typings.docxTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/debug", JSImport.Namespace)
@js.native
object debugMod extends js.Object {
  def setDebugLogSink(f: LogSink): Unit = js.native
  @js.native
  object logger extends js.Object {
    @JSName("debug")
    var debug_Original: LogSink = js.native
    def debug(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
  
  type LogSink = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
}

