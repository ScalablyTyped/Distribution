package typings.esfxCanceltoken

import typings.esfxCanceltoken.esfxCanceltokenStrings.boundary
import typings.esfxCanceltoken.esfxCanceltokenStrings.end
import typings.esfxCanceltoken.esfxCanceltokenStrings.error
import typings.esfxCanceltoken.esfxCanceltokenStrings.mark
import typings.esfxCanceltoken.esfxCanceltokenStrings.pause
import typings.esfxCanceltoken.esfxCanceltokenStrings.resume
import typings.esfxCanceltoken.esfxCanceltokenStrings.start
import typings.std.EventListenerOrEventListenerObject
import typings.std.SpeechSynthesisErrorEvent
import typings.std.SpeechSynthesisEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechSynthesisUtterance extends StObject {
  
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(`type`: end, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(`type`: mark, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
}
