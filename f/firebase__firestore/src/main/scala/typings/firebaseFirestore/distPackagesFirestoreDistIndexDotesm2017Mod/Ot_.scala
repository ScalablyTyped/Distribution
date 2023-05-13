package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2018 Google LLC
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
  * `ListenSequence` is a monotonic sequence. It is initialized with a minimum value to
  * exceed. All subsequent calls to next will return increasing values. If provided with a
  * `SequenceNumberSyncer`, it will additionally bump its next value when told of a new value, as
  * well as write out sequence numbers that it produces via `next()`.
  */ trait Ot_ extends StObject {
  
  def next(): Double
  
  def ot(t: Any): Any
  
  var previousValue: Any
  
  var ut: js.UndefOr[js.Function1[/* t */ Any, Any]] = js.undefined
}
object Ot_ {
  
  inline def apply(next: () => Double, ot: Any => Any, previousValue: Any): Ot_ = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), ot = js.Any.fromFunction1(ot), previousValue = previousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ot_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ot_] (val x: Self) extends AnyVal {
    
    inline def setNext(value: () => Double): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setOt(value: Any => Any): Self = StObject.set(x, "ot", js.Any.fromFunction1(value))
    
    inline def setPreviousValue(value: Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setUt(value: /* t */ Any => Any): Self = StObject.set(x, "ut", js.Any.fromFunction1(value))
    
    inline def setUtUndefined: Self = StObject.set(x, "ut", js.undefined)
  }
}
