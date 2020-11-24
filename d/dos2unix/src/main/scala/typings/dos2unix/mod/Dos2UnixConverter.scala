package typings.dos2unix.mod

import typings.dos2unix.dos2unixStrings.convertDotend
import typings.dos2unix.dos2unixStrings.convertDoterror
import typings.dos2unix.dos2unixStrings.convertDotstart
import typings.dos2unix.dos2unixStrings.end
import typings.dos2unix.dos2unixStrings.error
import typings.dos2unix.dos2unixStrings.processingDotend
import typings.dos2unix.dos2unixStrings.processingDoterror
import typings.dos2unix.dos2unixStrings.processingDotskip
import typings.dos2unix.dos2unixStrings.processingDotstart
import typings.dos2unix.dos2unixStrings.start
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dos2UnixConverter extends EventEmitter {
  
  @JSName("on")
  def on_convertend(event: convertDotend, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_converterror(event: convertDoterror, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
  @JSName("on")
  def on_convertstart(event: convertDotstart, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, cb: js.Function1[/* stats */ Stats, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): this.type = js.native
  @JSName("on")
  def on_processingend(event: processingDotend, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_processingerror(event: processingDoterror, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
  @JSName("on")
  def on_processingskip(event: processingDotskip, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
  @JSName("on")
  def on_processingstart(event: processingDotstart, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
  
  def process(globPatterns: js.Array[String]): Unit = js.native
  def process(globPatterns: js.Array[String], options: Options): Unit = js.native
}
