package typings
package expressDashBruteLib.expressDashBruteMod.ExpressBruteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  /**
    * @summary Allows you to override the value of failCallback for this middleware.
    * @type {Function}
    */
  var failCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * @summary Disregard IP address when matching requests if set to true. Defaults to false.
    * @type {boolean}
    */
  var ignoreIP: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @summary Key.
    * @type {any}
    */
  var key: js.UndefOr[js.Any] = js.undefined
}

