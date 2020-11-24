package typings.eventIterator

import typings.eventIterator.anon.PartialEventIteratorOptio
import typings.eventIterator.eventIteratorMod.EventIteratorOptions
import typings.eventIterator.eventIteratorMod.ListenHandler
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("event-iterator/lib/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  
  def stream(): typings.eventIterator.eventIteratorMod.EventIterator[Buffer] = js.native
  def stream(evOptions: EventIteratorOptions): typings.eventIterator.eventIteratorMod.EventIterator[Buffer] = js.native
  
  @js.native
  class EventIterator[T] protected ()
    extends typings.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @js.native
  class default[T] protected ()
    extends typings.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
}
