package typings.firebaseFirestore.indexBrowserEsm2017Mod

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
  * A `DocumentSnapshot` contains data read from a document in your Firestore
  * database. The data can be extracted with `.data()` or `.get(<field>)` to
  * get a specific field.
  *
  * For a `DocumentSnapshot` that points to a non-existing document, any data
  * access will return 'undefined'. You can use the `exists()` method to
  * explicitly verify a document's existence.
  */ @js.native
trait Zn extends StObject {
  
  var _converter: Any = js.native
  
  var _document: Any = js.native
  
  var _firestore: Any = js.native
  
  var _key: Any = js.native
  
  var _userDataWriter: Any = js.native
  
  /**
    * Retrieves all fields in the document as an `Object`. Returns `undefined` if
    * the document doesn't exist.
    *
    * @returns An `Object` containing all fields in the document or `undefined`
    * if the document doesn't exist.
    */ def data(): Any = js.native
  
  /**
    * Signals whether or not the document at the snapshot's location exists.
    *
    * @returns true if the document exists.
    */ def exists(): Boolean = js.native
  
  /**
    * Retrieves the field specified by `fieldPath`. Returns `undefined` if the
    * document or field doesn't exist.
    *
    * @param fieldPath - The path (for example 'foo' or 'foo.bar') to a specific
    * field.
    * @returns The data at the specified field location or undefined if no such
    * field exists in the document.
    */
  def get(t: Any): Any = js.native
  
  /** Property of the `DocumentSnapshot` that provides the document's ID. */ def id: Any = js.native
  
  /**
    * The `DocumentReference` for the document included in the `DocumentSnapshot`.
    */ def ref: wn = js.native
}
