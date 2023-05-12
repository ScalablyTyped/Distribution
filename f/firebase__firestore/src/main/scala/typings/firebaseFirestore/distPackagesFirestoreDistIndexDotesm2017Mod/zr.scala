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
  
  def addFieldIndex(t: Any, e: Any): vt
  
  def addToCollectionParentIndex(t: Any, e: Any): vt
  
  def deleteFieldIndex(t: Any, e: Any): vt
  
  def getCollectionParents(t: Any, e: Any): vt
  
  def getDocumentsMatchingTarget(t: Any, e: Any): vt
  
  def getFieldIndexes(t: Any, e: Any): vt
  
  def getIndexType(t: Any, e: Any): vt
  
  def getMinOffset(t: Any, e: Any): vt
  
  def getMinOffsetFromCollectionGroup(t: Any, e: Any): vt
  
  def getNextCollectionGroupToUpdate(t: Any): vt
  
  var sn: Wr
  
  def updateCollectionGroup(t: Any, e: Any, n: Any): vt
  
  def updateIndexEntries(t: Any, e: Any): vt
}
object zr {
  
  inline def apply(
    addFieldIndex: (Any, Any) => vt,
    addToCollectionParentIndex: (Any, Any) => vt,
    deleteFieldIndex: (Any, Any) => vt,
    getCollectionParents: (Any, Any) => vt,
    getDocumentsMatchingTarget: (Any, Any) => vt,
    getFieldIndexes: (Any, Any) => vt,
    getIndexType: (Any, Any) => vt,
    getMinOffset: (Any, Any) => vt,
    getMinOffsetFromCollectionGroup: (Any, Any) => vt,
    getNextCollectionGroupToUpdate: Any => vt,
    sn: Wr,
    updateCollectionGroup: (Any, Any, Any) => vt,
    updateIndexEntries: (Any, Any) => vt
  ): zr = {
    val __obj = js.Dynamic.literal(addFieldIndex = js.Any.fromFunction2(addFieldIndex), addToCollectionParentIndex = js.Any.fromFunction2(addToCollectionParentIndex), deleteFieldIndex = js.Any.fromFunction2(deleteFieldIndex), getCollectionParents = js.Any.fromFunction2(getCollectionParents), getDocumentsMatchingTarget = js.Any.fromFunction2(getDocumentsMatchingTarget), getFieldIndexes = js.Any.fromFunction2(getFieldIndexes), getIndexType = js.Any.fromFunction2(getIndexType), getMinOffset = js.Any.fromFunction2(getMinOffset), getMinOffsetFromCollectionGroup = js.Any.fromFunction2(getMinOffsetFromCollectionGroup), getNextCollectionGroupToUpdate = js.Any.fromFunction1(getNextCollectionGroupToUpdate), sn = sn.asInstanceOf[js.Any], updateCollectionGroup = js.Any.fromFunction3(updateCollectionGroup), updateIndexEntries = js.Any.fromFunction2(updateIndexEntries))
    __obj.asInstanceOf[zr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: zr] (val x: Self) extends AnyVal {
    
    inline def setAddFieldIndex(value: (Any, Any) => vt): Self = StObject.set(x, "addFieldIndex", js.Any.fromFunction2(value))
    
    inline def setAddToCollectionParentIndex(value: (Any, Any) => vt): Self = StObject.set(x, "addToCollectionParentIndex", js.Any.fromFunction2(value))
    
    inline def setDeleteFieldIndex(value: (Any, Any) => vt): Self = StObject.set(x, "deleteFieldIndex", js.Any.fromFunction2(value))
    
    inline def setGetCollectionParents(value: (Any, Any) => vt): Self = StObject.set(x, "getCollectionParents", js.Any.fromFunction2(value))
    
    inline def setGetDocumentsMatchingTarget(value: (Any, Any) => vt): Self = StObject.set(x, "getDocumentsMatchingTarget", js.Any.fromFunction2(value))
    
    inline def setGetFieldIndexes(value: (Any, Any) => vt): Self = StObject.set(x, "getFieldIndexes", js.Any.fromFunction2(value))
    
    inline def setGetIndexType(value: (Any, Any) => vt): Self = StObject.set(x, "getIndexType", js.Any.fromFunction2(value))
    
    inline def setGetMinOffset(value: (Any, Any) => vt): Self = StObject.set(x, "getMinOffset", js.Any.fromFunction2(value))
    
    inline def setGetMinOffsetFromCollectionGroup(value: (Any, Any) => vt): Self = StObject.set(x, "getMinOffsetFromCollectionGroup", js.Any.fromFunction2(value))
    
    inline def setGetNextCollectionGroupToUpdate(value: Any => vt): Self = StObject.set(x, "getNextCollectionGroupToUpdate", js.Any.fromFunction1(value))
    
    inline def setSn(value: Wr): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
    
    inline def setUpdateCollectionGroup(value: (Any, Any, Any) => vt): Self = StObject.set(x, "updateCollectionGroup", js.Any.fromFunction3(value))
    
    inline def setUpdateIndexEntries(value: (Any, Any) => vt): Self = StObject.set(x, "updateIndexEntries", js.Any.fromFunction2(value))
  }
}
