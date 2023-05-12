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
  */ trait Uo extends StObject {
  
  @JSName("$n")
  def $n(t: Any): Unit
  
  /**
    * Maps a target to the data about that target
    */
  var Cs: os
  
  /**
    * A ordered bidirectional mapping between documents and the remote target
    * IDs.
    */
  var Ns: o
  
  def addMatchingKeys(t: Any, e: Any, n: Any): vt
  
  def addTargetData(t: Any, e: Any): vt
  
  def allocateTargetId(t: Any): vt
  
  def containsKey(t: Any, e: Any): vt
  
  def forEachTarget(t: Any, e: Any): vt
  
  def getHighestSequenceNumber(t: Any): vt
  
  def getLastRemoteSnapshotVersion(t: Any): vt
  
  def getMatchingKeysForTargetId(t: Any, e: Any): vt
  
  def getTargetCount(t: Any): vt
  
  def getTargetData(t: Any, e: Any): vt
  
  /** The highest numbered target ID encountered. */
  var highestTargetId: Double
  
  var ks: lo
  
  /** The last received snapshot version. */
  var lastRemoteSnapshotVersion: rt
  
  var persistence: Any
  
  def removeMatchingKeys(t: Any, e: Any, n: Any): vt
  
  def removeMatchingKeysForTargetId(t: Any, e: Any): vt
  
  def removeTargetData(t: Any, e: Any): vt
  
  def removeTargets(t: Any, e: Any, n: Any): vt
  
  def setTargetsMetadata(t: Any, e: Any, n: Any): vt
  
  var targetCount: Double
  
  def updateTargetData(t: Any, e: Any): vt
  
  /** The highest sequence number encountered. */
  var xs: Double
}
object Uo {
  
