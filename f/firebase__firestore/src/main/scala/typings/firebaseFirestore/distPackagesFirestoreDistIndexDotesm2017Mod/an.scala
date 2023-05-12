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
  * Represents a document in Firestore with a key, version, data and whether it
  * has local mutations applied to it.
  *
  * Documents can transition between states via `convertToFoundDocument()`,
  * `convertToNoDocument()` and `convertToUnknownDocument()`. If a document does
  * not transition to one of these states even after all mutations have been
  * applied, `isValidDocument()` returns false and the document should be removed
  * from all views.
  */ @js.native
trait an extends StObject {
  
  /**
    * Changes the document type to indicate that it exists and that its version
    * and data are known.
    */ def convertToFoundDocument(t: Any, e: Any): an = js.native
  
  /**
    * Changes the document type to indicate that it doesn't exist at the given
    * version.
    */ def convertToNoDocument(t: Any): an = js.native
  
  /**
    * Changes the document type to indicate that it exists at a given version but
    * that its data is not known (e.g. a document that was updated without a known
    * base document).
    */ def convertToUnknownDocument(t: Any): an = js.native
  
  var createTime: Any = js.native
  
  var data: Any = js.native
  
  var documentState: Any = js.native
  
  var documentType: Any = js.native
  
  def hasCommittedMutations: Boolean = js.native
  
  def hasLocalMutations: Boolean = js.native
  
  def hasPendingWrites: Boolean = js.native
  
  def isEqual(t: Any): Any = js.native
  
  def isFoundDocument(): Boolean = js.native
  
  def isNoDocument(): Boolean = js.native
  
  def isUnknownDocument(): Boolean = js.native
  
  def isValidDocument(): Boolean = js.native
  
  var key: Any = js.native
  
  def mutableCopy(): an = js.native
  
  var readTime: Any = js.native
  
  def setHasCommittedMutations(): an = js.native
  
  def setHasLocalMutations(): an = js.native
  
  def setReadTime(t: Any): an = js.native
  
  var version: Any = js.native
}
