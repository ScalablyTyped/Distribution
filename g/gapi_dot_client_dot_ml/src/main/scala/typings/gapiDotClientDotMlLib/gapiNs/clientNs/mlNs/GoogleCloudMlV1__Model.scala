package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__Model extends js.Object {
  /**
    * Output only. The default version of the model. This version will be used to
    * handle prediction requests that do not specify a version.
    *
    * You can change the default version by calling
    * [projects.methods.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    */
  var defaultVersion: js.UndefOr[GoogleCloudMlV1__Version] = js.undefined
  /** Optional. The description specified for the model when it was created. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. The name specified for the model when it was created.
    *
    * The model name must be unique within the project it is created in.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. If true, enables StackDriver Logging for online prediction.
    * Default is false.
    */
  var onlinePredictionLogging: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. The list of regions where the model is going to be deployed.
    * Currently only one region per model is supported.
    * Defaults to 'us-central1' if nothing is set.
    * Note:
    * &#42;   No matter where a model is deployed, it can always be accessed by
    * users from anywhere, both for online and batch prediction.
    * &#42;   The region for a batch prediction job is set by the region field when
    * submitting the batch prediction job and does not take its value from
    * this field.
    */
  var regions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

