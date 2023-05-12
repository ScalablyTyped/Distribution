package typings.expoFileSystem.buildFileSystemDottypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemHttpResult extends StObject {
  
  /**
    * An object containing all the HTTP response header fields and their values for the download network request.
    * The keys and values of the object are the header names and values respectively.
    */
  var headers: Record[String, String]
  
  var mimeType: String | Null
  
  /**
    * The HTTP response status code for the download network request.
    */
  var status: Double
}
object FileSystemHttpResult {
  
  inline def apply(headers: Record[String, String], status: Double): FileSystemHttpResult = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], mimeType = null)
    __obj.asInstanceOf[FileSystemHttpResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemHttpResult] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
