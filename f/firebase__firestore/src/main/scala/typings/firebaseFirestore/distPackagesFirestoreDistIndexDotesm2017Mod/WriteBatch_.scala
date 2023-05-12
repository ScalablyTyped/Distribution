package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

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
  * A write batch, used to perform multiple writes as a single atomic unit.
  *
  * A `WriteBatch` object can be acquired by calling {@link writeBatch}. It
  * provides methods for adding writes to the write batch. None of the writes
  * will be committed (or visible locally) until {@link WriteBatch.commit} is
  * called.
  */
@JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "WriteBatch")
@js.native
open class WriteBatch_ protected ()
  extends StObject
     with Ff {
  /** @hideconstructor */
  def this(t: Any, e: Any) = this()
  
  /* CompleteClass */
  var _commitHandler: Any = js.native
  
  /* CompleteClass */
  var _committed: Boolean = js.native
  
  /* CompleteClass */
  var _dataReader: Yh = js.native
  
  /* CompleteClass */
  var _firestore: Any = js.native
  
  /* CompleteClass */
  var _mutations: js.Array[Any] = js.native
  
  /* CompleteClass */
  override def _verifyNotCommitted(): Unit = js.native
  
  /**
    * Commits all of the writes in this write batch as a single atomic unit.
    *
    * The result of these writes will only be reflected in document reads that
    * occur after the returned promise resolves. If the client is offline, the
    * write fails. If you would like to see local modifications or buffer writes
    * until the client is online, use the full Firestore SDK.
    *
    * @returns A `Promise` resolved once all of the writes in the batch have been
    * successfully written to the backend as an atomic unit (note that it won't
    * resolve while you're offline).
    */ /* CompleteClass */
  override def commit(): Any = js.native
  
  /**
    * Deletes the document referred to by the provided {@link DocumentReference}.
    *
    * @param documentRef - A reference to the document to be deleted.
    * @returns This `WriteBatch` instance. Used for chaining method calls.
    */ /* CompleteClass */
  override def delete(t: Any): Ff = js.native
  
  /* CompleteClass */
  override def set(t: Any, e: Any, n: Any): Ff = js.native
  
  /* CompleteClass */
  override def update(t: Any, e: Any, n: Any, s: Any*): Ff = js.native
}
