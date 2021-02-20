package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationSubscription extends StObject {
  
  def remove(): Unit = js.native
}
object LocationSubscription {
  
  @scala.inline
  def apply(remove: () => Unit): LocationSubscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[LocationSubscription]
  }
  
  @scala.inline
  implicit class LocationSubscriptionMutableBuilder[Self <: LocationSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
