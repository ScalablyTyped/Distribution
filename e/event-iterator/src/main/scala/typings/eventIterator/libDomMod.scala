package typings.eventIterator

import typings.eventIterator.anon.PartialEventIteratorOptio
import typings.eventIterator.libEventIteratorMod.EventIteratorOptions
import typings.eventIterator.libEventIteratorMod.ListenHandler
import typings.std.AddEventListenerOptions
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomMod {
  
  @JSImport("event-iterator/lib/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("event-iterator/lib/dom", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends typings.eventIterator.libEventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/dom", "EventIterator")
  @js.native
  open class EventIterator[T] protected ()
    extends typings.eventIterator.libEventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  inline def subscribe(event: String): typings.eventIterator.libEventIteratorMod.EventIterator[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any]).asInstanceOf[typings.eventIterator.libEventIteratorMod.EventIterator[Event]]
  inline def subscribe(event: String, options: Unit, evOptions: EventIteratorOptions): typings.eventIterator.libEventIteratorMod.EventIterator[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any], evOptions.asInstanceOf[js.Any])).asInstanceOf[typings.eventIterator.libEventIteratorMod.EventIterator[Event]]
  inline def subscribe(event: String, options: AddEventListenerOptions): typings.eventIterator.libEventIteratorMod.EventIterator[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.eventIterator.libEventIteratorMod.EventIterator[Event]]
  inline def subscribe(event: String, options: AddEventListenerOptions, evOptions: EventIteratorOptions): typings.eventIterator.libEventIteratorMod.EventIterator[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any], evOptions.asInstanceOf[js.Any])).asInstanceOf[typings.eventIterator.libEventIteratorMod.EventIterator[Event]]
}
