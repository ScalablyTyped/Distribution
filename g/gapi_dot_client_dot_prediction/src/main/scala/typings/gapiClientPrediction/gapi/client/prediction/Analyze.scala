package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClientPrediction.anon.ConfusionMatrix
import typings.gapiClientPrediction.anon.Features
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyze extends js.Object {
  /** Description of the data the model was trained on. */
  var dataDescription: js.UndefOr[Features] = js.undefined
  /** List of errors with the data. */
  var errors: js.UndefOr[js.Array[Record[String, String]]] = js.undefined
  /** The unique name for the predictive model. */
  var id: js.UndefOr[String] = js.undefined
  /** What kind of resource this is. */
  var kind: js.UndefOr[String] = js.undefined
  /** Description of the model. */
  var modelDescription: js.UndefOr[ConfusionMatrix] = js.undefined
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object Analyze {
  @scala.inline
  def apply(
    dataDescription: Features = null,
    errors: js.Array[Record[String, String]] = null,
    id: String = null,
    kind: String = null,
    modelDescription: ConfusionMatrix = null,
    selfLink: String = null
  ): Analyze = {
    val __obj = js.Dynamic.literal()
    if (dataDescription != null) __obj.updateDynamic("dataDescription")(dataDescription.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (modelDescription != null) __obj.updateDynamic("modelDescription")(modelDescription.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analyze]
  }
}

