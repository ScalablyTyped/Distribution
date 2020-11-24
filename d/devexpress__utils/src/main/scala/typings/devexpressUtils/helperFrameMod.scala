package typings.devexpressUtils

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/pdf/helper-frame", JSImport.Namespace)
@js.native
object helperFrameMod extends js.Object {
  
  @js.native
  class PdfHelperFrame protected () extends js.Object {
    def this(container: HTMLElement, frameClassName: String) = this()
    
    val container: js.Any = js.native
    
    var createHelperFrame: js.Any = js.native
    
    def dispose(): Unit = js.native
    
    val frameClassName: js.Any = js.native
    
    var getHelperFrame: js.Any = js.native
    
    var getNewName: js.Any = js.native
    
    var helperFrame: js.Any = js.native
    
    var helperFrameName: js.Any = js.native
    
    var removeHelperFrame: js.Any = js.native
    
    def showPrintDialog(resourceUrl: String): Unit = js.native
  }
}
