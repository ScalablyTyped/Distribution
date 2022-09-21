package typings.eventIterator

import typings.eventIterator.anon.PartialEventIteratorOptio
import typings.eventIterator.eventIteratorMod.EventIteratorOptions
import typings.eventIterator.eventIteratorMod.ListenHandler
import typings.std.AddEventListenerOptions
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-iterator/lib/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("event-iterator/lib/dom", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends typings.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/dom", "EventIterator")
  @js.native
  open class EventIterator[T] protected ()
    extends typings.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  inline def subscribe(event: String): typings.eventIterator.eventIteratorMod.EventIterator[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any]).asInstanceOf[typings.eventIterator.eventIteratorMod.EventIterator[Event]]
  inline def subscribe(event: String, options: Unit, evOptions: EventIteratorOptions): typings.eventIterator.eventIteratorMod.EventIterator[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any], evOptions.asInstanceOf[js.Any])).asInstanceOf[typings.eventIterator.eventIteratorMod.EventIterator[Event]]
  inline def subscribe(event: String, options: AddEventListenerOptions): typings.eventIterator.eventIteratorMod.EventIterator[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.eventIterator.eventIteratorMod.EventIterator[Event]]
  inline def subscribe(event: String, options: AddEventListenerOptions, evOptions: EventIteratorOptions): typings.eventIterator.eventIteratorMod.EventIterator[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any], evOptions.asInstanceOf[js.Any])).asInstanceOf[typings.eventIterator.eventIteratorMod.EventIterator[Event]]
}
