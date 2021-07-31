package typings.estimate

import typings.std.HTMLElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estimate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def element(element: HTMLElement): Estimate = ^.asInstanceOf[js.Dynamic].applyDynamic("element")(element.asInstanceOf[js.Any]).asInstanceOf[Estimate]
  @scala.inline
  def element(element: HTMLElement, options: Options): Estimate = (^.asInstanceOf[js.Dynamic].applyDynamic("element")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Estimate]
  
  @scala.inline
  def text(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def text(text: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Estimate extends StObject {
    
    def initialize(): Unit
    
    var progress: Double
    
    var remaining: Double
    
    var total: Double
    
    def update(): Unit
  }
  object Estimate {
    
    @scala.inline
    def apply(initialize: () => Unit, progress: Double, remaining: Double, total: Double, update: () => Unit): Estimate = {
      val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction0(initialize), progress = progress.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Estimate]
    }
    
    @scala.inline
    implicit class EstimateMutableBuilder[Self <: Estimate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    var spaces: js.UndefOr[RegExp] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpaces(value: RegExp): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
}
