package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import typings.firebaseFirestore.anon.Longitude
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
  * An immutable object representing a geographic location in Firestore. The
  * location is represented as latitude/longitude pair.
  *
  * Latitude values are in the range of [-90, 90].
  * Longitude values are in the range of [-180, 180].
  */ @js.native
trait Bn extends StObject {
  
  /**
    * Actually private to JS consumers of our API, so this function is prefixed
    * with an underscore.
    */ def _compareTo(t: Any): `0` | `1` | `-1` = js.native
  
  var _lat: Any = js.native
  
  var _long: Any = js.native
  
  /**
    * Returns true if this `GeoPoint` is equal to the provided one.
    *
    * @param other - The `GeoPoint` to compare against.
    * @returns true if this `GeoPoint` is equal to the provided one.
    */ def isEqual(t: Any): Boolean = js.native
  
  /**
    * The latitude of this `GeoPoint` instance.
    */ def latitude: Any = js.native
  
  /**
    * The longitude of this `GeoPoint` instance.
    */ def longitude: Any = js.native
  
  /** Returns a JSON-serializable representation of this GeoPoint. */ def toJSON(): Longitude = js.native
}
