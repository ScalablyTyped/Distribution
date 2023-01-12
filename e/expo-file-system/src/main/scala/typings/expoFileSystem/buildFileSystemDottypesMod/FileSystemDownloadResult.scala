package typings.expoFileSystem.buildFileSystemDottypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemDownloadResult
  extends StObject
     with FileSystemHttpResult {
  
  var md5: js.UndefOr[String] = js.undefined
  
  var uri: String
}
object FileSystemDownloadResult {
  
  inline def apply(headers: Record[String, String], status: Double, uri: String): FileSystemDownloadResult = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], mimeType = null)
    __obj.asInstanceOf[FileSystemDownloadResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemDownloadResult] (val x: Self) extends AnyVal {
    
    inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
