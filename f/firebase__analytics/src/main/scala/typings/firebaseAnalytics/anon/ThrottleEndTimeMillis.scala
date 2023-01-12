package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrottleEndTimeMillis extends StObject {
  
  var throttleEndTimeMillis: Double
}
object ThrottleEndTimeMillis {
  
  inline def apply(throttleEndTimeMillis: Double): ThrottleEndTimeMillis = {
    val __obj = js.Dynamic.literal(throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleEndTimeMillis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThrottleEndTimeMillis] (val x: Self) extends AnyVal {
    
    inline def setThrottleEndTimeMillis(value: Double): Self = StObject.set(x, "throttleEndTimeMillis", value.asInstanceOf[js.Any])
  }
}
