package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonMetadata extends js.Object {
  var deleted: js.UndefOr[Boolean] = js.undefined
  var linkedPeopleResourceNames: js.UndefOr[js.Array[String]] = js.undefined
  var objectType: js.UndefOr[String] = js.undefined
  var previousResourceNames: js.UndefOr[js.Array[String]] = js.undefined
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}

object PersonMetadata {
  @scala.inline
  def apply(
    deleted: js.UndefOr[Boolean] = js.undefined,
    linkedPeopleResourceNames: js.Array[String] = null,
    objectType: String = null,
    previousResourceNames: js.Array[String] = null,
    sources: js.Array[Source] = null
  ): PersonMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (linkedPeopleResourceNames != null) __obj.updateDynamic("linkedPeopleResourceNames")(linkedPeopleResourceNames)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (previousResourceNames != null) __obj.updateDynamic("previousResourceNames")(previousResourceNames)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[PersonMetadata]
  }
}

