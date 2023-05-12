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
/**
  * Implementation of DocumentOverlayCache using IndexedDb.
  */ trait vr extends StObject {
  
  def de(t: Any, e: Any): Any
  
  def getOverlay(t: Any, e: Any): Any
  
  def getOverlays(t: Any, e: Any): vt
  
  def getOverlaysForCollection(t: Any, e: Any, n: Any): Any
  
  def getOverlaysForCollectionGroup(t: Any, e: Any, n: Any, s: Any): Any
  
  def removeOverlaysForBatchId(t: Any, e: Any, n: Any): vt
  
  def saveOverlays(t: Any, e: Any, n: Any): vt
  
  var serializer: Any
  
  var userId: Any
}
object vr {
  
  inline def apply(
    de: (Any, Any) => Any,
    getOverlay: (Any, Any) => Any,
    getOverlays: (Any, Any) => vt,
    getOverlaysForCollection: (Any, Any, Any) => Any,
    getOverlaysForCollectionGroup: (Any, Any, Any, Any) => Any,
    removeOverlaysForBatchId: (Any, Any, Any) => vt,
    saveOverlays: (Any, Any, Any) => vt,
    serializer: Any,
    userId: Any
  ): vr = {
    val __obj = js.Dynamic.literal(de = js.Any.fromFunction2(de), getOverlay = js.Any.fromFunction2(getOverlay), getOverlays = js.Any.fromFunction2(getOverlays), getOverlaysForCollection = js.Any.fromFunction3(getOverlaysForCollection), getOverlaysForCollectionGroup = js.Any.fromFunction4(getOverlaysForCollectionGroup), removeOverlaysForBatchId = js.Any.fromFunction3(removeOverlaysForBatchId), saveOverlays = js.Any.fromFunction3(saveOverlays), serializer = serializer.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[vr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vr] (val x: Self) extends AnyVal {
    
    inline def setDe(value: (Any, Any) => Any): Self = StObject.set(x, "de", js.Any.fromFunction2(value))
    
    inline def setGetOverlay(value: (Any, Any) => Any): Self = StObject.set(x, "getOverlay", js.Any.fromFunction2(value))
    
    inline def setGetOverlays(value: (Any, Any) => vt): Self = StObject.set(x, "getOverlays", js.Any.fromFunction2(value))
    
    inline def setGetOverlaysForCollection(value: (Any, Any, Any) => Any): Self = StObject.set(x, "getOverlaysForCollection", js.Any.fromFunction3(value))
    
    inline def setGetOverlaysForCollectionGroup(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "getOverlaysForCollectionGroup", js.Any.fromFunction4(value))
    
    inline def setRemoveOverlaysForBatchId(value: (Any, Any, Any) => vt): Self = StObject.set(x, "removeOverlaysForBatchId", js.Any.fromFunction3(value))
    
    inline def setSaveOverlays(value: (Any, Any, Any) => vt): Self = StObject.set(x, "saveOverlays", js.Any.fromFunction3(value))
    
    inline def setSerializer(value: Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: Any): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
