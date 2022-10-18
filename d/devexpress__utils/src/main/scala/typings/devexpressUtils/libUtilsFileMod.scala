package typings.devexpressUtils

import typings.devexpressUtils.anon.HtmlScriptElement
import typings.std.Blob
import typings.std.BlobPart
import typings.std.File
import typings.std.FilePropertyBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsFileMod {
  
  @JSImport("@devexpress/utils/lib/utils/file", "FileUtils")
  @js.native
  open class FileUtils () extends StObject
  /* static members */
  object FileUtils {
    
    @JSImport("@devexpress/utils/lib/utils/file", "FileUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFile(fileBits: js.Array[BlobPart], fileName: String): File = (^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(fileBits.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[File]
    inline def createFile(fileBits: js.Array[BlobPart], fileName: String, options: FilePropertyBag): File = (^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(fileBits.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File]
    
    inline def isFile(file: Any): /* is std.File */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(file.asInstanceOf[js.Any]).asInstanceOf[/* is std.File */ Boolean]
    
    inline def loadJavascriptFile(srcUri: String, callback: js.Function0[Unit]): HtmlScriptElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadJavascriptFile")(srcUri.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[HtmlScriptElement]
    
    inline def startDownloadFileLocal(content: String, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDownloadFileLocal")(content.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def startDownloadFileLocal(content: js.typedarray.ArrayBuffer, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDownloadFileLocal")(content.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def startDownloadFileLocal(content: Blob, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDownloadFileLocal")(content.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def startDownloadFileLocal(content: File, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startDownloadFileLocal")(content.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
