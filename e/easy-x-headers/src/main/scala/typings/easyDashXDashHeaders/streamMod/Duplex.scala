package typings.easyDashXDashHeaders.streamMod

import typings.easyDashXDashHeaders.Buffer
import typings.easyDashXDashHeaders.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.easyDashXDashHeaders.NodeJS.EventEmitter because Already inherited
- typings.easyDashXDashHeaders.NodeJS.ReadableStream because Already inherited
- typings.easyDashXDashHeaders.NodeJS.ReadWriteStream because var conflicts: readable. Inlined  */ @JSImport("stream", "Duplex")
@js.native
class Duplex ()
  extends Readable
     with WritableStream {
  def this(opts: DuplexOptions) = this()
  def _write(data: String, encoding: String, callback: js.Function): Unit = js.native
  def _write(data: Buffer, encoding: String, callback: js.Function): Unit = js.native
}

