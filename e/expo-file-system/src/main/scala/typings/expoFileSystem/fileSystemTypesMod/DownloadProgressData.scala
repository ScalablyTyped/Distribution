package typings.expoFileSystem.fileSystemTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadProgressData extends StObject {
  
  var totalBytesExpectedToWrite: Double
  
  var totalBytesWritten: Double
}
object DownloadProgressData {
  
  inline def apply(totalBytesExpectedToWrite: Double, totalBytesWritten: Double): DownloadProgressData = {
    val __obj = js.Dynamic.literal(totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressData]
  }
  
  extension [Self <: DownloadProgressData](x: Self) {
    
    inline def setTotalBytesExpectedToWrite(value: Double): Self = StObject.set(x, "totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesWritten(value: Double): Self = StObject.set(x, "totalBytesWritten", value.asInstanceOf[js.Any])
  }
}
