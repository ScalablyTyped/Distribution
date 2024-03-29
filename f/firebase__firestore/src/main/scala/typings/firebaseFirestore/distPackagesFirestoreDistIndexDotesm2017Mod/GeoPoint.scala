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
  * An immutable object representing a geographic location in Firestore. The
  * location is represented as latitude/longitude pair.
  *
  * Latitude values are in the range of [-90, 90].
  * Longitude values are in the range of [-180, 180].
  */ @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "GeoPoint")
@js.native
open class GeoPoint protected ()
  extends StObject
     with jh {
  /**
    * Creates a new immutable `GeoPoint` object with the provided latitude and
    * longitude values.
    * @param latitude - The latitude as number between -90 and 90.
    * @param longitude - The longitude as number between -180 and 180.
    */
  def this(t: Any, e: Any) = this()
}
