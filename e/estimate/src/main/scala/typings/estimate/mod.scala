package typings.estimate

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estimate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def element(element: HTMLElement): Estimate = ^.asInstanceOf[js.Dynamic].applyDynamic("element")(element.asInstanceOf[js.Any]).asInstanceOf[Estimate]
  inline def element(element: HTMLElement, options: Options): Estimate = (^.asInstanceOf[js.Dynamic].applyDynamic("element")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Estimate]
  
  inline def text(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def text(text: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Estimate extends StObject {
    
    def initialize(): Unit
    
    var progress: Double
    
    var remaining: Double
    
    var total: Double
    
    def update(): Unit
  }
  object Estimate {
    
    inline def apply(initialize: () => Unit, progress: Double, remaining: Double, total: Double, update: () => Unit): Estimate = {
      val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction0(initialize), progress = progress.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Estimate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Estimate] (val x: Self) extends AnyVal {
      
      inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    var spaces: js.UndefOr[js.RegExp] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setSpaces(value: js.RegExp): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
}
