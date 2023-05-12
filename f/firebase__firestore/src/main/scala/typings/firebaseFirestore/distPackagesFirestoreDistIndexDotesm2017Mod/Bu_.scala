package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2017 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
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
trait Bu_ extends StObject {
  
  /**
    * Resets the backoff delay to the maximum delay (e.g. for use after a
    * RESOURCE_EXHAUSTED error).
    */ def Co(): Unit
  
  /** The last backoff attempt, as epoch milliseconds. */
  var Do: Double
  
  /** Returns a random value in the range [-currentBaseMs/2, currentBaseMs/2] */ def No(): Double
  
  var Po: Double
  
  var So: Any
  
  var Vo: Double
  
  var bo: Double
  
  def cancel(): Unit
  
  def ko(): Unit
  
  /**
    * Resets the backoff delay.
    *
    * The very next backoffAndWait() will have no delay. If it is called again
    * (i.e. due to an error), initialDelayMs (plus jitter) will be used, and
    * subsequent ones will increase according to the backoffFactor.
    */ def reset(): Unit
  
  var si: Any
  
  var timerId: Any
  
  var vo: Double
  
  /**
    * Returns a promise that resolves after currentDelayMs, and increases the
    * delay for any subsequent attempts. If there was a pending backoff operation
    * already, it will be canceled.
    */ def xo(t: Any): Unit
}
object Bu_ {
  
  inline def apply(
    Co: () => Unit,
    Do: Double,
    No: () => Double,
    Po: Double,
    So: Any,
    Vo: Double,
    bo: Double,
    cancel: () => Unit,
    ko: () => Unit,
    reset: () => Unit,
    si: Any,
    timerId: Any,
    vo: Double,
    xo: Any => Unit
  ): Bu_ = {
    val __obj = js.Dynamic.literal(Co = js.Any.fromFunction0(Co), Do = Do.asInstanceOf[js.Any], No = js.Any.fromFunction0(No), Po = Po.asInstanceOf[js.Any], So = So.asInstanceOf[js.Any], Vo = Vo.asInstanceOf[js.Any], bo = bo.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), ko = js.Any.fromFunction0(ko), reset = js.Any.fromFunction0(reset), si = si.asInstanceOf[js.Any], timerId = timerId.asInstanceOf[js.Any], vo = vo.asInstanceOf[js.Any], xo = js.Any.fromFunction1(xo))
    __obj.asInstanceOf[Bu_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bu_] (val x: Self) extends AnyVal {
    
    inline def setBo(value: Double): Self = StObject.set(x, "bo", value.asInstanceOf[js.Any])
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setCo(value: () => Unit): Self = StObject.set(x, "Co", js.Any.fromFunction0(value))
    
    inline def setDo(value: Double): Self = StObject.set(x, "Do", value.asInstanceOf[js.Any])
    
    inline def setKo(value: () => Unit): Self = StObject.set(x, "ko", js.Any.fromFunction0(value))
    
    inline def setNo(value: () => Double): Self = StObject.set(x, "No", js.Any.fromFunction0(value))
    
    inline def setPo(value: Double): Self = StObject.set(x, "Po", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSi(value: Any): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
    
    inline def setSo(value: Any): Self = StObject.set(x, "So", value.asInstanceOf[js.Any])
    
    inline def setTimerId(value: Any): Self = StObject.set(x, "timerId", value.asInstanceOf[js.Any])
    
    inline def setVo(value: Double): Self = StObject.set(x, "Vo", value.asInstanceOf[js.Any])
    
    inline def setXo(value: Any => Unit): Self = StObject.set(x, "xo", js.Any.fromFunction1(value))
  }
}
