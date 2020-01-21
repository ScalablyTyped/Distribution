package typings.duplexify.mod

import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duplexify extends Duplex {
  def setReadable(readable: Readable): Unit = js.native
  def setWritable(writable: Writable): Unit = js.native
}

