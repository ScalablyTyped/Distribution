package typings.flushDashWriteDashStream.flushDashWriteDashStreamMod

import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flush-write-stream", JSImport.Namespace)
@js.native
class ^ protected () extends Writable {
  def this(write: Write) = this()
  def this(opts: WritableOptions, write: Write) = this()
  def this(write: Write, flush: Flush) = this()
  def this(opts: WritableOptions, write: Write, flush: Flush) = this()
}

@JSImport("flush-write-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(opts: WritableOptions, write: Write): Writable = js.native
  def apply(opts: WritableOptions, write: Write, flush: Flush): Writable = js.native
  def apply(write: Write): Writable = js.native
  def apply(write: Write, flush: Flush): Writable = js.native
  def obj(opts: WritableOptions, write: Write): Writable = js.native
  def obj(opts: WritableOptions, write: Write, flush: Flush): Writable = js.native
  def obj(write: Write): Writable = js.native
  def obj(write: Write, flush: Flush): Writable = js.native
}

