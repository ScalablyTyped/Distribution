package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  /**
    * @default '.'
    * @description the delimiter used to segment namespaces.
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * @default false
    * @description disable throwing uncaughtException if an error event is emitted and it has no listeners
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 10
    * @description the maximum amount of listeners that can be assigned to an event.
    */
  var maxListeners: js.UndefOr[Double] = js.undefined
  /**
    * @default false
    * @description set this to `true` if you want to emit the newListener events.
    */
  var newListener: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    * @description set this to `true` if you want to emit the removeListener events.
    */
  var removeListener: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    * @description show event name in memory leak message when more than maximum amount of listeners is assigned, default false
    */
  var verboseMemoryLeak: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    * @description set this to `true` to use wildcards.
    */
  var wildcard: js.UndefOr[Boolean] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    maxListeners: Int | Double = null,
    newListener: js.UndefOr[Boolean] = js.undefined,
    removeListener: js.UndefOr[Boolean] = js.undefined,
    verboseMemoryLeak: js.UndefOr[Boolean] = js.undefined,
    wildcard: js.UndefOr[Boolean] = js.undefined
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    if (maxListeners != null) __obj.updateDynamic("maxListeners")(maxListeners.asInstanceOf[js.Any])
    if (!js.isUndefined(newListener)) __obj.updateDynamic("newListener")(newListener.asInstanceOf[js.Any])
    if (!js.isUndefined(removeListener)) __obj.updateDynamic("removeListener")(removeListener.asInstanceOf[js.Any])
    if (!js.isUndefined(verboseMemoryLeak)) __obj.updateDynamic("verboseMemoryLeak")(verboseMemoryLeak.asInstanceOf[js.Any])
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}

