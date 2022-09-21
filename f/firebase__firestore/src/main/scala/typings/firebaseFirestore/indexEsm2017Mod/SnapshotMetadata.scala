package typings.firebaseFirestore.indexEsm2017Mod

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
  * Metadata about a snapshot, describing the state of the snapshot.
  */ @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "SnapshotMetadata")
@js.native
open class SnapshotMetadata protected ()
  extends StObject
     with Sh {
  /** @hideconstructor */
  def this(t: Any, e: Any) = this()
  
  /* CompleteClass */
  var fromCache: Any = js.native
  
  /* CompleteClass */
  var hasPendingWrites: Any = js.native
  
  /**
    * Returns true if this `SnapshotMetadata` is equal to the provided one.
    *
    * @param other - The `SnapshotMetadata` to compare against.
    * @returns true if this `SnapshotMetadata` is equal to the provided one.
    */ /* CompleteClass */
  override def isEqual(t: Any): Boolean = js.native
}
