package typings
package dicerLib.dicerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable:unified-signatures
/**
  * A very fast streaming multipart parser for node.js.
  * Dicer is a WritableStream
  *
  * Dicer (special) events:
  * - on('finish', ()) - Emitted when all parts have been parsed and the Dicer instance has been ended.
  * - on('part', (stream: PartStream)) - Emitted when a new part has been found.
  * - on('preamble', (stream: PartStream)) - Emitted for preamble if you should happen to need it (can usually be ignored).
  * - on('trailer', (data: Buffer)) - Emitted when trailing data was found after the terminating boundary (as with the preamble, this can usually be ignored too).
  */
@js.native
trait Dicer
  extends nodeLib.streamMod.Writable {
  @JSName("addListener")
  def addListener_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: dicerLib.dicerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: dicerLib.dicerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_part(
    event: dicerLib.dicerLibStrings.part,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(
    event: dicerLib.dicerLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_preamble(
    event: dicerLib.dicerLibStrings.preamble,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_trailer(
    event: dicerLib.dicerLibStrings.trailer,
    listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(
    event: dicerLib.dicerLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: dicerLib.dicerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: dicerLib.dicerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_part(
    event: dicerLib.dicerLibStrings.part,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pipe(
    event: dicerLib.dicerLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_preamble(
    event: dicerLib.dicerLibStrings.preamble,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_trailer(
    event: dicerLib.dicerLibStrings.trailer,
    listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unpipe(
    event: dicerLib.dicerLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: dicerLib.dicerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: dicerLib.dicerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_part(
    event: dicerLib.dicerLibStrings.part,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pipe(
    event: dicerLib.dicerLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_preamble(
    event: dicerLib.dicerLibStrings.preamble,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_trailer(
    event: dicerLib.dicerLibStrings.trailer,
    listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_unpipe(
    event: dicerLib.dicerLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: dicerLib.dicerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: dicerLib.dicerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_part(
    event: dicerLib.dicerLibStrings.part,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(
    event: dicerLib.dicerLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_preamble(
    event: dicerLib.dicerLibStrings.preamble,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_trailer(
    event: dicerLib.dicerLibStrings.trailer,
    listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(
    event: dicerLib.dicerLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: dicerLib.dicerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: dicerLib.dicerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_part(
    event: dicerLib.dicerLibStrings.part,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(
    event: dicerLib.dicerLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_preamble(
    event: dicerLib.dicerLibStrings.preamble,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_trailer(
    event: dicerLib.dicerLibStrings.trailer,
    listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(
    event: dicerLib.dicerLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: dicerLib.dicerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: dicerLib.dicerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_part(
    event: dicerLib.dicerLibStrings.part,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_pipe(
    event: dicerLib.dicerLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_preamble(
    event: dicerLib.dicerLibStrings.preamble,
    listener: js.Function1[/* stream */ dicerLib.dicerMod.DicerNs.PartStream, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_trailer(
    event: dicerLib.dicerLibStrings.trailer,
    listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_unpipe(
    event: dicerLib.dicerLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  /**
    * Sets the boundary to use for parsing and performs some initialization needed for parsing.
    * You should only need to use this if you set headerFirst to true in the constructor and are parsing the boundary from the preamble header.
    *
    * @param boundary The boundary to use
    */
  def setBoundary(boundary: java.lang.String): scala.Unit = js.native
}

