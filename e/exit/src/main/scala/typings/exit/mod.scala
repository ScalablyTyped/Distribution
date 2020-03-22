package typings.exit

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exit", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * A replacement for process.exit that ensures stdio are fully drained before exiting.
    */
  def apply(code: Double): Unit = js.native
  def apply(code: Double, streams: js.Tuple2[WritableStream, WritableStream]): Unit = js.native
}

