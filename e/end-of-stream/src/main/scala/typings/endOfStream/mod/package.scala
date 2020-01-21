package typings.endOfStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* error */ js.UndefOr[typings.std.Error | scala.Null], scala.Unit]
  type Stream = typings.node.NodeJS.ReadableStream | typings.node.NodeJS.WritableStream
}
