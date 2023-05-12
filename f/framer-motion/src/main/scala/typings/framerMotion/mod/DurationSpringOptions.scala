package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationSpringOptions extends StObject {
  
  var bounce: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object DurationSpringOptions {
  
  inline def apply(): DurationSpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationSpringOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DurationSpringOptions] (val x: Self) extends AnyVal {
    
    inline def setBounce(value: Double): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
