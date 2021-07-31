package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvent
  extends StObject
     with IBase {
  
  /** [Property] (Boolean) */
  var isEvent: js.UndefOr[Boolean] = js.undefined
}
object IEvent {
  
  @scala.inline
  def apply(): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvent]
  }
  
  @scala.inline
  implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEvent(value: Boolean): Self = StObject.set(x, "isEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEventUndefined: Self = StObject.set(x, "isEvent", js.undefined)
  }
}
