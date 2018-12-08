package typings
package detoxLib.detoxMod.Global.DetoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def apply(by: Matchers): DetoxAny = js.native
  /**
               * Choose from multiple elements matching the same matcher using index
               * @param index
               * @example await element(by.text('Product')).atIndex(2);
               */
  def atIndex(index: scala.Double): DetoxAny = js.native
}

