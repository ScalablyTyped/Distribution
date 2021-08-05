package typings.devexpressUtils

import typings.devexpressUtils.anon.HtmlScriptElement
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("@devexpress/utils/lib/utils/file", "FileUtils")
  @js.native
  class FileUtils () extends StObject
  /* static members */
  object FileUtils {
    
    @JSImport("@devexpress/utils/lib/utils/file", "FileUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def loadJavascriptFile(srcUri: String, callback: js.Function0[Unit]): HtmlScriptElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadJavascriptFile")(srcUri.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[HtmlScriptElement]
    
    inline def startDownloadFileLocal(file: Blob, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDownloadFileLocal")(file.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
