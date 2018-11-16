package typings
package firebirdLib.firebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents BLOB stream.
     *
     * @desc
     * Create BLOB stream using
     * @code var strm = new fb.Stream(FBblob);.
     *
     * You may pipe strm to/from NodeJS Stream objects (fs or socket).
     * You may also look at [NodeJS Streams reference](https://nodejs.org/api/stream.html).
     */
@JSImport("firebird", "Stream")
@js.native
class Stream protected ()
  extends nodeLib.streamMod.Stream {
  def this(blob: FBBlob) = this()
  /* NodeJS.ReadStream */
  var readable: scala.Boolean = js.native
  /* NodeJS.WriteStream */
  var writable: scala.Boolean = js.native
  def check_destroyed(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(error: nodeLib.Error): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def end(buffer: nodeLib.Buffer): scala.Unit = js.native
  def end(buffer: nodeLib.Buffer, cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Unit = js.native
  def pause(): this.type = js.native
  def resume(): this.type = js.native
  def write(buffer: java.lang.String): scala.Boolean = js.native
  def write(buffer: java.lang.String, cb: js.Function): scala.Boolean = js.native
  def write(buffer: nodeLib.Buffer): scala.Boolean = js.native
  def write(buffer: nodeLib.Buffer, cb: js.Function): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Boolean = js.native
}

