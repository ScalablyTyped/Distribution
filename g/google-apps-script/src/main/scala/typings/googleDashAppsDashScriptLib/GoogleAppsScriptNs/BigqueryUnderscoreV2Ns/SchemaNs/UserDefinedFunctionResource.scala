package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedFunctionResource extends js.Object {
  var inlineCode: js.UndefOr[java.lang.String] = js.undefined
  var resourceUri: js.UndefOr[java.lang.String] = js.undefined
}

object UserDefinedFunctionResource {
  @scala.inline
  def apply(inlineCode: java.lang.String = null, resourceUri: java.lang.String = null): UserDefinedFunctionResource = {
    val __obj = js.Dynamic.literal()
    if (inlineCode != null) __obj.updateDynamic("inlineCode")(inlineCode)
    if (resourceUri != null) __obj.updateDynamic("resourceUri")(resourceUri)
    __obj.asInstanceOf[UserDefinedFunctionResource]
  }
}

