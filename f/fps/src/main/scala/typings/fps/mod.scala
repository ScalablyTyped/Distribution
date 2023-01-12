package typings.fps

import typings.fps.fpsStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): FPSObject = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FPSObject]
  inline def apply(options: FPSOptions): FPSObject = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FPSObject]
  
  @JSImport("fps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FPSObject extends StObject {
    
    var decay: Double
    
    var every: Double
    
    var last: Double
    
    @JSName("on")
    def on_data(event: data, callback: js.Function1[/* frames */ Double, Unit]): Unit
    
    var rate: Double
    
    def tick(): Unit
    
    var ticks: Double
    
    var time: Double
  }
  object FPSObject {
    
    inline def apply(
      decay: Double,
      every: Double,
      last: Double,
      on: (data, js.Function1[/* frames */ Double, Unit]) => Unit,
      rate: Double,
      tick: () => Unit,
      ticks: Double,
      time: Double
    ): FPSObject = {
      val __obj = js.Dynamic.literal(decay = decay.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), rate = rate.asInstanceOf[js.Any], tick = js.Any.fromFunction0(tick), ticks = ticks.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[FPSObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FPSObject] (val x: Self) extends AnyVal {
      
      inline def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      inline def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (data, js.Function1[/* frames */ Double, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setTick(value: () => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction0(value))
      
      inline def setTicks(value: Double): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait FPSOptions extends StObject {
    
    /** How many frames to tick before emitting. Defaults to 1. */
    var decay: js.UndefOr[Double] = js.undefined
    
    /** The rate of change between old and new results. 1 is instantaneous, 0 is never. */
    var every: js.UndefOr[Double] = js.undefined
  }
  object FPSOptions {
    
    inline def apply(): FPSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FPSOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FPSOptions] (val x: Self) extends AnyVal {
      
      inline def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      inline def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
      
      inline def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
    }
  }
}
