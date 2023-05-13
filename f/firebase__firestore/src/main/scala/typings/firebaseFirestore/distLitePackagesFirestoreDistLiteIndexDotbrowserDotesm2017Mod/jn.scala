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
  * Sentinel values that can be used when writing document fields with `set()`
  * or `update()`.
  */ trait jn extends StObject {
  
  var _methodName: Any
}
object jn {
  
  inline def apply(_methodName: Any): jn = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[jn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: jn] (val x: Self) extends AnyVal {
    
    inline def set_methodName(value: Any): Self = StObject.set(x, "_methodName", value.asInstanceOf[js.Any])
  }
}
