package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectiveTime extends StObject {
  
  var effectiveTime: js.UndefOr[String] = js.native
  
  var isLocked: js.UndefOr[Boolean] = js.native
  
  var retentionPeriod: js.UndefOr[String] = js.native
}
object EffectiveTime {
  
  @scala.inline
  def apply(): EffectiveTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectiveTime]
  }
  
  @scala.inline
  implicit class EffectiveTimeMutableBuilder[Self <: EffectiveTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffectiveTime(value: String): Self = StObject.set(x, "effectiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveTimeUndefined: Self = StObject.set(x, "effectiveTime", js.undefined)
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: String): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
