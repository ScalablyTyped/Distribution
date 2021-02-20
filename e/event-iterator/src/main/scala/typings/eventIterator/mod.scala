package typings.eventIterator

import typings.eventIterator.anon.PartialEventIteratorOptio
import typings.eventIterator.eventIteratorMod.EventIteratorOptions
import typings.eventIterator.eventIteratorMod.ListenHandler
import typings.std.AddEventListenerOptions
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-iterator/lib/dom", JSImport.Default)
  @js.native
  class default[T] protected ()
    extends typings.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/dom", "EventIterator")
  @js.native
  class EventIterator[T] protected ()
    extends typings.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/dom", "subscribe")
  @js.native
  def subscribe(event: String): typings.eventIterator.eventIteratorMod.EventIterator[Event] = js.native
  @JSImport("event-iterator/lib/dom", "subscribe")
  @js.native
  def subscribe(event: String, options: js.UndefOr[scala.Nothing], evOptions: EventIteratorOptions): typings.eventIterator.eventIteratorMod.EventIterator[Event] = js.native
  @JSImport("event-iterator/lib/dom", "subscribe")
  @js.native
  def subscribe(event: String, options: AddEventListenerOptions): typings.eventIterator.eventIteratorMod.EventIterator[Event] = js.native
  @JSImport("event-iterator/lib/dom", "subscribe")
  @js.native
  def subscribe(event: String, options: AddEventListenerOptions, evOptions: EventIteratorOptions): typings.eventIterator.eventIteratorMod.EventIterator[Event] = js.native
}
