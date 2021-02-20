package typings.eventIterator

import typings.eventIterator.anon.PartialEventIteratorOptio
import typings.eventIterator.eventIteratorMod.EventIteratorOptions
import typings.eventIterator.eventIteratorMod.ListenHandler
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("event-iterator/lib/node", JSImport.Default)
  @js.native
  class default[T] protected ()
    extends typings.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/node", "EventIterator")
  @js.native
  class EventIterator[T] protected ()
    extends typings.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/node", "stream")
  @js.native
  def stream(): typings.eventIterator.eventIteratorMod.EventIterator[Buffer] = js.native
  @JSImport("event-iterator/lib/node", "stream")
  @js.native
  def stream(evOptions: EventIteratorOptions): typings.eventIterator.eventIteratorMod.EventIterator[Buffer] = js.native
}
