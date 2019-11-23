package typings.fontkit.fontkitMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fontkit extends js.Object {
  /**
    * Returns a font object for the given buffer.
    * For collection fonts (such as TrueType collection files),
    * you can pass a postscriptName to get that font out of the collection instead of a collection object.
    */
  def create(buffer: Buffer): Font = js.native
  def create(buffer: Buffer, postscriptName: String): Font = js.native
  /**
    * Opens a font file asynchronously, and calls the callback with a font object.
    * For collection fonts (such as TrueType collection files),
    * you can pass a postscriptName to get that font out of the collection instead of a collection object.
    */
  def open(
    filename: String,
    postscriptName: String,
    callback: js.Function2[/* err */ Error | Null, /* font */ Font, Unit]
  ): Unit = js.native
  /**
    * Opens a font file synchronously, and returns a font object.
    * For collection fonts (such as TrueType collection files),
    * you can pass a postscriptName to get that font out of the collection instead of a collection object.
    */
  def openSync(filename: String): Font = js.native
  def openSync(filename: String, postscriptName: String): Font = js.native
}

