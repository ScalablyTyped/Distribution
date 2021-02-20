package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventConditions extends StObject {
  
  var eventConditions: js.UndefOr[js.Array[ComparisonType]] = js.native
  
  var useEventValue: js.UndefOr[Boolean] = js.native
}
object EventConditions {
  
  @scala.inline
  def apply(): EventConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventConditions]
  }
  
  @scala.inline
  implicit class EventConditionsMutableBuilder[Self <: EventConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventConditions(value: js.Array[ComparisonType]): Self = StObject.set(x, "eventConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventConditionsUndefined: Self = StObject.set(x, "eventConditions", js.undefined)
    
    @scala.inline
    def setEventConditionsVarargs(value: ComparisonType*): Self = StObject.set(x, "eventConditions", js.Array(value :_*))
    
    @scala.inline
    def setUseEventValue(value: Boolean): Self = StObject.set(x, "useEventValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEventValueUndefined: Self = StObject.set(x, "useEventValue", js.undefined)
  }
}
