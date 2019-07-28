package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  var formattedType: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var person: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Relation {
  @scala.inline
  def apply(
    formattedType: String = null,
    metadata: FieldMetadata = null,
    person: String = null,
    `type`: String = null
  ): Relation = {
    val __obj = js.Dynamic.literal()
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (person != null) __obj.updateDynamic("person")(person)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Relation]
  }
}

