package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelDefinitionModelOptions extends js.Object {
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var lossType: js.UndefOr[java.lang.String] = js.undefined
  var modelType: js.UndefOr[java.lang.String] = js.undefined
}

object ModelDefinitionModelOptions {
  @scala.inline
  def apply(
    labels: js.Array[java.lang.String] = null,
    lossType: java.lang.String = null,
    modelType: java.lang.String = null
  ): ModelDefinitionModelOptions = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lossType != null) __obj.updateDynamic("lossType")(lossType)
    if (modelType != null) __obj.updateDynamic("modelType")(modelType)
    __obj.asInstanceOf[ModelDefinitionModelOptions]
  }
}

