package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nanoseconds extends StObject {
  
  var nanoseconds: Double
  
  var seconds: Double
}
object Nanoseconds {
  
  inline def apply(nanoseconds: Double, seconds: Double): Nanoseconds = {
    val __obj = js.Dynamic.literal(nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nanoseconds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nanoseconds] (val x: Self) extends AnyVal {
    
    inline def setNanoseconds(value: Double): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
  }
}
