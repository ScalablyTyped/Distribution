package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelDefinitionModelOptions extends js.Object {
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  var lossType: js.UndefOr[String] = js.undefined
  var modelType: js.UndefOr[String] = js.undefined
}

object ModelDefinitionModelOptions {
  @scala.inline
  def apply(labels: js.Array[String] = null, lossType: String = null, modelType: String = null): ModelDefinitionModelOptions = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lossType != null) __obj.updateDynamic("lossType")(lossType)
    if (modelType != null) __obj.updateDynamic("modelType")(modelType)
    __obj.asInstanceOf[ModelDefinitionModelOptions]
  }
}

