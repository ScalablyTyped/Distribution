package typings.esfxCanceltoken

import typings.esfxCanceltoken.esfxCanceltokenStrings.copy
import typings.esfxCanceltoken.esfxCanceltokenStrings.cut
import typings.esfxCanceltoken.esfxCanceltokenStrings.paste
import typings.std.ClipboardEvent
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAndElementEventHandlers extends StObject {
  
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
}
