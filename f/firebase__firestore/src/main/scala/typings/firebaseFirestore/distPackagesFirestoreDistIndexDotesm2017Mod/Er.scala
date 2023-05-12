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
  */ trait Er extends StObject {
  
  def getBundleMetadata(t: Any, e: Any): Any
  
  def getNamedQuery(t: Any, e: Any): Any
  
  def saveBundleMetadata(t: Any, e: Any): Any
  
  def saveNamedQuery(t: Any, e: Any): Any
}
object Er {
  
  inline def apply(
    getBundleMetadata: (Any, Any) => Any,
    getNamedQuery: (Any, Any) => Any,
    saveBundleMetadata: (Any, Any) => Any,
    saveNamedQuery: (Any, Any) => Any
  ): Er = {
    val __obj = js.Dynamic.literal(getBundleMetadata = js.Any.fromFunction2(getBundleMetadata), getNamedQuery = js.Any.fromFunction2(getNamedQuery), saveBundleMetadata = js.Any.fromFunction2(saveBundleMetadata), saveNamedQuery = js.Any.fromFunction2(saveNamedQuery))
    __obj.asInstanceOf[Er]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Er] (val x: Self) extends AnyVal {
    
    inline def setGetBundleMetadata(value: (Any, Any) => Any): Self = StObject.set(x, "getBundleMetadata", js.Any.fromFunction2(value))
    
    inline def setGetNamedQuery(value: (Any, Any) => Any): Self = StObject.set(x, "getNamedQuery", js.Any.fromFunction2(value))
    
    inline def setSaveBundleMetadata(value: (Any, Any) => Any): Self = StObject.set(x, "saveBundleMetadata", js.Any.fromFunction2(value))
    
    inline def setSaveNamedQuery(value: (Any, Any) => Any): Self = StObject.set(x, "saveNamedQuery", js.Any.fromFunction2(value))
  }
}
