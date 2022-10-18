package typings.esfxCanceltoken

import typings.esfxCanceltoken.esfxCanceltokenStrings.enter
import typings.esfxCanceltoken.esfxCanceltokenStrings.exit
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackCue extends StObject {
  
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(`type`: enter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
}
