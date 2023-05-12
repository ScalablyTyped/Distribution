package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
/** Represents an index entry saved by the SDK in persisted storage. */ trait kr extends StObject {
  
  /**
    * Returns an IndexEntry entry that sorts immediately after the current
    * directional value.
    */ def He(): kr
  
  var arrayValue: Any
  
  var directionalValue: Any
  
  var documentKey: Any
  
  var indexId: Any
}
object kr {
  
  inline def apply(He: () => kr, arrayValue: Any, directionalValue: Any, documentKey: Any, indexId: Any): kr = {
    val __obj = js.Dynamic.literal(He = js.Any.fromFunction0(He), arrayValue = arrayValue.asInstanceOf[js.Any], directionalValue = directionalValue.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], indexId = indexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[kr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: kr] (val x: Self) extends AnyVal {
    
    inline def setArrayValue(value: Any): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
    
    inline def setDirectionalValue(value: Any): Self = StObject.set(x, "directionalValue", value.asInstanceOf[js.Any])
    
    inline def setDocumentKey(value: Any): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
    
    inline def setHe(value: () => kr): Self = StObject.set(x, "He", js.Any.fromFunction0(value))
    
    inline def setIndexId(value: Any): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
  }
}
