package typings.domNavigation

import typings.domNavigation.domNavigationStrings.dispose
import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationHistoryEntry
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_dispose(`type`: dispose, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dispose(
    `type`: dispose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dispose(
    `type`: dispose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def getState(): Any = js.native
  
  val id: String = js.native
  
  val index: Double = js.native
  
  val key: String = js.native
  
  var ondispose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_dispose(`type`: dispose, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dispose(
    `type`: dispose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dispose(
    `type`: dispose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  val sameDocument: Boolean = js.native
  
  val url: String | Null = js.native
}
