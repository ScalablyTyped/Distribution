package typings
package gapiDotUrlshortenerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldsProjection extends js.Object {
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional information to return. ANALYTICS_CLICKS, FULL
    */
  var projection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Token for requesting successive pages of results.
    */
  var `start-token`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FieldsProjection {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    projection: java.lang.String = null,
    `start-token`: java.lang.String = null
  ): Anon_FieldsProjection = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (`start-token` != null) __obj.updateDynamic("start-token")(`start-token`)
    __obj.asInstanceOf[Anon_FieldsProjection]
  }
}

