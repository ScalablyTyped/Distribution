package typings
package eventemitter2Lib.eventemitter2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  /**
    * @default '.'
    * @description the delimiter used to segment namespaces.
    */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 10
    * @description the maximum amount of listeners that can be assigned to an event.
    */
  var maxListeners: js.UndefOr[scala.Double] = js.undefined
  /**
    * @default true
    * @description set this to `true` if you want to emit the newListener events.
    */
  var newListener: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default false
    * @description show event name in memory leak message when more than maximum amount of listeners is assigned, default false
    */
  var verboseMemoryLeak: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default false
    * @description set this to `true` to use wildcards.
    */
  var wildcard: js.UndefOr[scala.Boolean] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    maxListeners: scala.Int | scala.Double = null,
    newListener: js.UndefOr[scala.Boolean] = js.undefined,
    verboseMemoryLeak: js.UndefOr[scala.Boolean] = js.undefined,
    wildcard: js.UndefOr[scala.Boolean] = js.undefined
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (maxListeners != null) __obj.updateDynamic("maxListeners")(maxListeners.asInstanceOf[js.Any])
    if (!js.isUndefined(newListener)) __obj.updateDynamic("newListener")(newListener)
    if (!js.isUndefined(verboseMemoryLeak)) __obj.updateDynamic("verboseMemoryLeak")(verboseMemoryLeak)
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard)
    __obj.asInstanceOf[ConstructorOptions]
  }
}

