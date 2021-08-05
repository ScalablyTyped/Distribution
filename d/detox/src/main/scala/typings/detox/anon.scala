package typings.detox

import typings.detox.mod.global.Detox_.CircusTestEventListenerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddEventsListener extends StObject {
    
    /**
      * Registers a listener such as an adapter or reporter
      * @param listener
      * @example
      * detoxCircus.getEnv().addEventsListener(adapter)
      * detoxCircus.getEnv().addEventsListener(assignReporter)
      */
    def addEventsListener(listener: CircusTestEventListenerBase): Unit
  }
  object AddEventsListener {
    
    inline def apply(addEventsListener: CircusTestEventListenerBase => Unit): AddEventsListener = {
      val __obj = js.Dynamic.literal(addEventsListener = js.Any.fromFunction1(addEventsListener))
      __obj.asInstanceOf[AddEventsListener]
    }
    
    extension [Self <: AddEventsListener](x: Self) {
      
      inline def setAddEventsListener(value: CircusTestEventListenerBase => Unit): Self = StObject.set(x, "addEventsListener", js.Any.fromFunction1(value))
    }
  }
  
  trait SourceApp extends StObject {
    
    var sourceApp: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object SourceApp {
    
    inline def apply(url: String): SourceApp = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceApp]
    }
    
    extension [Self <: SourceApp](x: Self) {
      
      inline def setSourceApp(value: String): Self = StObject.set(x, "sourceApp", value.asInstanceOf[js.Any])
      
      inline def setSourceAppUndefined: Self = StObject.set(x, "sourceApp", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
