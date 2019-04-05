package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nickname extends js.Object {
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Nickname {
  @scala.inline
  def apply(metadata: FieldMetadata = null, `type`: java.lang.String = null, value: java.lang.String = null): Nickname = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Nickname]
  }
}

