package typings.esfxCanceltoken

import typings.esfxCanceltoken.esfxCanceltokenStrings.afterprint
import typings.esfxCanceltoken.esfxCanceltokenStrings.beforeprint
import typings.esfxCanceltoken.esfxCanceltokenStrings.beforeunload
import typings.esfxCanceltoken.esfxCanceltokenStrings.gamepadconnected
import typings.esfxCanceltoken.esfxCanceltokenStrings.gamepaddisconnected
import typings.esfxCanceltoken.esfxCanceltokenStrings.hashchange
import typings.esfxCanceltoken.esfxCanceltokenStrings.languagechange
import typings.esfxCanceltoken.esfxCanceltokenStrings.message
import typings.esfxCanceltoken.esfxCanceltokenStrings.messageerror
import typings.esfxCanceltoken.esfxCanceltokenStrings.offline
import typings.esfxCanceltoken.esfxCanceltokenStrings.online
import typings.esfxCanceltoken.esfxCanceltokenStrings.pagehide
import typings.esfxCanceltoken.esfxCanceltokenStrings.pageshow
import typings.esfxCanceltoken.esfxCanceltokenStrings.popstate
import typings.esfxCanceltoken.esfxCanceltokenStrings.rejectionhandled
import typings.esfxCanceltoken.esfxCanceltokenStrings.storage
import typings.esfxCanceltoken.esfxCanceltokenStrings.unhandledrejection
import typings.esfxCanceltoken.esfxCanceltokenStrings.unload
import typings.std.BeforeUnloadEvent
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.GamepadEvent
import typings.std.HashChangeEvent
import typings.std.MessageEvent
import typings.std.PageTransitionEvent
import typings.std.PopStateEvent
import typings.std.PromiseRejectionEvent
import typings.std.StorageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowEventHandlers extends StObject {
  
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
}
