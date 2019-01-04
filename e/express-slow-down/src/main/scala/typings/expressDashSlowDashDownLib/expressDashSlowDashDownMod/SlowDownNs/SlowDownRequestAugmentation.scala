package typings
package expressDashSlowDashDownLib.expressDashSlowDashDownMod.SlowDownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlowDownRequestAugmentation extends js.Object {
  /**
    * The number of requests in the current window
    */
  var current: scala.Double
  /**
    * Amount of delay imposed on current request in milliseconds
    */
  var delay: scala.Double
  /**
    * The `options.delayAfter` value
    */
  var limit: scala.Double
  /**
    * the number of requests remaining before rate-limiting begins
    */
  var remaining: scala.Double
  /**
    * When the window will reset, `current` will return to `0`, and `remaining` will return
    * to limit. Represents milliseconds since epoch (compare to `Date.now()`). This field
    * depends on store support. It will be `undefined` if the store does not provide the value.
    */
  var resetTime: js.UndefOr[scala.Double] = js.undefined
}

