package typings.gapiDotUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldsProjection extends js.Object {
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

object Anon_FieldsProjection {
  @scala.inline
  def apply(fields: String = null, projection: String = null, `start-token`: String = null): Anon_FieldsProjection = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (`start-token` != null) __obj.updateDynamic("start-token")(`start-token`)
    __obj.asInstanceOf[Anon_FieldsProjection]
  }
}

