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
trait Bh extends StObject {
  
  var _aggregateType: String
  
  var _internalFieldPath: Any
  
  /** A type string to uniquely identify instances of this class. */
  var `type`: String
}
object Bh {
  
  inline def apply(_aggregateType: String, _internalFieldPath: Any, `type`: String): Bh = {
    val __obj = js.Dynamic.literal(_aggregateType = _aggregateType.asInstanceOf[js.Any], _internalFieldPath = _internalFieldPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bh] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_aggregateType(value: String): Self = StObject.set(x, "_aggregateType", value.asInstanceOf[js.Any])
    
    inline def set_internalFieldPath(value: Any): Self = StObject.set(x, "_internalFieldPath", value.asInstanceOf[js.Any])
  }
}
