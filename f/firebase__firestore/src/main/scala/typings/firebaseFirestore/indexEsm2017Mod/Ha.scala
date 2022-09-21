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
  */
trait Ha extends StObject {
  
  var _internalPath: ot
  
  /**
    * Returns true if this `FieldPath` is equal to the provided one.
    *
    * @param other - The `FieldPath` to compare against.
    * @returns true if this `FieldPath` is equal to the provided one.
    */ def isEqual(t: Any): Boolean
}
object Ha {
  
  inline def apply(_internalPath: ot, isEqual: Any => Boolean): Ha = {
    val __obj = js.Dynamic.literal(_internalPath = _internalPath.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[Ha]
  }
  
  extension [Self <: Ha](x: Self) {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_internalPath(value: ot): Self = StObject.set(x, "_internalPath", value.asInstanceOf[js.Any])
  }
}
