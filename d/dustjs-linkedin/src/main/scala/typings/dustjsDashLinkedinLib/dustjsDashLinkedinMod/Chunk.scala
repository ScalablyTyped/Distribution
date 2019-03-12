package typings
package dustjsDashLinkedinLib.dustjsDashLinkedinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk extends js.Object {
  /**
    * Writes data to this chunk's buffer and marks it as flushable. This method must be called on any chunks created via chunk.map. Do not call this method on a handler's main chunk -- dust.render and dust.stream take care of this for you.
    */
  def end(data: java.lang.String): Chunk
  /**
    * Creates a new chunk and passes it to callback. Use map to wrap asynchronous functions and to partition the template for streaming.
    */
  def map(callback: js.Function1[/* chunk */ this.type, _]): Chunk
  /**
    * Renders a template block, such as a default block or an else block.
    */
  def render(body: js.Any, context: Context): Chunk
  /**
    * Sets an error on this chunk and immediately flushes the output.
    */
  def setError(err: js.Any): Chunk
  /**
    * Convenience method to apply filters to a stream.
    */
  def tap(callback: js.Function1[/* value */ js.Any, _]): Chunk
  /**
    * Removes the head tap function from the list.
    */
  def untap(): Chunk
  /**
    * Writes data to this chunk's buffer. 
    */
  def write(data: java.lang.String): Chunk
}

object Chunk {
  @scala.inline
  def apply(
    end: java.lang.String => Chunk,
    map: js.Function1[Chunk, _] => Chunk,
    render: (js.Any, Context) => Chunk,
    setError: js.Any => Chunk,
    tap: js.Function1[/* value */ js.Any, _] => Chunk,
    untap: () => Chunk,
    write: java.lang.String => Chunk
  ): Chunk = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), map = js.Any.fromFunction1(map), render = js.Any.fromFunction2(render), setError = js.Any.fromFunction1(setError), tap = js.Any.fromFunction1(tap), untap = js.Any.fromFunction0(untap), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[Chunk]
  }
}

