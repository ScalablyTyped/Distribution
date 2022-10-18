package typings.esfxCanceltoken

import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTarget extends StObject {
  
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, callback: Null, options: AddEventListenerOptionsWithCancelToken): Unit = js.native
  def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
}
