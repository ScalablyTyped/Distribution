package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var date: js.UndefOr[Date] = js.undefined
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    date: Date = null,
    formattedType: java.lang.String = null,
    metadata: FieldMetadata = null,
    `type`: java.lang.String = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

