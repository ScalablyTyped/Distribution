package typings.expoFileSystem.buildFileSystemDottypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemUploadResult
  extends StObject
     with FileSystemHttpResult {
  
  /**
    * The body of the server response.
    */
  var body: String
}
object FileSystemUploadResult {
  
  inline def apply(body: String, headers: Record[String, String], status: Double): FileSystemUploadResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], mimeType = null)
    __obj.asInstanceOf[FileSystemUploadResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemUploadResult] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