  inline def apply(
    $n: Any => Unit,
    Cs: os,
    Ns: o,
    addMatchingKeys: (Any, Any, Any) => vt,
    addTargetData: (Any, Any) => vt,
    allocateTargetId: Any => vt,
    containsKey: (Any, Any) => vt,
    forEachTarget: (Any, Any) => vt,
    getHighestSequenceNumber: Any => vt,
    getLastRemoteSnapshotVersion: Any => vt,
    getMatchingKeysForTargetId: (Any, Any) => vt,
    getTargetCount: Any => vt,
    getTargetData: (Any, Any) => vt,
    highestTargetId: Double,
    ks: lo,
    lastRemoteSnapshotVersion: rt,
    persistence: Any,
    removeMatchingKeys: (Any, Any, Any) => vt,
    removeMatchingKeysForTargetId: (Any, Any) => vt,
    removeTargetData: (Any, Any) => vt,
    removeTargets: (Any, Any, Any) => vt,
    setTargetsMetadata: (Any, Any, Any) => vt,
    targetCount: Double,
    updateTargetData: (Any, Any) => vt,
    xs: Double
  ): Uo = {
    val __obj = js.Dynamic.literal($n = js.Any.fromFunction1($n), Cs = Cs.asInstanceOf[js.Any], Ns = Ns.asInstanceOf[js.Any], addMatchingKeys = js.Any.fromFunction3(addMatchingKeys), addTargetData = js.Any.fromFunction2(addTargetData), allocateTargetId = js.Any.fromFunction1(allocateTargetId), containsKey = js.Any.fromFunction2(containsKey), forEachTarget = js.Any.fromFunction2(forEachTarget), getHighestSequenceNumber = js.Any.fromFunction1(getHighestSequenceNumber), getLastRemoteSnapshotVersion = js.Any.fromFunction1(getLastRemoteSnapshotVersion), getMatchingKeysForTargetId = js.Any.fromFunction2(getMatchingKeysForTargetId), getTargetCount = js.Any.fromFunction1(getTargetCount), getTargetData = js.Any.fromFunction2(getTargetData), highestTargetId = highestTargetId.asInstanceOf[js.Any], ks = ks.asInstanceOf[js.Any], lastRemoteSnapshotVersion = lastRemoteSnapshotVersion.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], removeMatchingKeys = js.Any.fromFunction3(removeMatchingKeys), removeMatchingKeysForTargetId = js.Any.fromFunction2(removeMatchingKeysForTargetId), removeTargetData = js.Any.fromFunction2(removeTargetData), removeTargets = js.Any.fromFunction3(removeTargets), setTargetsMetadata = js.Any.fromFunction3(setTargetsMetadata), targetCount = targetCount.asInstanceOf[js.Any], updateTargetData = js.Any.fromFunction2(updateTargetData), xs = xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Uo] (val x: Self) extends AnyVal {
    
    inline def set$n(value: Any => Unit): Self = StObject.set(x, "$n", js.Any.fromFunction1(value))
    
    inline def setAddMatchingKeys(value: (Any, Any, Any) => vt): Self = StObject.set(x, "addMatchingKeys", js.Any.fromFunction3(value))
    
    inline def setAddTargetData(value: (Any, Any) => vt): Self = StObject.set(x, "addTargetData", js.Any.fromFunction2(value))
    
    inline def setAllocateTargetId(value: Any => vt): Self = StObject.set(x, "allocateTargetId", js.Any.fromFunction1(value))
    
    inline def setContainsKey(value: (Any, Any) => vt): Self = StObject.set(x, "containsKey", js.Any.fromFunction2(value))
    
    inline def setCs(value: os): Self = StObject.set(x, "Cs", value.asInstanceOf[js.Any])
    
    inline def setForEachTarget(value: (Any, Any) => vt): Self = StObject.set(x, "forEachTarget", js.Any.fromFunction2(value))
    
    inline def setGetHighestSequenceNumber(value: Any => vt): Self = StObject.set(x, "getHighestSequenceNumber", js.Any.fromFunction1(value))
    
    inline def setGetLastRemoteSnapshotVersion(value: Any => vt): Self = StObject.set(x, "getLastRemoteSnapshotVersion", js.Any.fromFunction1(value))
    
    inline def setGetMatchingKeysForTargetId(value: (Any, Any) => vt): Self = StObject.set(x, "getMatchingKeysForTargetId", js.Any.fromFunction2(value))
    
    inline def setGetTargetCount(value: Any => vt): Self = StObject.set(x, "getTargetCount", js.Any.fromFunction1(value))
    
    inline def setGetTargetData(value: (Any, Any) => vt): Self = StObject.set(x, "getTargetData", js.Any.fromFunction2(value))
    
    inline def setHighestTargetId(value: Double): Self = StObject.set(x, "highestTargetId", value.asInstanceOf[js.Any])
    
    inline def setKs(value: lo): Self = StObject.set(x, "ks", value.asInstanceOf[js.Any])
    
    inline def setLastRemoteSnapshotVersion(value: rt): Self = StObject.set(x, "lastRemoteSnapshotVersion", value.asInstanceOf[js.Any])
    
    inline def setNs(value: o): Self = StObject.set(x, "Ns", value.asInstanceOf[js.Any])
    
    inline def setPersistence(value: Any): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setRemoveMatchingKeys(value: (Any, Any, Any) => vt): Self = StObject.set(x, "removeMatchingKeys", js.Any.fromFunction3(value))
    
    inline def setRemoveMatchingKeysForTargetId(value: (Any, Any) => vt): Self = StObject.set(x, "removeMatchingKeysForTargetId", js.Any.fromFunction2(value))
    
    inline def setRemoveTargetData(value: (Any, Any) => vt): Self = StObject.set(x, "removeTargetData", js.Any.fromFunction2(value))
    
    inline def setRemoveTargets(value: (Any, Any, Any) => vt): Self = StObject.set(x, "removeTargets", js.Any.fromFunction3(value))
    
    inline def setSetTargetsMetadata(value: (Any, Any, Any) => vt): Self = StObject.set(x, "setTargetsMetadata", js.Any.fromFunction3(value))
    
    inline def setTargetCount(value: Double): Self = StObject.set(x, "targetCount", value.asInstanceOf[js.Any])
    
    inline def setUpdateTargetData(value: (Any, Any) => vt): Self = StObject.set(x, "updateTargetData", js.Any.fromFunction2(value))
    
    inline def setXs(value: Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
  }
}
