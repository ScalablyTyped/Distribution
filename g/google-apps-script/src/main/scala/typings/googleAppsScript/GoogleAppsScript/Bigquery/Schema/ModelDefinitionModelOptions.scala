package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

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
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lossType != null) __obj.updateDynamic("lossType")(lossType.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelDefinitionModelOptions]
  }
}

