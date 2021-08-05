package typings.docxTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugMod {
  
  @JSImport("docx-templates/lib/debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object logger {
    
    @JSImport("docx-templates/lib/debug", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("docx-templates/lib/debug", "logger.debug")
    @js.native
    def debug: LogSink = js.native
    inline def debug(message: js.Any, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug(message: Unit, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debug_=(x: LogSink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  }
  
  inline def setDebugLogSink(f: LogSink): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDebugLogSink")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait LogSink extends StObject {
    
    def apply(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def apply(message: Unit, optionalParams: js.Any*): Unit = js.native
  }
}
