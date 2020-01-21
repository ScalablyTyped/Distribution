package typings.ebml.mod

import typings.ebml.mod.Decoder.State
import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ebml", "Decoder")
@js.native
class Decoder_ () extends Transform {
  var buffer: Buffer = js.native
  var cursor: Double = js.native
  var state: State = js.native
  var tagStack: js.Array[TagMetadata] = js.native
  var total: Double = js.native
  // #region Duplex methods overloadings
  def addListener[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  def end(chunk: Buffer): Unit = js.native
  def end(chunk: Buffer, cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer, encoding: String): Unit = js.native
  def end(chunk: Buffer, encoding: String, cb: js.Function0[Unit]): Unit = js.native
  def on[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  def once[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  def prependListener[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  def prependOnceListener[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  def readContent(): Boolean = js.native
  def readSize(): Boolean = js.native
  def readTag(): Boolean = js.native
  def removeListener[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  def write(chunk: Buffer): Boolean = js.native
  def write(chunk: Buffer, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(chunk: Buffer, encoding: String): Boolean = js.native
  def write(chunk: Buffer, encoding: String, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
}

