package typings.firebaseFirestore.indexBrowserEsm2017Mod

import typings.firebaseFirestore.anon.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2020 Google LLC
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
  * The Cloud Firestore service interface.
  *
  * Do not call this constructor directly. Instead, use {@link getFirestore}.
  */ @js.native
trait an extends StObject {
  
  var _app: Any = js.native
  
  var _appCheckCredentials: Any = js.native
  
  var _authCredentials: Any = js.native
  
  var _databaseId: Any = js.native
  
  def _delete(): js.Promise[Unit] = js.native
  
  def _freezeSettings(): cn = js.native
  
  def _getSettings(): cn = js.native
  
  def _initialized: Boolean = js.native
  
  var _persistenceKey: String = js.native
  
  def _setSettings(t: Any): Unit = js.native
  
  var _settings: cn = js.native
  
  var _settingsFrozen: Boolean = js.native
  
  /**
    * Terminates all components used by this client. Subclasses can override
    * this method to clean up their own dependencies, but must also call this
    * method.
    *
    * Only ever called once.
    */ def _terminate(): js.Promise[Unit] = js.native
  
  var _terminateTask: js.UndefOr[js.Promise[Unit]] = js.native
  
  def _terminated: Boolean = js.native
  
  /**
    * The {@link @firebase/app#FirebaseApp} associated with this `Firestore` service
    * instance.
    */ def app: Any = js.native
  
  /** Returns a JSON-serializable representation of this `Firestore` instance. */ def toJSON(): App = js.native
  
  /**
    * Whether it's a Firestore or Firestore Lite instance.
    */
  var `type`: String = js.native
}
