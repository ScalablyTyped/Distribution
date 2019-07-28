package typings.detox.detoxMod.Global.DetoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitFor extends js.Object {
  /**
    * This API polls using the given expectation continuously until the expectation is met. Use manual synchronization with waitFor only as a last resort.
    * NOTE: Every waitFor call must set a timeout using withTimeout(). Calling waitFor without setting a timeout will do nothing.
    * @example await waitFor(element(by.id('UniqueId336'))).toExist().withTimeout(2000);
    */
  def apply(element: Element): Expect[WaitFor] = js.native
  /**
    * Performs the action repeatedly on the element until an expectation is met
    * @param by
    * @example await waitFor(element(by.text('Text5'))).toBeVisible().whileElement(by.id('ScrollView630')).scroll(50, 'down');
    */
  def whileElement(by: Matchers): DetoxAny = js.native
  /**
    * Waits for the condition to be met until the specified time (millis) have elapsed.
    * @param millis number
    * @example await waitFor(element(by.id('UniqueId336'))).toExist().withTimeout(2000);
    */
  def withTimeout(millis: Double): js.Promise[Unit] = js.native
}

