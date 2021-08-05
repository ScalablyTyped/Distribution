package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectiveTime extends StObject {
  
  var effectiveTime: js.UndefOr[String] = js.undefined
  
  var isLocked: js.UndefOr[Boolean] = js.undefined
  
  var retentionPeriod: js.UndefOr[String] = js.undefined
}
object EffectiveTime {
  
  inline def apply(): EffectiveTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectiveTime]
  }
  
  extension [Self <: EffectiveTime](x: Self) {
    
    inline def setEffectiveTime(value: String): Self = StObject.set(x, "effectiveTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimeUndefined: Self = StObject.set(x, "effectiveTime", js.undefined)
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
    
    inline def setRetentionPeriod(value: String): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
