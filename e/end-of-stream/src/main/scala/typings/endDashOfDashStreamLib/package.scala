package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object endDashOfDashStreamLib {
  type Callback = js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  type Stream = nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.WritableStream
}
