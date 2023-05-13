package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

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
/** Serializer for values stored in the LocalStore. */ trait ar extends StObject {
  
  var fe: Any
}
object ar {
  
  inline def apply(fe: Any): ar = {
    val __obj = js.Dynamic.literal(fe = fe.asInstanceOf[js.Any])
    __obj.asInstanceOf[ar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ar] (val x: Self) extends AnyVal {
    
    inline def setFe(value: Any): Self = StObject.set(x, "fe", value.asInstanceOf[js.Any])
  }
}
