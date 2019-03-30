package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tagline extends js.Object {
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Tagline {
  @scala.inline
  def apply(metadata: FieldMetadata = null, value: java.lang.String = null): Tagline = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Tagline]
  }
}

