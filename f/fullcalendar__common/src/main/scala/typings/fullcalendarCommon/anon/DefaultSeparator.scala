package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSeparator extends StObject {
  
  var defaultSeparator: js.UndefOr[String] = js.undefined
  
  var forcedEndTzo: js.UndefOr[Double] = js.undefined
  
  var forcedStartTzo: js.UndefOr[Double] = js.undefined
  
  var isEndExclusive: js.UndefOr[Boolean] = js.undefined
}
object DefaultSeparator {
  
  inline def apply(): DefaultSeparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSeparator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultSeparator] (val x: Self) extends AnyVal {
    
    inline def setDefaultSeparator(value: String): Self = StObject.set(x, "defaultSeparator", value.asInstanceOf[js.Any])
    
    inline def setDefaultSeparatorUndefined: Self = StObject.set(x, "defaultSeparator", js.undefined)
    
    inline def setForcedEndTzo(value: Double): Self = StObject.set(x, "forcedEndTzo", value.asInstanceOf[js.Any])
    
    inline def setForcedEndTzoUndefined: Self = StObject.set(x, "forcedEndTzo", js.undefined)
    
    inline def setForcedStartTzo(value: Double): Self = StObject.set(x, "forcedStartTzo", value.asInstanceOf[js.Any])
    
    inline def setForcedStartTzoUndefined: Self = StObject.set(x, "forcedStartTzo", js.undefined)
    
    inline def setIsEndExclusive(value: Boolean): Self = StObject.set(x, "isEndExclusive", value.asInstanceOf[js.Any])
    
    inline def setIsEndExclusiveUndefined: Self = StObject.set(x, "isEndExclusive", js.undefined)
  }
}
