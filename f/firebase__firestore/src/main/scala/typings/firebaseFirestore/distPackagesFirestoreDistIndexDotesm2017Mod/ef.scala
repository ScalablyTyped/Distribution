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
  */
/**
  * Metadata about a snapshot, describing the state of the snapshot.
  */ trait ef extends StObject {
  
  var fromCache: Any
  
  var hasPendingWrites: Any
  
  /**
    * Returns true if this `SnapshotMetadata` is equal to the provided one.
    *
    * @param other - The `SnapshotMetadata` to compare against.
    * @returns true if this `SnapshotMetadata` is equal to the provided one.
    */ def isEqual(t: Any): Boolean
}
object ef {
  
  inline def apply(fromCache: Any, hasPendingWrites: Any, isEqual: Any => Boolean): ef = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[ef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ef] (val x: Self) extends AnyVal {
    
    inline def setFromCache(value: Any): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    inline def setHasPendingWrites(value: Any): Self = StObject.set(x, "hasPendingWrites", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
  }
}
