package typings.ebml.ebmlMod.DecoderNs

import typings.ebml.ebmlMod.StateAndTagData
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerMap extends js.Object {
  def close(): Unit
  def data(chunk: StateAndTagData): Unit
  def end(): Unit
  def error(err: Error): Unit
  def readable(): Unit
}

object EventListenerMap {
  @scala.inline
  def apply(
    close: () => Unit,
    data: StateAndTagData => Unit,
    end: () => Unit,
    error: Error => Unit,
    readable: () => Unit
  ): EventListenerMap = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = js.Any.fromFunction1(data), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction0(readable))
  
    __obj.asInstanceOf[EventListenerMap]
  }
}

