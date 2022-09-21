package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NanosecondsSeconds extends StObject {
  
  var nanoseconds: Any
  
  var seconds: Any
}
object NanosecondsSeconds {
  
  inline def apply(nanoseconds: Any, seconds: Any): NanosecondsSeconds = {
    val __obj = js.Dynamic.literal(nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[NanosecondsSeconds]
  }
  
  extension [Self <: NanosecondsSeconds](x: Self) {
    
    inline def setNanoseconds(value: Any): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Any): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
  }
}
