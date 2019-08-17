package typings.endDashOfDashStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object endDashOfDashStreamMod {
  import typings.node.NodeJSNs.ReadableStream
  import typings.node.NodeJSNs.WritableStream
  import typings.std.Error

  type Callback = js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  type Stream = ReadableStream | WritableStream
}
