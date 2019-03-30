package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameterTypeStructTypes extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[QueryParameterType] = js.undefined
}

object QueryParameterTypeStructTypes {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    name: java.lang.String = null,
    `type`: QueryParameterType = null
  ): QueryParameterTypeStructTypes = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryParameterTypeStructTypes]
  }
}

