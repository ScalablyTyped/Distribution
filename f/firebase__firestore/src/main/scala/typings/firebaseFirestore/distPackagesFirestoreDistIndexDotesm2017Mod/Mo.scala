package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.std.Map
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
  */ trait Mo extends StObject {
  
  var cs: Map[Any, Any]
  
  def getBundleMetadata(t: Any, e: Any): Rt_
  
  def getNamedQuery(t: Any, e: Any): Rt_
  
  var hs: Map[Any, Any]
  
  def saveBundleMetadata(t: Any, e: Any): Rt_
  
  def saveNamedQuery(t: Any, e: Any): Rt_
  
  var serializer: Any
}
object Mo {
  
  inline def apply(
    cs: Map[Any, Any],
    getBundleMetadata: (Any, Any) => Rt_,
    getNamedQuery: (Any, Any) => Rt_,
    hs: Map[Any, Any],
    saveBundleMetadata: (Any, Any) => Rt_,
    saveNamedQuery: (Any, Any) => Rt_,
    serializer: Any
  ): Mo = {
    val __obj = js.Dynamic.literal(cs = cs.asInstanceOf[js.Any], getBundleMetadata = js.Any.fromFunction2(getBundleMetadata), getNamedQuery = js.Any.fromFunction2(getNamedQuery), hs = hs.asInstanceOf[js.Any], saveBundleMetadata = js.Any.fromFunction2(saveBundleMetadata), saveNamedQuery = js.Any.fromFunction2(saveNamedQuery), serializer = serializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mo] (val x: Self) extends AnyVal {
    
    inline def setCs(value: Map[Any, Any]): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
    
    inline def setGetBundleMetadata(value: (Any, Any) => Rt_): Self = StObject.set(x, "getBundleMetadata", js.Any.fromFunction2(value))
    
    inline def setGetNamedQuery(value: (Any, Any) => Rt_): Self = StObject.set(x, "getNamedQuery", js.Any.fromFunction2(value))
    
    inline def setHs(value: Map[Any, Any]): Self = StObject.set(x, "hs", value.asInstanceOf[js.Any])
    
    inline def setSaveBundleMetadata(value: (Any, Any) => Rt_): Self = StObject.set(x, "saveBundleMetadata", js.Any.fromFunction2(value))
    
    inline def setSaveNamedQuery(value: (Any, Any) => Rt_): Self = StObject.set(x, "saveNamedQuery", js.Any.fromFunction2(value))
    
    inline def setSerializer(value: Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
  }
}
