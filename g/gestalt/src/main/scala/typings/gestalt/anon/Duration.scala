package typings.gestalt.anon

import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: Double
  
  var event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]
}
object Duration {
  
  @scala.inline
  def apply(duration: Double, event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
