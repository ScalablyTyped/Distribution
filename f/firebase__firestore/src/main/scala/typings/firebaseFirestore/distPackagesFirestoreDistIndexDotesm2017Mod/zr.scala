package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2019 Google LLC
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
  * An in-memory implementation of IndexManager.
  */ trait zr extends StObject {
  
  def addFieldIndex(t: Any, e: Any): Rt_
  
  def addToCollectionParentIndex(t: Any, e: Any): Rt_
  
  def deleteFieldIndex(t: Any, e: Any): Rt_
  
  def getCollectionParents(t: Any, e: Any): Rt_
  
  def getDocumentsMatchingTarget(t: Any, e: Any): Rt_
  
  def getFieldIndexes(t: Any, e: Any): Rt_
  
  def getIndexType(t: Any, e: Any): Rt_
  
  def getMinOffset(t: Any, e: Any): Rt_
  
  def getMinOffsetFromCollectionGroup(t: Any, e: Any): Rt_
  
  def getNextCollectionGroupToUpdate(t: Any): Rt_
  
  var rn: Wr
  
  def updateCollectionGroup(t: Any, e: Any, n: Any): Rt_
  
  def updateIndexEntries(t: Any, e: Any): Rt_
}
object zr {
  
  inline def apply(
    addFieldIndex: (Any, Any) => Rt_,
    addToCollectionParentIndex: (Any, Any) => Rt_,
    deleteFieldIndex: (Any, Any) => Rt_,
    getCollectionParents: (Any, Any) => Rt_,
    getDocumentsMatchingTarget: (Any, Any) => Rt_,
    getFieldIndexes: (Any, Any) => Rt_,
    getIndexType: (Any, Any) => Rt_,
    getMinOffset: (Any, Any) => Rt_,
    getMinOffsetFromCollectionGroup: (Any, Any) => Rt_,
    getNextCollectionGroupToUpdate: Any => Rt_,
    rn: Wr,
    updateCollectionGroup: (Any, Any, Any) => Rt_,
    updateIndexEntries: (Any, Any) => Rt_
  ): zr = {
    val __obj = js.Dynamic.literal(addFieldIndex = js.Any.fromFunction2(addFieldIndex), addToCollectionParentIndex = js.Any.fromFunction2(addToCollectionParentIndex), deleteFieldIndex = js.Any.fromFunction2(deleteFieldIndex), getCollectionParents = js.Any.fromFunction2(getCollectionParents), getDocumentsMatchingTarget = js.Any.fromFunction2(getDocumentsMatchingTarget), getFieldIndexes = js.Any.fromFunction2(getFieldIndexes), getIndexType = js.Any.fromFunction2(getIndexType), getMinOffset = js.Any.fromFunction2(getMinOffset), getMinOffsetFromCollectionGroup = js.Any.fromFunction2(getMinOffsetFromCollectionGroup), getNextCollectionGroupToUpdate = js.Any.fromFunction1(getNextCollectionGroupToUpdate), rn = rn.asInstanceOf[js.Any], updateCollectionGroup = js.Any.fromFunction3(updateCollectionGroup), updateIndexEntries = js.Any.fromFunction2(updateIndexEntries))
    __obj.asInstanceOf[zr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: zr] (val x: Self) extends AnyVal {
    
    inline def setAddFieldIndex(value: (Any, Any) => Rt_): Self = StObject.set(x, "addFieldIndex", js.Any.fromFunction2(value))
    
    inline def setAddToCollectionParentIndex(value: (Any, Any) => Rt_): Self = StObject.set(x, "addToCollectionParentIndex", js.Any.fromFunction2(value))
    
    inline def setDeleteFieldIndex(value: (Any, Any) => Rt_): Self = StObject.set(x, "deleteFieldIndex", js.Any.fromFunction2(value))
    
    inline def setGetCollectionParents(value: (Any, Any) => Rt_): Self = StObject.set(x, "getCollectionParents", js.Any.fromFunction2(value))
    
    inline def setGetDocumentsMatchingTarget(value: (Any, Any) => Rt_): Self = StObject.set(x, "getDocumentsMatchingTarget", js.Any.fromFunction2(value))
    
    inline def setGetFieldIndexes(value: (Any, Any) => Rt_): Self = StObject.set(x, "getFieldIndexes", js.Any.fromFunction2(value))
    
    inline def setGetIndexType(value: (Any, Any) => Rt_): Self = StObject.set(x, "getIndexType", js.Any.fromFunction2(value))
    
    inline def setGetMinOffset(value: (Any, Any) => Rt_): Self = StObject.set(x, "getMinOffset", js.Any.fromFunction2(value))
    
    inline def setGetMinOffsetFromCollectionGroup(value: (Any, Any) => Rt_): Self = StObject.set(x, "getMinOffsetFromCollectionGroup", js.Any.fromFunction2(value))
    
    inline def setGetNextCollectionGroupToUpdate(value: Any => Rt_): Self = StObject.set(x, "getNextCollectionGroupToUpdate", js.Any.fromFunction1(value))
    
    inline def setRn(value: Wr): Self = StObject.set(x, "rn", value.asInstanceOf[js.Any])
    
    inline def setUpdateCollectionGroup(value: (Any, Any, Any) => Rt_): Self = StObject.set(x, "updateCollectionGroup", js.Any.fromFunction3(value))
    
    inline def setUpdateIndexEntries(value: (Any, Any) => Rt_): Self = StObject.set(x, "updateIndexEntries", js.Any.fromFunction2(value))
  }
}
