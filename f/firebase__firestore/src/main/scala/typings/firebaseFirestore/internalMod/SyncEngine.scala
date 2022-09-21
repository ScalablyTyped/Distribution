package typings.firebaseFirestore.internalMod

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
  * SyncEngine is the central controller in the client SDK architecture. It is
  * the glue code between the EventManager, LocalStore, and RemoteStore. Some of
  * SyncEngine's responsibilities include:
  * 1. Coordinating client requests and remote events between the EventManager
  *    and the local and remote data stores.
  * 2. Managing a View object for each query, providing the unified view between
  *    the local and remote data stores.
  * 3. Notifying the RemoteStore when the LocalStore has new mutations in its
  *    queue that need sending to the backend.
  *
  * The SyncEngine’s methods should only ever be called by methods running in the
  * global async queue.
  *
  * PORTING NOTE: On Web, SyncEngine does not have an explicit subscribe()
  * function. Instead, it directly depends on EventManager's tree-shakeable API
  * (via `ensureWatchStream()`).
  */
trait SyncEngine extends StObject {
  
  var isPrimaryClient: Boolean
}
object SyncEngine {
  
  inline def apply(isPrimaryClient: Boolean): SyncEngine = {
    val __obj = js.Dynamic.literal(isPrimaryClient = isPrimaryClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEngine]
  }
  
  extension [Self <: SyncEngine](x: Self) {
    
    inline def setIsPrimaryClient(value: Boolean): Self = StObject.set(x, "isPrimaryClient", value.asInstanceOf[js.Any])
  }
}
