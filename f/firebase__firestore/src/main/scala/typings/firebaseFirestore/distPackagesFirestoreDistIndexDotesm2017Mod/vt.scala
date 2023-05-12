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
  * PersistencePromise is essentially a re-implementation of Promise except
  * it has a .next() method instead of .then() and .next() and .catch() callbacks
  * are executed synchronously when a PersistencePromise resolves rather than
  * asynchronously (Promise implementations use setImmediate() or similar).
  *
  * This is necessary to interoperate with IndexedDB which will automatically
  * commit transactions if control is returned to the event loop without
  * synchronously initiating another operation on the transaction.
  *
  * NOTE: .then() and .catch() only allow a single consumer, unlike normal
  * Promises.
  */ trait vt extends StObject {
  
  var callbackAttached: Boolean
  
  def `catch`(t: Any): vt
  
  var catchCallback: (js.Function1[/* t */ Any, Unit]) | Null
  
  var error: Any
  
  var isDone: Boolean
  
  def next(t: Any, e: Any): vt
  
  var nextCallback: (js.Function1[/* e */ Any, Unit]) | Null
  
  var result: Any
  
  def toPromise(): js.Promise[Any]
  
  def wrapFailure(t: Any, e: Any): vt
  
  def wrapSuccess(t: Any, e: Any): vt
  
  def wrapUserFunction(t: Any): vt
}
object vt {
  
  inline def apply(
    callbackAttached: Boolean,
    `catch`: Any => vt,
    error: Any,
    isDone: Boolean,
    next: (Any, Any) => vt,
    result: Any,
    toPromise: () => js.Promise[Any],
    wrapFailure: (Any, Any) => vt,
    wrapSuccess: (Any, Any) => vt,
    wrapUserFunction: Any => vt
  ): vt = {
    val __obj = js.Dynamic.literal(callbackAttached = callbackAttached.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isDone = isDone.asInstanceOf[js.Any], next = js.Any.fromFunction2(next), result = result.asInstanceOf[js.Any], toPromise = js.Any.fromFunction0(toPromise), wrapFailure = js.Any.fromFunction2(wrapFailure), wrapSuccess = js.Any.fromFunction2(wrapSuccess), wrapUserFunction = js.Any.fromFunction1(wrapUserFunction), catchCallback = null, nextCallback = null)
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.asInstanceOf[vt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vt] (val x: Self) extends AnyVal {
    
    inline def setCallbackAttached(value: Boolean): Self = StObject.set(x, "callbackAttached", value.asInstanceOf[js.Any])
    
    inline def setCatch(value: Any => vt): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
    
    inline def setCatchCallback(value: /* t */ Any => Unit): Self = StObject.set(x, "catchCallback", js.Any.fromFunction1(value))
    
    inline def setCatchCallbackNull: Self = StObject.set(x, "catchCallback", null)
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIsDone(value: Boolean): Self = StObject.set(x, "isDone", value.asInstanceOf[js.Any])
    
    inline def setNext(value: (Any, Any) => vt): Self = StObject.set(x, "next", js.Any.fromFunction2(value))
    
    inline def setNextCallback(value: /* e */ Any => Unit): Self = StObject.set(x, "nextCallback", js.Any.fromFunction1(value))
    
    inline def setNextCallbackNull: Self = StObject.set(x, "nextCallback", null)
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setToPromise(value: () => js.Promise[Any]): Self = StObject.set(x, "toPromise", js.Any.fromFunction0(value))
    
    inline def setWrapFailure(value: (Any, Any) => vt): Self = StObject.set(x, "wrapFailure", js.Any.fromFunction2(value))
    
    inline def setWrapSuccess(value: (Any, Any) => vt): Self = StObject.set(x, "wrapSuccess", js.Any.fromFunction2(value))
    
    inline def setWrapUserFunction(value: Any => vt): Self = StObject.set(x, "wrapUserFunction", js.Any.fromFunction1(value))
  }
}
