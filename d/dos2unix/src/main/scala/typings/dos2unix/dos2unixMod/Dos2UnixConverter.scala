package typings.dos2unix.dos2unixMod

import typings.dos2unix.dos2unixStrings.convertDOTend
import typings.dos2unix.dos2unixStrings.convertDOTerror
import typings.dos2unix.dos2unixStrings.convertDOTstart
import typings.dos2unix.dos2unixStrings.end
import typings.dos2unix.dos2unixStrings.error
import typings.dos2unix.dos2unixStrings.processingDOTend
import typings.dos2unix.dos2unixStrings.processingDOTerror
import typings.dos2unix.dos2unixStrings.processingDOTskip
import typings.dos2unix.dos2unixStrings.processingDOTstart
import typings.dos2unix.dos2unixStrings.start
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dos2UnixConverter extends EventEmitter {
  @JSName("on")
  def on_convertend(event: convertDOTend, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_converterror(event: convertDOTerror, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
  @JSName("on")
  def on_convertstart(event: convertDOTstart, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, cb: js.Function1[/* stats */ Stats, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): this.type = js.native
  @JSName("on")
  def on_processingend(event: processingDOTend, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_processingerror(event: processingDOTerror, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
  @JSName("on")
  def on_processingskip(event: processingDOTskip, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
  @JSName("on")
  def on_processingstart(event: processingDOTstart, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
  def process(globPatterns: js.Array[String]): Unit = js.native
  def process(globPatterns: js.Array[String], options: Options): Unit = js.native
}

