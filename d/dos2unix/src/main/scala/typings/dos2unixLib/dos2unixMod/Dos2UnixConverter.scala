package typings
package dos2unixLib.dos2unixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dos2UnixConverter
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("on")
  def on_convertend(
    event: dos2unixLib.dos2unixLibStrings.convertDOTend,
    cb: js.Function1[/* data */ FileData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_converterror(
    event: dos2unixLib.dos2unixLibStrings.convertDOTerror,
    cb: js.Function1[/* data */ MessageData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_convertstart(
    event: dos2unixLib.dos2unixLibStrings.convertDOTstart,
    cb: js.Function1[/* data */ FileData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: dos2unixLib.dos2unixLibStrings.end, cb: js.Function1[/* stats */ Stats, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: dos2unixLib.dos2unixLibStrings.error,
    cb: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_processingend(
    event: dos2unixLib.dos2unixLibStrings.processingDOTend,
    cb: js.Function1[/* data */ FileData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_processingerror(
    event: dos2unixLib.dos2unixLibStrings.processingDOTerror,
    cb: js.Function1[/* data */ MessageData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_processingskip(
    event: dos2unixLib.dos2unixLibStrings.processingDOTskip,
    cb: js.Function1[/* data */ MessageData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_processingstart(
    event: dos2unixLib.dos2unixLibStrings.processingDOTstart,
    cb: js.Function1[/* data */ FileData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_start(event: dos2unixLib.dos2unixLibStrings.start, cb: js.Function0[scala.Unit]): this.type = js.native
  def process(globPatterns: js.Array[java.lang.String]): scala.Unit = js.native
  def process(globPatterns: js.Array[java.lang.String], options: Options): scala.Unit = js.native
}

