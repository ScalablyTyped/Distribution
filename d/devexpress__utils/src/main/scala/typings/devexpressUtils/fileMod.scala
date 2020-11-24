package typings.devexpressUtils

import typings.devexpressUtils.anon.HtmlScriptElement
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/file", JSImport.Namespace)
@js.native
object fileMod extends js.Object {
  
  @js.native
  class FileUtils () extends js.Object
  /* static members */
  @js.native
  object FileUtils extends js.Object {
    
    def loadJavascriptFile(srcUri: String, callback: js.Function0[Unit]): HtmlScriptElement = js.native
    
    def startDownloadFileLocal(file: Blob, fileName: String): Unit = js.native
  }
}
