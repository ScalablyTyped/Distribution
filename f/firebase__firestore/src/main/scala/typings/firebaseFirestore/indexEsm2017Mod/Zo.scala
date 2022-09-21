package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of the Platform's 'TextEncoder' implementation.
  */
/**
  * A helper for running delayed tasks following an exponential backoff curve
  * between attempts.
  *
  * Each delay is made up of a "base" delay which follows the exponential
  * backoff curve, and a +/- 50% "jitter" that is calculated and added to the
  * base delay. This prevents clients from accidentally synchronizing their
  * delays causing spikes of load to the backend.
  */
trait Zo extends StObject {
  
  /**
    * Returns a promise that resolves after currentDelayMs, and increases the
    * delay for any subsequent attempts. If there was a pending backoff operation
    * already, it will be canceled.
    */ def Ao(t: Any): Unit
  
  /**
    * Resets the backoff delay to the maximum delay (e.g. for use after a
    * RESOURCE_EXHAUSTED error).
    */ def Eo(): Unit
  
  var Hs: Any
  
  var Io: Any
  
  /** Returns a random value in the range [-currentBaseMs/2, currentBaseMs/2] */ def Ro(): Double
  
  /** The last backoff attempt, as epoch milliseconds. */
  var To: Double
  
  def bo(): Unit
  
  def cancel(): Unit
  
  var mo: Double
  
  var po: Double
  
  /**
    * Resets the backoff delay.
    *
    * The very next backoffAndWait() will have no delay. If it is called again
    * (i.e. due to an error), initialDelayMs (plus jitter) will be used, and
    * subsequent ones will increase according to the backoffFactor.
    */ def reset(): Unit
  
  var timerId: Any
  
  var wo: Double
  
  var yo: Double
}
object Zo {
  
  inline def apply(
    Ao: Any => Unit,
    Eo: () => Unit,
    Hs: Any,
    Io: Any,
    Ro: () => Double,
    To: Double,
    bo: () => Unit,
    cancel: () => Unit,
    mo: Double,
    po: Double,
    reset: () => Unit,
    timerId: Any,
    wo: Double,
    yo: Double
  ): Zo = {
    val __obj = js.Dynamic.literal(Ao = js.Any.fromFunction1(Ao), Eo = js.Any.fromFunction0(Eo), Hs = Hs.asInstanceOf[js.Any], Io = Io.asInstanceOf[js.Any], Ro = js.Any.fromFunction0(Ro), To = To.asInstanceOf[js.Any], bo = js.Any.fromFunction0(bo), cancel = js.Any.fromFunction0(cancel), mo = mo.asInstanceOf[js.Any], po = po.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), timerId = timerId.asInstanceOf[js.Any], wo = wo.asInstanceOf[js.Any], yo = yo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zo]
  }
  
  extension [Self <: Zo](x: Self) {
    
    inline def setAo(value: Any => Unit): Self = StObject.set(x, "Ao", js.Any.fromFunction1(value))
    
    inline def setBo(value: () => Unit): Self = StObject.set(x, "bo", js.Any.fromFunction0(value))
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setEo(value: () => Unit): Self = StObject.set(x, "Eo", js.Any.fromFunction0(value))
    
    inline def setHs(value: Any): Self = StObject.set(x, "Hs", value.asInstanceOf[js.Any])
    
    inline def setIo(value: Any): Self = StObject.set(x, "Io", value.asInstanceOf[js.Any])
    
    inline def setMo(value: Double): Self = StObject.set(x, "mo", value.asInstanceOf[js.Any])
    
    inline def setPo(value: Double): Self = StObject.set(x, "po", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setRo(value: () => Double): Self = StObject.set(x, "Ro", js.Any.fromFunction0(value))
    
    inline def setTimerId(value: Any): Self = StObject.set(x, "timerId", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Double): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setWo(value: Double): Self = StObject.set(x, "wo", value.asInstanceOf[js.Any])
    
    inline def setYo(value: Double): Self = StObject.set(x, "yo", value.asInstanceOf[js.Any])
  }
}
