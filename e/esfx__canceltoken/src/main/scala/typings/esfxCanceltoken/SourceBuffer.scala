package typings.esfxCanceltoken

import typings.esfxCanceltoken.esfxCanceltokenStrings.abort
import typings.esfxCanceltoken.esfxCanceltokenStrings.error
import typings.esfxCanceltoken.esfxCanceltokenStrings.update
import typings.esfxCanceltoken.esfxCanceltokenStrings.updateend
import typings.esfxCanceltoken.esfxCanceltokenStrings.updatestart
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceBuffer extends StObject {
  
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_update(`type`: update, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_update(
    `type`: update,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_update(
    `type`: update,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateend(`type`: updateend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateend(
    `type`: updateend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateend(
    `type`: updateend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatestart(`type`: updatestart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatestart(
    `type`: updatestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatestart(
    `type`: updatestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
}
