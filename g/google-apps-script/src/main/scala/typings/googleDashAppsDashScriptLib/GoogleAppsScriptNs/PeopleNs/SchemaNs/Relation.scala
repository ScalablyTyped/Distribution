package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var person: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Relation {
  @scala.inline
  def apply(
    formattedType: java.lang.String = null,
    metadata: FieldMetadata = null,
    person: java.lang.String = null,
    `type`: java.lang.String = null
  ): Relation = {
    val __obj = js.Dynamic.literal()
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (person != null) __obj.updateDynamic("person")(person)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Relation]
  }
}

