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
@JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "Timestamp")
@js.native
open class Timestamp protected ()
  extends StObject
     with bt {
  /**
    * Creates a new timestamp.
    *
    * @param seconds - The number of seconds of UTC time since Unix epoch
    *     1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
    *     9999-12-31T23:59:59Z inclusive.
    * @param nanoseconds - The non-negative fractions of a second at nanosecond
    *     resolution. Negative second values with fractions must still have
    *     non-negative nanoseconds values that count forward in time. Must be
    *     from 0 to 999,999,999 inclusive.
    */
  def this(t: Any, e: Any) = this()
  
  /* CompleteClass */
  override def _compareTo(t: Any): `0` | `1` | `-1` = js.native
  
  /**
    * Returns true if this `Timestamp` is equal to the provided one.
    *
    * @param other - The `Timestamp` to compare against.
    * @returns true if this `Timestamp` is equal to the provided one.
    */ /* CompleteClass */
  override def isEqual(t: Any): Boolean = js.native
  
  /* CompleteClass */
  var nanoseconds: Any = js.native
  
  /* CompleteClass */
  var seconds: Any = js.native
  
  /**
    * Converts a `Timestamp` to a JavaScript `Date` object. This conversion
    * causes a loss of precision since `Date` objects only support millisecond
    * precision.
    *
    * @returns JavaScript `Date` object representing the same point in time as
    *     this `Timestamp`, with millisecond precision.
    */ /* CompleteClass */
  override def toDate(): js.Date = js.native
  
  /** Returns a JSON-serializable representation of this `Timestamp`. */ /* CompleteClass */
  override def toJSON(): NanosecondsSeconds = js.native
  
  /**
    * Converts a `Timestamp` to a numeric timestamp (in milliseconds since
    * epoch). This operation causes a loss of precision.
    *
    * @returns The point in time corresponding to this timestamp, represented as
    *     the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    */ /* CompleteClass */
  override def toMillis(): Double = js.native
}
object Timestamp {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new timestamp from the given date.
    *
    * @param date - The date to initialize the `Timestamp` from.
    * @returns A new `Timestamp` representing the same point in time as the given
    *     date.
    */ /* static member */
  inline def fromDate(t: Any): bt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(t.asInstanceOf[js.Any]).asInstanceOf[bt]
  
  /**
    * Creates a new timestamp from the given number of milliseconds.
    *
    * @param milliseconds - Number of milliseconds since Unix epoch
    *     1970-01-01T00:00:00Z.
    * @returns A new `Timestamp` representing the same point in time as the given
    *     number of milliseconds.
    */ /* static member */
  inline def fromMillis(t: Any): bt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(t.asInstanceOf[js.Any]).asInstanceOf[bt]
  
  /**
    * Creates a new timestamp with the current date, with millisecond precision.
    *
    * @returns a new timestamp representing the current date.
    */ /* static member */
  inline def now(): bt = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[bt]
}
