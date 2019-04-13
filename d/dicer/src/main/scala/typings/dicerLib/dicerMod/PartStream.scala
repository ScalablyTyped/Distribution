package typings
package dicerLib.dicerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PartStream is a _ReadableStream_
  *
  * PartStream (special) events:
  * - on('header', (header: object)) - An object containing the header for this particular part. Each property value is an array of one or more string values.
  */
@js.native
trait PartStream
  extends nodeLib.streamMod.Readable {
  @JSName("addListener")
  def addListener_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(
    event: dicerLib.dicerLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: dicerLib.dicerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_header(event: dicerLib.dicerLibStrings.header, listener: js.Function1[/* header */ js.Object, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: dicerLib.dicerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: dicerLib.dicerLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: dicerLib.dicerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_header(event: dicerLib.dicerLibStrings.header, listener: js.Function1[/* header */ js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: dicerLib.dicerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_data(
    event: dicerLib.dicerLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_end(event: dicerLib.dicerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_header(event: dicerLib.dicerLibStrings.header, listener: js.Function1[/* header */ js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: dicerLib.dicerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(
    event: dicerLib.dicerLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: dicerLib.dicerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_header(event: dicerLib.dicerLibStrings.header, listener: js.Function1[/* header */ js.Object, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: dicerLib.dicerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(
    event: dicerLib.dicerLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: dicerLib.dicerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_header(event: dicerLib.dicerLibStrings.header, listener: js.Function1[/* header */ js.Object, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: dicerLib.dicerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: dicerLib.dicerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(
    event: dicerLib.dicerLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: dicerLib.dicerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: dicerLib.dicerLibStrings.error, listener: js.Function1[/* err */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_header(event: dicerLib.dicerLibStrings.header, listener: js.Function1[/* header */ js.Object, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: dicerLib.dicerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
}

