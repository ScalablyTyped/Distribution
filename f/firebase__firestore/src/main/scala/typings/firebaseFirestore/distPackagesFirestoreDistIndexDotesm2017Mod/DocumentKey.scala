package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.firebaseFirestore.firebaseFirestoreInts.`-1`
import typings.firebaseFirestore.firebaseFirestoreInts.`0`
import typings.firebaseFirestore.firebaseFirestoreInts.`1`
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
  */ @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "_DocumentKey")
@js.native
open class DocumentKey protected ()
  extends StObject
     with ht {
  def this(t: Any) = this()
}
object DocumentKey {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "_DocumentKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def comparator(t: Any, e: Any): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("comparator")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  
  /* static member */
  inline def empty(): ht = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[ht]
  
  /* static member */
  inline def fromName(t: Any): ht = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(t.asInstanceOf[js.Any]).asInstanceOf[ht]
  
  /* static member */
  inline def fromPath(t: Any): ht = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(t.asInstanceOf[js.Any]).asInstanceOf[ht]
  
  /**
    * Creates and returns a new document key with the given segments.
    *
    * @param segments - The segments of the path to the document
    * @returns A new instance of DocumentKey
    */ /* static member */
  inline def fromSegments(t: Any): ht = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegments")(t.asInstanceOf[js.Any]).asInstanceOf[ht]
  
  /* static member */
  inline def isDocumentKey(t: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentKey")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
