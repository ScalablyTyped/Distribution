package typings.expoModulesCore

import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserWebMod {
  
  @JSImport("expo-modules-core/build/environment/browser.web", "canUseEventListeners")
  @js.native
  val canUseEventListeners: Boolean = js.native
  
  @JSImport("expo-modules-core/build/environment/browser.web", "canUseViewport")
  @js.native
  val canUseViewport: Boolean = js.native
  
  @JSImport("expo-modules-core/build/environment/browser.web", "isAsyncDebugging")
  @js.native
  val isAsyncDebugging: /* false */ Boolean = js.native
  
  @JSImport("expo-modules-core/build/environment/browser.web", "isDOMAvailable")
  @js.native
  val isDOMAvailable: Boolean = js.native
  
  object global {
    
    trait Window extends StObject {
      
      def attachEvent(event: String, listener: EventListener): Boolean
    }
    object Window {
      
      inline def apply(attachEvent: (String, EventListener) => Boolean): Window = {
        val __obj = js.Dynamic.literal(attachEvent = js.Any.fromFunction2(attachEvent))
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setAttachEvent(value: (String, EventListener) => Boolean): Self = StObject.set(x, "attachEvent", js.Any.fromFunction2(value))
      }
    }
  }
}
