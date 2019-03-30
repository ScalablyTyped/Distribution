package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameterType extends js.Object {
  var arrayType: js.UndefOr[QueryParameterType] = js.undefined
  var structTypes: js.UndefOr[js.Array[QueryParameterTypeStructTypes]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object QueryParameterType {
  @scala.inline
  def apply(
    arrayType: QueryParameterType = null,
    structTypes: js.Array[QueryParameterTypeStructTypes] = null,
    `type`: java.lang.String = null
  ): QueryParameterType = {
    val __obj = js.Dynamic.literal()
    if (arrayType != null) __obj.updateDynamic("arrayType")(arrayType)
    if (structTypes != null) __obj.updateDynamic("structTypes")(structTypes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryParameterType]
  }
}

