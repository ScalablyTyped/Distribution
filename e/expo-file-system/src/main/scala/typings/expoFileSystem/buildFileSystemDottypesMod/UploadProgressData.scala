package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadProgressData extends StObject {
  
  var totalByteSent: Double
  
  var totalBytesExpectedToSend: Double
}
object UploadProgressData {
  
  inline def apply(totalByteSent: Double, totalBytesExpectedToSend: Double): UploadProgressData = {
    val __obj = js.Dynamic.literal(totalByteSent = totalByteSent.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgressData]
  }
  
  extension [Self <: UploadProgressData](x: Self) {
    
    inline def setTotalByteSent(value: Double): Self = StObject.set(x, "totalByteSent", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesExpectedToSend(value: Double): Self = StObject.set(x, "totalBytesExpectedToSend", value.asInstanceOf[js.Any])
  }
}
