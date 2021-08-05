package typings.durandal

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback extends StObject {
    
    def callback(fragment: String): Unit
    
    var routePattern: RegExp
  }
  object Callback {
    
    inline def apply(callback: String => Unit, routePattern: RegExp): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), routePattern = routePattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: String => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setRoutePattern(value: RegExp): Self = StObject.set(x, "routePattern", value.asInstanceOf[js.Any])
    }
  }
}
