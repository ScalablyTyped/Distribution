package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasSchedulesBuilder[B] extends StObject {
  
  def withSchedules(schedules: ExtensionScheduleInput): B = js.native
}
object hasSchedulesBuilder {
  
  @scala.inline
  def apply[B](withSchedules: ExtensionScheduleInput => B): hasSchedulesBuilder[B] = {
    val __obj = js.Dynamic.literal(withSchedules = js.Any.fromFunction1(withSchedules))
    __obj.asInstanceOf[hasSchedulesBuilder[B]]
  }
  
  @scala.inline
  implicit class hasSchedulesBuilderMutableBuilder[Self <: hasSchedulesBuilder[_], B] (val x: Self with hasSchedulesBuilder[B]) extends AnyVal {
    
    @scala.inline
    def setWithSchedules(value: ExtensionScheduleInput => B): Self = StObject.set(x, "withSchedules", js.Any.fromFunction1(value))
  }
}
