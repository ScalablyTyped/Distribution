package typings.eventIterator.eventIteratorMod

import typings.eventIterator.anon.PartialEventIteratorOptio
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("event-iterator/lib/event-iterator", "EventIterator")
@js.native
class EventIterator[T] protected () extends AsyncIterable[T] {
  def this(listen: ListenHandler[T]) = this()
  def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
}
