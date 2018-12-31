package typings
package gapiDotClientLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing information about the HTTP response
  */
trait Response[T] extends js.Object {
  // The raw response string.
  var body: java.lang.String
  // The map of HTTP response headers.
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  // The JSON-parsed result.
  var result: T
  // HTTP status
  var status: js.UndefOr[scala.Double] = js.undefined
  // HTTP status text
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

