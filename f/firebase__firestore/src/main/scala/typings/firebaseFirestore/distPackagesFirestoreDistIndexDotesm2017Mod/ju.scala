package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.std.Map
import typings.std.Set
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
  */ trait ju extends StObject {
  
  /**
    * A set of reasons for why the RemoteStore may be offline. If empty, the
    * RemoteStore may start its network connections.
    */
  var Au: Set[Any]
  
  /**
    * A mapping of watched targets that the client cares about tracking and the
    * user has explicitly called a 'listen' for this target.
    *
    * These targets may or may not have been sent to or acknowledged by the
    * server. On re-establishing the listen stream, these targets should be sent
    * to the server. The targets removed with unlistens are removed eagerly
    * without waiting for confirmation from the listen stream.
    */
  var Eu: Map[Any, Any]
  
  var Pu: Qu
  
  /**
    * Event handlers that get called when the network is disabled or enabled.
    *
    * PORTING NOTE: These functions are used on the Web client to create the
    * underlying streams (to support tree-shakeable streams). On Android and iOS,
    * the streams are created during construction of RemoteStore.
    */
  var Ru: js.Array[Any]
  
  /**
    * A list of up to MAX_PENDING_WRITES writes that we have fetched from the
    * LocalStore via fillWritePipeline() and have or will send to the write
    * stream.
    *
    * Whenever writePipeline.length > 0 the RemoteStore will attempt to start or
    * restart the write stream. When the stream is established the writes in the
    * pipeline will be sent in order.
    *
    * Writes remain in writePipeline until they are acknowledged by the backend
    * and thus will automatically be re-sent if the stream is interrupted /
    * restarted before they're acknowledged.
    *
    * Write responses from the backend are linked to their originating request
    * purely based on order, and so we can just shift() writes from the front of
    * the writePipeline as we receive responses.
    */
  var Tu: js.Array[Any]
  
  var asyncQueue: Any
  
  var datastore: Any
  
  var localStore: Any
  
  var vu: Any
}
object ju {
  
  inline def apply(
    Au: Set[Any],
    Eu: Map[Any, Any],
    Pu: Qu,
    Ru: js.Array[Any],
    Tu: js.Array[Any],
    asyncQueue: Any,
    datastore: Any,
    localStore: Any,
    vu: Any
  ): ju = {
    val __obj = js.Dynamic.literal(Au = Au.asInstanceOf[js.Any], Eu = Eu.asInstanceOf[js.Any], Pu = Pu.asInstanceOf[js.Any], Ru = Ru.asInstanceOf[js.Any], Tu = Tu.asInstanceOf[js.Any], asyncQueue = asyncQueue.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], localStore = localStore.asInstanceOf[js.Any], vu = vu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ju]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ju] (val x: Self) extends AnyVal {
    
    inline def setAsyncQueue(value: Any): Self = StObject.set(x, "asyncQueue", value.asInstanceOf[js.Any])
    
    inline def setAu(value: Set[Any]): Self = StObject.set(x, "Au", value.asInstanceOf[js.Any])
    
    inline def setDatastore(value: Any): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    inline def setEu(value: Map[Any, Any]): Self = StObject.set(x, "Eu", value.asInstanceOf[js.Any])
    
    inline def setLocalStore(value: Any): Self = StObject.set(x, "localStore", value.asInstanceOf[js.Any])
    
    inline def setPu(value: Qu): Self = StObject.set(x, "Pu", value.asInstanceOf[js.Any])
    
    inline def setRu(value: js.Array[Any]): Self = StObject.set(x, "Ru", value.asInstanceOf[js.Any])
    
    inline def setRuVarargs(value: Any*): Self = StObject.set(x, "Ru", js.Array(value*))
    
    inline def setTu(value: js.Array[Any]): Self = StObject.set(x, "Tu", value.asInstanceOf[js.Any])
    
    inline def setTuVarargs(value: Any*): Self = StObject.set(x, "Tu", js.Array(value*))
    
    inline def setVu(value: Any): Self = StObject.set(x, "vu", value.asInstanceOf[js.Any])
  }
}
