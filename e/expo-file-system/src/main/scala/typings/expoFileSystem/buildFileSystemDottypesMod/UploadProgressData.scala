package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadProgressData extends StObject {
  
  /**
    * @deprecated Use `totalBytesSent` instead.
    */
  var totalByteSent: Double
  
  /**
    * The total bytes expected to be sent by the upload operation.
    */
  var totalBytesExpectedToSend: Double
  
  /**
    * The total bytes sent by the upload operation.
    */
  var totalBytesSent: Double
}
object UploadProgressData {
  
  inline def apply(totalByteSent: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): UploadProgressData = {
    val __obj = js.Dynamic.literal(totalByteSent = totalByteSent.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgressData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadProgressData] (val x: Self) extends AnyVal {
    
    inline def setTotalByteSent(value: Double): Self = StObject.set(x, "totalByteSent", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesExpectedToSend(value: Double): Self = StObject.set(x, "totalBytesExpectedToSend", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesSent(value: Double): Self = StObject.set(x, "totalBytesSent", value.asInstanceOf[js.Any])
  }
}
