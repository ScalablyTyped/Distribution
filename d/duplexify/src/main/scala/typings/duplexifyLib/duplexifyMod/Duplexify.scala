package typings
package duplexifyLib.duplexifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duplexify
  extends nodeLib.streamMod.Duplex {
  def setReadable(readable: nodeLib.streamMod.Readable): scala.Unit = js.native
  def setWritable(writable: nodeLib.streamMod.Writable): scala.Unit = js.native
}

