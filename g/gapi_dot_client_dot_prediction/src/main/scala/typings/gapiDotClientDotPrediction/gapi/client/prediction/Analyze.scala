package typings.gapiDotClientDotPrediction.gapi.client.prediction

import typings.gapiDotClientDotPrediction.Anon_ConfusionMatrix
import typings.gapiDotClientDotPrediction.Anon_Features
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyze extends js.Object {
  /** Description of the data the model was trained on. */
  var dataDescription: js.UndefOr[Anon_Features] = js.undefined
  /** List of errors with the data. */
  var errors: js.UndefOr[js.Array[Record[String, String]]] = js.undefined
  /** The unique name for the predictive model. */
  var id: js.UndefOr[String] = js.undefined
  /** What kind of resource this is. */
  var kind: js.UndefOr[String] = js.undefined
  /** Description of the model. */
  var modelDescription: js.UndefOr[Anon_ConfusionMatrix] = js.undefined
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object Analyze {
  @scala.inline
  def apply(
    dataDescription: Anon_Features = null,
    errors: js.Array[Record[String, String]] = null,
    id: String = null,
    kind: String = null,
    modelDescription: Anon_ConfusionMatrix = null,
    selfLink: String = null
  ): Analyze = {
    val __obj = js.Dynamic.literal()
    if (dataDescription != null) __obj.updateDynamic("dataDescription")(dataDescription)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (modelDescription != null) __obj.updateDynamic("modelDescription")(modelDescription)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[Analyze]
  }
}

