package typings.domNavigation

import typings.domNavigation.domNavigationStrings.currententrychange
import typings.domNavigation.domNavigationStrings.navigate
import typings.domNavigation.domNavigationStrings.navigateerror
import typings.domNavigation.domNavigationStrings.navigatesuccess
import typings.std.AddEventListenerOptions
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigation
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_currententrychange(
    `type`: currententrychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigationCurrentEntryChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currententrychange(
    `type`: currententrychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigationCurrentEntryChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currententrychange(
    `type`: currententrychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigationCurrentEntryChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigate(`type`: navigate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigateEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigate(
    `type`: navigate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigateEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigate(
    `type`: navigate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigateEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigateerror(`type`: navigateerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigateerror(
    `type`: navigateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigateerror(
    `type`: navigateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigatesuccess(`type`: navigatesuccess, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigatesuccess(
    `type`: navigatesuccess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigatesuccess(
    `type`: navigatesuccess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def back(): NavigationResult = js.native
  def back(options: NavigationOptions): NavigationResult = js.native
  
  val canGoBack: Boolean = js.native
  
  val canGoForward: Boolean = js.native
  
  val currentEntry: NavigationHistoryEntry | Null = js.native
  
  def entries(): js.Array[NavigationHistoryEntry] = js.native
  
  def forward(): NavigationResult = js.native
  def forward(options: NavigationOptions): NavigationResult = js.native
  
  def navigate(url: String): NavigationResult = js.native
  def navigate(url: String, options: NavigationNavigateOptions): NavigationResult = js.native
  
  var oncurrententrychange: (js.ThisFunction1[/* this */ this.type, /* ev */ NavigationCurrentEntryChangeEvent, Any]) | Null = js.native
  
  var onnavigate: (js.ThisFunction1[/* this */ this.type, /* ev */ NavigateEvent, Any]) | Null = js.native
  
  var onnavigateerror: (js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]) | Null = js.native
  
  var onnavigatesuccess: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  def reload(): NavigationResult = js.native
  def reload(options: NavigationReloadOptions): NavigationResult = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_currententrychange(
    `type`: currententrychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigationCurrentEntryChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_currententrychange(
    `type`: currententrychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigationCurrentEntryChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_currententrychange(
    `type`: currententrychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigationCurrentEntryChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigate(`type`: navigate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigateEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigate(
    `type`: navigate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigateEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigate(
    `type`: navigate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NavigateEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigateerror(`type`: navigateerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigateerror(
    `type`: navigateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigateerror(
    `type`: navigateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigatesuccess(`type`: navigatesuccess, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigatesuccess(
    `type`: navigatesuccess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigatesuccess(
    `type`: navigatesuccess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  val transition: NavigationTransition | Null = js.native
  
  def traverseTo(key: String): NavigationResult = js.native
  def traverseTo(key: String, options: NavigationOptions): NavigationResult = js.native
  
  def updateCurrentEntry(options: NavigationUpdateCurrentEntryOptions): Unit = js.native
}
