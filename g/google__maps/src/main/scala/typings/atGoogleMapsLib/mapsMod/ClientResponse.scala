package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientResponse[T] extends js.Object {
  /** The HTTP headers. */
  var headers: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /** Deserialized JSON object for the API response. */
  var json: T
  /** The HTTP status. */
  var status: scala.Double
}

