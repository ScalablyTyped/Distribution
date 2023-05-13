package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import typings.firebaseFirestore.anon.NanosecondsSeconds
import typings.firebaseFirestore.firebaseFirestoreInts.`-1`
import typings.firebaseFirestore.firebaseFirestoreInts.`0`
import typings.firebaseFirestore.firebaseFirestoreInts.`1`
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
  * A `Timestamp` represents a point in time independent of any time zone or
  * calendar, represented as seconds and fractions of seconds at nanosecond
  * resolution in UTC Epoch time.
  *
  * It is encoded using the Proleptic Gregorian Calendar which extends the
  * Gregorian calendar backwards to year one. It is encoded assuming all minutes
  * are 60 seconds long, i.e. leap seconds are "smeared" so that no leap second
  * table is needed for interpretation. Range is from 0001-01-01T00:00:00Z to
  * 9999-12-31T23:59:59.999999999Z.
  *
  * For examples and further specifications, refer to the
  * {@link https://github.com/google/protobuf/blob/master/src/google/protobuf/timestamp.proto | Timestamp definition}.
  */
trait xt extends StObject {
  
  def _compareTo(t: Any): `0` | `1` | `-1`
  
  /**
    * Returns true if this `Timestamp` is equal to the provided one.
    *
    * @param other - The `Timestamp` to compare against.
    * @returns true if this `Timestamp` is equal to the provided one.
    */ def isEqual(t: Any): Boolean
  
  var nanoseconds: Any
  
  var seconds: Any
  
  /**
    * Converts a `Timestamp` to a JavaScript `Date` object. This conversion
    * causes a loss of precision since `Date` objects only support millisecond
    * precision.
    *
    * @returns JavaScript `Date` object representing the same point in time as
    *     this `Timestamp`, with millisecond precision.
    */ def toDate(): js.Date
  
  /** Returns a JSON-serializable representation of this `Timestamp`. */ def toJSON(): NanosecondsSeconds
  
  /**
    * Converts a `Timestamp` to a numeric timestamp (in milliseconds since
    * epoch). This operation causes a loss of precision.
    *
    * @returns The point in time corresponding to this timestamp, represented as
    *     the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    */ def toMillis(): Double
}
object xt {
  
  inline def apply(
    _compareTo: Any => `0` | `1` | `-1`,
    isEqual: Any => Boolean,
    nanoseconds: Any,
    seconds: Any,
    toDate: () => js.Date,
    toJSON: () => NanosecondsSeconds,
    toMillis: () => Double
  ): xt = {
    val __obj = js.Dynamic.literal(_compareTo = js.Any.fromFunction1(_compareTo), isEqual = js.Any.fromFunction1(isEqual), nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], toDate = js.Any.fromFunction0(toDate), toJSON = js.Any.fromFunction0(toJSON), toMillis = js.Any.fromFunction0(toMillis))
    __obj.asInstanceOf[xt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: xt] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setNanoseconds(value: Any): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Any): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setToDate(value: () => js.Date): Self = StObject.set(x, "toDate", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: () => NanosecondsSeconds): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToMillis(value: () => Double): Self = StObject.set(x, "toMillis", js.Any.fromFunction0(value))
    
    inline def set_compareTo(value: Any => `0` | `1` | `-1`): Self = StObject.set(x, "_compareTo", js.Any.fromFunction1(value))
  }
}
