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
  * Datastore and its related methods are a wrapper around the external Google
  * Cloud Datastore grpc API, which provides an interface that is more convenient
  * for the rest of the client SDK architecture to consume.
  */
/**
  * An implementation of Datastore that exposes additional state for internal
  * consumption.
  */
trait Ku extends StObject {
  
  /** Invokes the provided RPC with auth and AppCheck tokens. */ def Io(t: Any, e: Any, n: Any): js.Promise[Any]
  
  var appCheckCredentials: Any
  
  var authCredentials: Any
  
  var connection: Any
  
  def fu(): Unit
  
  var lu: Boolean
  
  var serializer: Any
  
  def terminate(): Unit
  
  /** Invokes the provided RPC with streamed results with auth and AppCheck tokens. */ def vo(t: Any, e: Any, n: Any, s: Any): js.Promise[Any]
}
object Ku {
  
  inline def apply(
    Io: (Any, Any, Any) => js.Promise[Any],
    appCheckCredentials: Any,
    authCredentials: Any,
    connection: Any,
    fu: () => Unit,
    lu: Boolean,
    serializer: Any,
    terminate: () => Unit,
    vo: (Any, Any, Any, Any) => js.Promise[Any]
  ): Ku = {
    val __obj = js.Dynamic.literal(Io = js.Any.fromFunction3(Io), appCheckCredentials = appCheckCredentials.asInstanceOf[js.Any], authCredentials = authCredentials.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], fu = js.Any.fromFunction0(fu), lu = lu.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate), vo = js.Any.fromFunction4(vo))
    __obj.asInstanceOf[Ku]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ku] (val x: Self) extends AnyVal {
    
    inline def setAppCheckCredentials(value: Any): Self = StObject.set(x, "appCheckCredentials", value.asInstanceOf[js.Any])
    
    inline def setAuthCredentials(value: Any): Self = StObject.set(x, "authCredentials", value.asInstanceOf[js.Any])
    
    inline def setConnection(value: Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setFu(value: () => Unit): Self = StObject.set(x, "fu", js.Any.fromFunction0(value))
    
    inline def setIo(value: (Any, Any, Any) => js.Promise[Any]): Self = StObject.set(x, "Io", js.Any.fromFunction3(value))
    
    inline def setLu(value: Boolean): Self = StObject.set(x, "lu", value.asInstanceOf[js.Any])
    
    inline def setSerializer(value: Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
    
    inline def setVo(value: (Any, Any, Any, Any) => js.Promise[Any]): Self = StObject.set(x, "vo", js.Any.fromFunction4(value))
  }
}
