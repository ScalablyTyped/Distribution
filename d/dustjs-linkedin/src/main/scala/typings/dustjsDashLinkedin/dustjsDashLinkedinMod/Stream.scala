package typings.dustjsDashLinkedin.dustjsDashLinkedinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  def emit(evt: String, data: js.Any): Unit
  def flush(): Unit
  /*
    * Registers an event listener. Streams accept a single listener for a given event.
    * @param evt the event. Possible values are data, end, error (maybe more, look in the source).
    */
  def on(evt: String, callback: js.Function1[/* data */ js.UndefOr[js.Any], _]): this.type
  def pipe(stream: Stream): Stream
}

object Stream {
  @scala.inline
  def apply(
    emit: (String, js.Any) => Unit,
    flush: () => Unit,
    on: (String, js.Function1[/* data */ js.UndefOr[js.Any], _]) => Stream,
    pipe: Stream => Stream
  ): Stream = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), flush = js.Any.fromFunction0(flush), on = js.Any.fromFunction2(on), pipe = js.Any.fromFunction1(pipe))
  
    __obj.asInstanceOf[Stream]
  }
}

