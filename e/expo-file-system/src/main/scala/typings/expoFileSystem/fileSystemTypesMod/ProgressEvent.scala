package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.anon.TotalBytesExpectedToWrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressEvent extends StObject {
  
  var data: TotalBytesExpectedToWrite
  
  var uuid: String
}
object ProgressEvent {
  
  @scala.inline
  def apply(data: TotalBytesExpectedToWrite, uuid: String): ProgressEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent]
  }
  
  @scala.inline
  implicit class ProgressEventMutableBuilder[Self <: ProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: TotalBytesExpectedToWrite): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
