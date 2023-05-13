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
  * A `FieldPath` refers to a field in a document. The path may consist of a
  * single field name (referring to a top-level field in the document), or a
  * list of field names (referring to a nested field in the document).
  *
  * Create a `FieldPath` by providing field names. If more than one field
  * name is provided, the path will point to a nested field in a document.
  */ @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "FieldPath")
@js.native
open class FieldPath protected ()
  extends StObject
     with Ln {
  /**
    * Creates a `FieldPath` from the provided field names. If more than one field
    * name is provided, the path will point to a nested field in a document.
    *
    * @param fieldNames - A list of field names.
    */
  def this(t: Any*) = this()
  
  /* CompleteClass */
  var _internalPath: nt = js.native
  
  /**
    * Returns true if this `FieldPath` is equal to the provided one.
    *
    * @param other - The `FieldPath` to compare against.
    * @returns true if this `FieldPath` is equal to the provided one.
    */ /* CompleteClass */
  override def isEqual(t: Any): Boolean = js.native
}
