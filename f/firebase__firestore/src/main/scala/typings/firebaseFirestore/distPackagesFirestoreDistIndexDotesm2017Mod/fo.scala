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
  */ trait fo extends StObject {
  
  @JSName("$n")
  def $n(t: Any, e: Any): Any
  
  /**
    * In-place updates the provided metadata to account for values in the given
    * TargetData. Saving is done separately. Returns true if there were any
    * changes to the metadata.
    */ def Fn(t: Any, e: Any): Boolean
  
  def Mn(t: Any): Any
  
  def On(t: Any, e: Any): Any
  
  def addMatchingKeys(t: Any, e: Any, n: Any): vt
  
  def addTargetData(t: Any, e: Any): Any
  
  def allocateTargetId(t: Any): Any
  
  def containsKey(t: Any, e: Any): Any
  
  /**
    * Call provided function with each `TargetData` that we have cached.
    */ def forEachTarget(t: Any, e: Any): Any
  
  def getHighestSequenceNumber(t: Any): Any
  
  def getLastRemoteSnapshotVersion(t: Any): Any
  
  def getMatchingKeysForTargetId(t: Any, e: Any): Any
  
  def getTargetCount(t: Any): Any
  
  def getTargetData(t: Any, e: Any): Any
  
  /**
    * Looks up a TargetData entry by target ID.
    *
    * @param targetId - The target ID of the TargetData entry to look up.
    * @returns The cached TargetData entry, or null if the cache has no entry for
    * the target.
    */
  def he(t: Any, e: Any): Any
  
  var referenceDelegate: Any
  
  def removeMatchingKeys(t: Any, e: Any, n: Any): vt
  
  def removeMatchingKeysForTargetId(t: Any, e: Any): Any
  
  def removeTargetData(t: Any, e: Any): Any
  
  /**
    * Drops any targets with sequence number less than or equal to the upper bound, excepting those
    * present in `activeTargetIds`. Document associations for the removed targets are also removed.
    * Returns the number of targets removed.
    */ def removeTargets(t: Any, e: Any, n: Any): Any
  
  var serializer: Any
  
  def setTargetsMetadata(t: Any, e: Any, n: Any): Any
  
  def updateTargetData(t: Any, e: Any): Any
}
object fo {
  
