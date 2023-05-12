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
  * @license
  * Copyright 2022 Google LLC
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
  * Represents an aggregation that can be performed by Firestore.
  */
@JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "AggregateField")
@js.native
open class AggregateField protected ()
  extends StObject
     with Bh {
  /**
    * Create a new AggregateField<T>
    * @param _aggregateType Specifies the type of aggregation operation to perform.
    * @param _internalFieldPath Optionally specifies the field that is aggregated.
    * @internal
    */
  def this(t: String, e: Any) = this()
  def this(t: Unit, e: Any) = this()
  
  /* CompleteClass */
  var _aggregateType: String = js.native
  
  /* CompleteClass */
  var _internalFieldPath: Any = js.native
  
  /** A type string to uniquely identify instances of this class. */
  /* CompleteClass */
  var `type`: String = js.native
}
