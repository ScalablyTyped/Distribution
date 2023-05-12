package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewPropsTransformer extends StObject {
  
  def transform(viewProps: ViewProps, calendarProps: CalendarContentProps): Any
}
object ViewPropsTransformer {
  
  inline def apply(transform: (ViewProps, CalendarContentProps) => Any): ViewPropsTransformer = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2(transform))
    __obj.asInstanceOf[ViewPropsTransformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewPropsTransformer] (val x: Self) extends AnyVal {
    
    inline def setTransform(value: (ViewProps, CalendarContentProps) => Any): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
  }
}
