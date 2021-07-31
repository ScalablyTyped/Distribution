package typings.detectPassiveEvents

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detect-passive-events", JSImport.Default)
  @js.native
  val default: typings.detectPassiveEvents.mod.detectPassiveEvents = js.native
  
  type _To = typings.detectPassiveEvents.mod.detectPassiveEvents
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typings.detectPassiveEvents.mod.detectPassiveEvents = default
  
  trait detectPassiveEvents extends StObject {
    
    var hasSupport: Boolean
    
    def update(): Unit
  }
  object detectPassiveEvents {
    
    @scala.inline
    def apply(hasSupport: Boolean, update: () => Unit): typings.detectPassiveEvents.mod.detectPassiveEvents = {
      val __obj = js.Dynamic.literal(hasSupport = hasSupport.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[typings.detectPassiveEvents.mod.detectPassiveEvents]
    }
    
    @scala.inline
    implicit class detectPassiveEventsMutableBuilder[Self <: typings.detectPassiveEvents.mod.detectPassiveEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasSupport(value: Boolean): Self = StObject.set(x, "hasSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
