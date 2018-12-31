package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateOptions extends js.Object {
  /** Controls rate-limiting of requests. Maximum number of requests per period. (Default: 50). */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** Period for rate limit, in milliseconds. (Default: 1000 ms). */
  var period: js.UndefOr[scala.Double] = js.undefined
}

