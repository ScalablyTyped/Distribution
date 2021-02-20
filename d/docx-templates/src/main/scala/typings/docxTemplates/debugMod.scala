package typings.docxTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugMod {
  
  object logger {
    
    @JSImport("docx-templates/lib/debug", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("docx-templates/lib/debug", "logger.debug")
    @js.native
    def debug: LogSink = js.native
    @JSImport("docx-templates/lib/debug", "logger.debug")
    @js.native
    def debug(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    @JSImport("docx-templates/lib/debug", "logger.debug")
    @js.native
    def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
    @scala.inline
    def debug_=(x: LogSink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("docx-templates/lib/debug", "setDebugLogSink")
  @js.native
  def setDebugLogSink(f: LogSink): Unit = js.native
  
  type LogSink = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
}
