package typings.firebaseFirestore.indexEsm2017Mod

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
  * @internal
  */ @js.native
trait ut extends StObject {
  
  def collectionGroup: Any = js.native
  
  /** Returns the collection group (i.e. the name of the parent collection) for this key. */ def getCollectionGroup(): Any = js.native
  
  /** Returns the fully qualified path to the parent collection. */ def getCollectionPath(): Any = js.native
  
  /** Returns true if the document is in the specified collectionId. */ def hasCollectionId(t: Any): Boolean = js.native
  
  def isEqual(t: Any): Boolean = js.native
  
  var path: Any = js.native
}
