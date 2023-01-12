package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventUpdatePropsEvent extends StObject {
  
  /**
    * 修改后的 props
    */
  var props: ComponentProps
}
object EventUpdatePropsEvent {
  
  inline def apply(props: ComponentProps): EventUpdatePropsEvent = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventUpdatePropsEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventUpdatePropsEvent] (val x: Self) extends AnyVal {
    
    inline def setProps(value: ComponentProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
