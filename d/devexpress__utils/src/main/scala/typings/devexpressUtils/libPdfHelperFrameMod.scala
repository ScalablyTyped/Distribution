package typings.devexpressUtils

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPdfHelperFrameMod {
  
  @JSImport("@devexpress/utils/lib/pdf/helper-frame", "PdfHelperFrame")
  @js.native
  open class PdfHelperFrame protected () extends StObject {
    def this(container: HTMLElement, frameClassName: String) = this()
    
    /* private */ val container: Any = js.native
    
    /* private */ var createHelperFrame: Any = js.native
    
    def dispose(): Unit = js.native
    
    /* private */ val frameClassName: Any = js.native
    
    /* private */ var getHelperFrame: Any = js.native
    
    /* private */ var getNewName: Any = js.native
    
    /* private */ var helperFrame: Any = js.native
    
    /* private */ var helperFrameName: Any = js.native
    
    /* private */ var removeHelperFrame: Any = js.native
    
    def showPrintDialog(resourceUrl: String): Unit = js.native
  }
}
