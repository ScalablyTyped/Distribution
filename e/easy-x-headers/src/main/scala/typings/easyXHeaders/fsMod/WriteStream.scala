package typings.easyXHeaders.fsMod

import typings.easyXHeaders.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteStream extends Writable {
  var bytesWritten: Double = js.native
  def close(): Unit = js.native
}

