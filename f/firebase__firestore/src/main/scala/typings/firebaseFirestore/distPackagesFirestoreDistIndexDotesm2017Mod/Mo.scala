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
  
  def getBundleMetadata(t: Any, e: Any): vt
  
  def getNamedQuery(t: Any, e: Any): vt
  
  def saveBundleMetadata(t: Any, e: Any): vt
  
  def saveNamedQuery(t: Any, e: Any): vt
  
  var serializer: Any
  
  var us: Map[Any, Any]
}
object Mo {
  
  inline def apply(
    cs: Map[Any, Any],
    getBundleMetadata: (Any, Any) => vt,
    getNamedQuery: (Any, Any) => vt,
    saveBundleMetadata: (Any, Any) => vt,
    saveNamedQuery: (Any, Any) => vt,
    serializer: Any,
    us: Map[Any, Any]
  ): Mo = {
    val __obj = js.Dynamic.literal(cs = cs.asInstanceOf[js.Any], getBundleMetadata = js.Any.fromFunction2(getBundleMetadata), getNamedQuery = js.Any.fromFunction2(getNamedQuery), saveBundleMetadata = js.Any.fromFunction2(saveBundleMetadata), saveNamedQuery = js.Any.fromFunction2(saveNamedQuery), serializer = serializer.asInstanceOf[js.Any], us = us.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mo] (val x: Self) extends AnyVal {
    
    inline def setCs(value: Map[Any, Any]): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
    
    inline def setGetBundleMetadata(value: (Any, Any) => vt): Self = StObject.set(x, "getBundleMetadata", js.Any.fromFunction2(value))
    
    inline def setGetNamedQuery(value: (Any, Any) => vt): Self = StObject.set(x, "getNamedQuery", js.Any.fromFunction2(value))
    
    inline def setSaveBundleMetadata(value: (Any, Any) => vt): Self = StObject.set(x, "saveBundleMetadata", js.Any.fromFunction2(value))
    
    inline def setSaveNamedQuery(value: (Any, Any) => vt): Self = StObject.set(x, "saveNamedQuery", js.Any.fromFunction2(value))
    
    inline def setSerializer(value: Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setUs(value: Map[Any, Any]): Self = StObject.set(x, "us", value.asInstanceOf[js.Any])
  }
}
