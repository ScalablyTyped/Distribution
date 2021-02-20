package typings.devexpressUtils

import typings.devexpressUtils.anon.HtmlScriptElement
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("@devexpress/utils/lib/utils/file", "FileUtils")
  @js.native
  class FileUtils () extends StObject
  /* static members */
  object FileUtils {
    
    @JSImport("@devexpress/utils/lib/utils/file", "FileUtils.loadJavascriptFile")
    @js.native
    def loadJavascriptFile(srcUri: String, callback: js.Function0[Unit]): HtmlScriptElement = js.native
    
    @JSImport("@devexpress/utils/lib/utils/file", "FileUtils.startDownloadFileLocal")
    @js.native
    def startDownloadFileLocal(file: Blob, fileName: String): Unit = js.native
  }
}
