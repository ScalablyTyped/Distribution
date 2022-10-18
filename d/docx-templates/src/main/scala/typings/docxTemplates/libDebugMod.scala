package typings.docxTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDebugMod {
  
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
    inline def debug(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def debug(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def debug_=(x: LogSink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  }
  
  inline def setDebugLogSink(f: LogSink): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDebugLogSink")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait LogSink extends StObject {
    
    def apply(message: Any, optionalParams: Any*): Unit = js.native
    def apply(message: Unit, optionalParams: Any*): Unit = js.native
  }
}