  inline def apply(
    $n: (Any, Any) => Any,
    Fn: (Any, Any) => Boolean,
    Mn: Any => Any,
    On: (Any, Any) => Any,
    addMatchingKeys: (Any, Any, Any) => vt,
    addTargetData: (Any, Any) => Any,
    allocateTargetId: Any => Any,
    containsKey: (Any, Any) => Any,
    forEachTarget: (Any, Any) => Any,
    getHighestSequenceNumber: Any => Any,
    getLastRemoteSnapshotVersion: Any => Any,
    getMatchingKeysForTargetId: (Any, Any) => Any,
    getTargetCount: Any => Any,
    getTargetData: (Any, Any) => Any,
    he: (Any, Any) => Any,
    referenceDelegate: Any,
    removeMatchingKeys: (Any, Any, Any) => vt,
    removeMatchingKeysForTargetId: (Any, Any) => Any,
    removeTargetData: (Any, Any) => Any,
    removeTargets: (Any, Any, Any) => Any,
    serializer: Any,
    setTargetsMetadata: (Any, Any, Any) => Any,
    updateTargetData: (Any, Any) => Any
  ): fo = {
    val __obj = js.Dynamic.literal($n = js.Any.fromFunction2($n), Fn = js.Any.fromFunction2(Fn), Mn = js.Any.fromFunction1(Mn), On = js.Any.fromFunction2(On), addMatchingKeys = js.Any.fromFunction3(addMatchingKeys), addTargetData = js.Any.fromFunction2(addTargetData), allocateTargetId = js.Any.fromFunction1(allocateTargetId), containsKey = js.Any.fromFunction2(containsKey), forEachTarget = js.Any.fromFunction2(forEachTarget), getHighestSequenceNumber = js.Any.fromFunction1(getHighestSequenceNumber), getLastRemoteSnapshotVersion = js.Any.fromFunction1(getLastRemoteSnapshotVersion), getMatchingKeysForTargetId = js.Any.fromFunction2(getMatchingKeysForTargetId), getTargetCount = js.Any.fromFunction1(getTargetCount), getTargetData = js.Any.fromFunction2(getTargetData), he = js.Any.fromFunction2(he), referenceDelegate = referenceDelegate.asInstanceOf[js.Any], removeMatchingKeys = js.Any.fromFunction3(removeMatchingKeys), removeMatchingKeysForTargetId = js.Any.fromFunction2(removeMatchingKeysForTargetId), removeTargetData = js.Any.fromFunction2(removeTargetData), removeTargets = js.Any.fromFunction3(removeTargets), serializer = serializer.asInstanceOf[js.Any], setTargetsMetadata = js.Any.fromFunction3(setTargetsMetadata), updateTargetData = js.Any.fromFunction2(updateTargetData))
    __obj.asInstanceOf[fo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: fo] (val x: Self) extends AnyVal {
    
    inline def set$n(value: (Any, Any) => Any): Self = StObject.set(x, "$n", js.Any.fromFunction2(value))
    
    inline def setAddMatchingKeys(value: (Any, Any, Any) => vt): Self = StObject.set(x, "addMatchingKeys", js.Any.fromFunction3(value))
    
    inline def setAddTargetData(value: (Any, Any) => Any): Self = StObject.set(x, "addTargetData", js.Any.fromFunction2(value))
    
    inline def setAllocateTargetId(value: Any => Any): Self = StObject.set(x, "allocateTargetId", js.Any.fromFunction1(value))
    
    inline def setContainsKey(value: (Any, Any) => Any): Self = StObject.set(x, "containsKey", js.Any.fromFunction2(value))
    
    inline def setFn(value: (Any, Any) => Boolean): Self = StObject.set(x, "Fn", js.Any.fromFunction2(value))
    
    inline def setForEachTarget(value: (Any, Any) => Any): Self = StObject.set(x, "forEachTarget", js.Any.fromFunction2(value))
    
    inline def setGetHighestSequenceNumber(value: Any => Any): Self = StObject.set(x, "getHighestSequenceNumber", js.Any.fromFunction1(value))
    
    inline def setGetLastRemoteSnapshotVersion(value: Any => Any): Self = StObject.set(x, "getLastRemoteSnapshotVersion", js.Any.fromFunction1(value))
    
    inline def setGetMatchingKeysForTargetId(value: (Any, Any) => Any): Self = StObject.set(x, "getMatchingKeysForTargetId", js.Any.fromFunction2(value))
    
    inline def setGetTargetCount(value: Any => Any): Self = StObject.set(x, "getTargetCount", js.Any.fromFunction1(value))
    
    inline def setGetTargetData(value: (Any, Any) => Any): Self = StObject.set(x, "getTargetData", js.Any.fromFunction2(value))
    
    inline def setHe(value: (Any, Any) => Any): Self = StObject.set(x, "he", js.Any.fromFunction2(value))
    
    inline def setMn(value: Any => Any): Self = StObject.set(x, "Mn", js.Any.fromFunction1(value))
    
    inline def setOn(value: (Any, Any) => Any): Self = StObject.set(x, "On", js.Any.fromFunction2(value))
    
    inline def setReferenceDelegate(value: Any): Self = StObject.set(x, "referenceDelegate", value.asInstanceOf[js.Any])
    
    inline def setRemoveMatchingKeys(value: (Any, Any, Any) => vt): Self = StObject.set(x, "removeMatchingKeys", js.Any.fromFunction3(value))
    
    inline def setRemoveMatchingKeysForTargetId(value: (Any, Any) => Any): Self = StObject.set(x, "removeMatchingKeysForTargetId", js.Any.fromFunction2(value))
    
    inline def setRemoveTargetData(value: (Any, Any) => Any): Self = StObject.set(x, "removeTargetData", js.Any.fromFunction2(value))
    
    inline def setRemoveTargets(value: (Any, Any, Any) => Any): Self = StObject.set(x, "removeTargets", js.Any.fromFunction3(value))
    
    inline def setSerializer(value: Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setSetTargetsMetadata(value: (Any, Any, Any) => Any): Self = StObject.set(x, "setTargetsMetadata", js.Any.fromFunction3(value))
    
    inline def setUpdateTargetData(value: (Any, Any) => Any): Self = StObject.set(x, "updateTargetData", js.Any.fromFunction2(value))
  }
}
