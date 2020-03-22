package typings.gapiUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjection extends js.Object {
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * Additional information to return. ANALYTICS_CLICKS, FULL
    */
  var projection: js.UndefOr[String] = js.undefined
  /**
    * Token for requesting successive pages of results.
    */
  var `start-token`: js.UndefOr[String] = js.undefined
}

object AnonProjection {
  @scala.inline
  def apply(fields: String = null, projection: String = null, `start-token`: String = null): AnonProjection = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (`start-token` != null) __obj.updateDynamic("start-token")(`start-token`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjection]
  }
}

