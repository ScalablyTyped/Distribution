package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadProgressData extends StObject {
  
  /**
    * The total bytes expected to be written by the download operation. A value of `-1` means that the server did not return the `Content-Length` header
    * and the total size is unknown. Without this header, you won't be able to track the download progress.
    */
  var totalBytesExpectedToWrite: Double
  
  /**
    * The total bytes written by the download operation.
    */
  var totalBytesWritten: Double
}
object DownloadProgressData {
  
  inline def apply(totalBytesExpectedToWrite: Double, totalBytesWritten: Double): DownloadProgressData = {
    val __obj = js.Dynamic.literal(totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadProgressData] (val x: Self) extends AnyVal {
    
    inline def setTotalBytesExpectedToWrite(value: Double): Self = StObject.set(x, "totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesWritten(value: Double): Self = StObject.set(x, "totalBytesWritten", value.asInstanceOf[js.Any])
  }
}
