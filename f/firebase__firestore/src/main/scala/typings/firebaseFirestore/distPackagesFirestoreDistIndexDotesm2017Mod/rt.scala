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
/**
  * A version of a document in Firestore. This corresponds to the version
  * timestamp, such as update_time or read_time.
  */ trait rt extends StObject {
  
  def compareTo(t: Any): Any
  
  def isEqual(t: Any): Any
  
  var timestamp: Any
  
  /** Returns a number representation of the version for use in spec tests. */ def toMicroseconds(): Double
  
  def toTimestamp(): Any
}
object rt {
  
  inline def apply(
    compareTo: Any => Any,
    isEqual: Any => Any,
    timestamp: Any,
    toMicroseconds: () => Double,
    toTimestamp: () => Any
  ): rt = {
    val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo), isEqual = js.Any.fromFunction1(isEqual), timestamp = timestamp.asInstanceOf[js.Any], toMicroseconds = js.Any.fromFunction0(toMicroseconds), toTimestamp = js.Any.fromFunction0(toTimestamp))
    __obj.asInstanceOf[rt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rt] (val x: Self) extends AnyVal {
    
    inline def setCompareTo(value: Any => Any): Self = StObject.set(x, "compareTo", js.Any.fromFunction1(value))
    
    inline def setIsEqual(value: Any => Any): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setTimestamp(value: Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setToMicroseconds(value: () => Double): Self = StObject.set(x, "toMicroseconds", js.Any.fromFunction0(value))
    
    inline def setToTimestamp(value: () => Any): Self = StObject.set(x, "toTimestamp", js.Any.fromFunction0(value))
  }
}
