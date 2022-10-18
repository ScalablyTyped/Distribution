package typings.esfxCanceltoken

import typings.esfxCanceltoken.esfxCanceltokenStrings.error
import typings.std.ErrorEvent
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWorker extends StObject {
  
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
}
