package typings.devexpressUtils

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperFrameMod {
  
  @JSImport("@devexpress/utils/lib/pdf/helper-frame", "PdfHelperFrame")
  @js.native
  class PdfHelperFrame protected () extends StObject {
    def this(container: HTMLElement, frameClassName: String) = this()
    
    /* private */ val container: js.Any = js.native
    
    /* private */ var createHelperFrame: js.Any = js.native
    
    def dispose(): Unit = js.native
    
    /* private */ val frameClassName: js.Any = js.native
    
    /* private */ var getHelperFrame: js.Any = js.native
    
    /* private */ var getNewName: js.Any = js.native
    
    /* private */ var helperFrame: js.Any = js.native
    
    /* private */ var helperFrameName: js.Any = js.native
    
    /* private */ var removeHelperFrame: js.Any = js.native
    
    def showPrintDialog(resourceUrl: String): Unit = js.native
  }
}
