package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

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
  * A `DocumentReference` refers to a document location in a Firestore database
  * and can be used to write, read, or listen to the location. The document at
  * the referenced location may or may not exist.
  */ @js.native
trait Dn extends StObject {
  
  var _key: Any = js.native
  
  def _path: Any = js.native
  
  var converter: Any = js.native
  
  var firestore: Any = js.native
  
  /**
    * The document's identifier within its collection.
    */ def id: Any = js.native
  
  /**
    * The collection this `DocumentReference` belongs to.
    */ def parent: xn = js.native
  
  /**
    * A string representing the path of the referenced document (relative
    * to the root of the database).
    */ def path: Any = js.native
  
  /** The type of this Firestore reference. */
  var `type`: String = js.native
  
  def withConverter(t: Any): Dn = js.native
}
