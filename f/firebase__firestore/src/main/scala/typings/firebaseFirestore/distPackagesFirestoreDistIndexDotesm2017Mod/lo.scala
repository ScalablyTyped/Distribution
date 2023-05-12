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
/** Offset to ensure non-overlapping target ids. */
/**
  * Generates monotonically increasing target IDs for sending targets to the
  * watch stream.
  *
  * The client constructs two generators, one for the target cache, and one for
  * for the sync engine (to generate limbo documents targets). These
  * generators produce non-overlapping IDs (by using even and odd IDs
  * respectively).
  *
  * By separating the target ID space, the query cache can generate target IDs
  * that persist across client restarts, while sync engine can independently
  * generate in-memory target IDs that are transient and can be reused after a
  * restart.
  */
trait lo extends StObject {
  
  def next(): Any
  
  var xn: Any
}
object lo {
  
  inline def apply(next: () => Any, xn: Any): lo = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), xn = xn.asInstanceOf[js.Any])
    __obj.asInstanceOf[lo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: lo] (val x: Self) extends AnyVal {
    
    inline def setNext(value: () => Any): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setXn(value: Any): Self = StObject.set(x, "xn", value.asInstanceOf[js.Any])
  }
}
