package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalEventSubscription extends StObject {
  
  /**
    * Cancels the subscription.
    * @chainable
    */
  def off(): DurandalEventSubscription = js.native
  
  /**
    * Attaches a callback to the event subscription.
    * @param {function} [callback] The callback function to invoke when the event is triggered. If `callback` is not provided, the previous callback will be re-activated.
    * @param {object} [context] An object to use as `this` when invoking the `callback`.
    * @chainable
    */
  def on(thenCallback: js.Function): DurandalEventSubscription = js.native
  def on(thenCallback: js.Function, context: js.Any): DurandalEventSubscription = js.native
  
  /**
    * Attaches a callback to the event subscription.
    * @param {function} callback The callback function to invoke when the event is triggered.
    * @param {object} [context] An object to use as `this` when invoking the `callback`.
    * @chainable
    */
  def `then`(thenCallback: js.Function): DurandalEventSubscription = js.native
  def `then`(thenCallback: js.Function, context: js.Any): DurandalEventSubscription = js.native
}
