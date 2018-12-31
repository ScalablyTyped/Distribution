package typings
package feedmeLib.feedmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedMe
  extends nodeLib.streamMod.Writable {
  /**
    * Can only be used if buffer is true. It returns the feed as a Javascript object, should be called after end is emitted from the parser.
    * Subelements are put as children objects with their names as keys. When one object has more than one child of the same name, they are
    * put into an array. Items are always put into an array.
    */
  def done(): feedmeLib.feedmeMod.FeedMeNs.Document = js.native
  @JSName("on")
  def on_close(event: feedmeLib.feedmeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: feedmeLib.feedmeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: feedmeLib.feedmeLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_finish(event: feedmeLib.feedmeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_item(
    event: feedmeLib.feedmeLibStrings.item,
    listener: js.Function1[/* item */ feedmeLib.feedmeMod.FeedMeNs.Item, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pipe(
    event: feedmeLib.feedmeLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_type(
    event: feedmeLib.feedmeLibStrings.`type`,
    listener: js.Function1[/* type */ feedmeLib.feedmeMod.FeedMeNs.Type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unpipe(
    event: feedmeLib.feedmeLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
}

