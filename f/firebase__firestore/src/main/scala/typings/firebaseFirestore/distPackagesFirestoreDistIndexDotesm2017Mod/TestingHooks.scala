package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2023 Google LLC
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
  * Manages "testing hooks", hooks into the internals of the SDK to verify
  * internal state and events during integration tests. Do not use this class
  * except for testing purposes.
  *
  * There are two ways to retrieve the global singleton instance of this class:
  * 1. The `instance` property, which returns null if the global singleton
  *      instance has not been created. Use this property if the caller should
  *      "do nothing" if there are no testing hooks registered, such as when
  *      delivering an event to notify registered callbacks.
  * 2. The `getOrCreateInstance()` method, which creates the global singleton
  *      instance if it has not been created. Use this method if the instance is
  *      needed to, for example, register a callback.
  *
  * @internal
  */
@JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "_TestingHooks")
@js.native
open class TestingHooks ()
  extends StObject
     with ci {
  
  /**
    * Invokes all currently-registered `onExistenceFilterMismatch` callbacks.
    * @param info Information about the existence filter mismatch.
    */ /* CompleteClass */
  override def notifyOnExistenceFilterMismatch(t: Any): Unit = js.native
  
  /**
    * Registers a callback to be notified when an existence filter mismatch
    * occurs in the Watch listen stream.
    *
    * The relative order in which callbacks are notified is unspecified; do not
    * rely on any particular ordering. If a given callback is registered multiple
    * times then it will be notified multiple times, once per registration.
    *
    * @param callback the callback to invoke upon existence filter mismatch.
    *
    * @return a function that, when called, unregisters the given callback; only
    * the first invocation of the returned function does anything; all subsequent
    * invocations do nothing.
    */ /* CompleteClass */
  override def onExistenceFilterMismatch(t: Any): js.Function0[Boolean] = js.native
  
  /* CompleteClass */
  var onExistenceFilterMismatchCallbacks: Map[Any, Any] = js.native
}
object TestingHooks {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "_TestingHooks")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the singleton instance of this class, creating it if is has never
    * been created before.
    */ /* static member */
  inline def getOrCreateInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateInstance")().asInstanceOf[Any]
}
