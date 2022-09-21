package typings.firebaseFirestore.indexBrowserEsm2017Mod

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
/** A field path and the TransformOperation to perform upon it. */ trait Ae extends StObject {
  
  var field: Any
  
  var transform: Any
}
object Ae {
  
  inline def apply(field: Any, transform: Any): Ae = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ae]
  }
  
  extension [Self <: Ae](x: Self) {
    
    inline def setField(value: Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Any): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
