package typings.dustjsLinkedin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chunk extends js.Object {
  
  /**
    * Writes data to this chunk's buffer and marks it as flushable. This method must be called on any chunks created via chunk.map. Do not call this method on a handler's main chunk -- dust.render and dust.stream take care of this for you.
    */
  def end(data: String): Chunk = js.native
  
  /**
    * Creates a new chunk and passes it to callback. Use map to wrap asynchronous functions and to partition the template for streaming.
    */
  def map(callback: js.Function1[/* chunk */ this.type, _]): Chunk = js.native
  
  /**
    * Renders a template block, such as a default block or an else block.
    */
  def render(body: js.Any, context: Context): Chunk = js.native
  
  /**
    * Sets an error on this chunk and immediately flushes the output.
    */
  def setError(err: js.Any): Chunk = js.native
  
  /**
    * Convenience method to apply filters to a stream.
    */
  def tap(callback: js.Function1[/* value */ js.Any, _]): Chunk = js.native
  
  /**
    * Removes the head tap function from the list.
    */
  def untap(): Chunk = js.native
  
  /**
    * Writes data to this chunk's buffer. 
    */
  def write(data: String): Chunk = js.native
}
object Chunk {
  
  @scala.inline
  def apply(
    end: String => Chunk,
    map: js.Function1[Chunk, _] => Chunk,
    render: (js.Any, Context) => Chunk,
    setError: js.Any => Chunk,
    tap: js.Function1[/* value */ js.Any, _] => Chunk,
    untap: () => Chunk,
    write: String => Chunk
  ): Chunk = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), map = js.Any.fromFunction1(map), render = js.Any.fromFunction2(render), setError = js.Any.fromFunction1(setError), tap = js.Any.fromFunction1(tap), untap = js.Any.fromFunction0(untap), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Chunk]
  }
  
  @scala.inline
  implicit class ChunkOps[Self <: Chunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnd(value: String => Chunk): Self = this.set("end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: js.Function1[Chunk, _] => Chunk): Self = this.set("map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: (js.Any, Context) => Chunk): Self = this.set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetError(value: js.Any => Chunk): Self = this.set("setError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTap(value: js.Function1[/* value */ js.Any, _] => Chunk): Self = this.set("tap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUntap(value: () => Chunk): Self = this.set("untap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrite(value: String => Chunk): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
