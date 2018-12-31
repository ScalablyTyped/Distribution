package typings
package gapiLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestFulfilled[T] extends js.Object {
  var body: java.lang.String
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  var result: T
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

