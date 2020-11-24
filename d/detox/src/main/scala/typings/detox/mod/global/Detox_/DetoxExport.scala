package typings.detox.mod.global.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Detox exports all methods from detox global and all of the global constants.
@js.native
trait DetoxExport extends Detox {
  
  def by(by: Matchers): Matchers = js.native
  @JSName("by")
  var by_Original: Matchers = js.native
  
  var device: Device = js.native
  
  def element(by: Matchers): DetoxAny = js.native
  @JSName("element")
  var element_Original: Element = js.native
  
  def expect(element: Element): Expect[js.Promise[Unit]] = js.native
  @JSName("expect")
  var expect_Original: Expect[Expect[js.Promise[Unit]]] = js.native
  
  /**
    * This API polls using the given expectation continuously until the expectation is met. Use manual synchronization with waitFor only as a last resort.
    * NOTE: Every waitFor call must set a timeout using withTimeout(). Calling waitFor without setting a timeout will do nothing.
    * @example await waitFor(element(by.id('UniqueId336'))).toExist().withTimeout(2000);
    */
  def waitFor(element: Element): Expect[WaitFor] = js.native
  @JSName("waitFor")
  var waitFor_Original: WaitFor = js.native
}
