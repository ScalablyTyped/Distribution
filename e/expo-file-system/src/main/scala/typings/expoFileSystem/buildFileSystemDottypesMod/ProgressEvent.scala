package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressEvent[T] extends StObject {
  
  var data: T
  
  var uuid: String
}
object ProgressEvent {
  
  inline def apply[T](data: T, uuid: String): ProgressEvent[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent[T]]
  }
  
  extension [Self <: ProgressEvent[?], T](x: Self & ProgressEvent[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
