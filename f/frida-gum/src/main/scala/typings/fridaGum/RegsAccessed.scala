package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegsAccessed[T] extends StObject {
  
  var read: js.Array[T]
  
  var written: js.Array[T]
}
object RegsAccessed {
  
  inline def apply[T](read: js.Array[T], written: js.Array[T]): RegsAccessed[T] = {
    val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegsAccessed[T]]
  }
  
  extension [Self <: RegsAccessed[?], T](x: Self & RegsAccessed[T]) {
    
    inline def setRead(value: js.Array[T]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadVarargs(value: T*): Self = StObject.set(x, "read", js.Array(value*))
    
    inline def setWritten(value: js.Array[T]): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
    
    inline def setWrittenVarargs(value: T*): Self = StObject.set(x, "written", js.Array(value*))
  }
}
