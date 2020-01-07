package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about operation (or operation stage) progress.
  */
@js.native
trait Schema$OperationProgress extends js.Object {
  /**
    * Progress metric bundle, for example:   metrics: [{name: &quot;nodes
    * done&quot;,     int_value: 15},             {name: &quot;nodes
    * total&quot;,    int_value: 32}] or   metrics: [{name:
    * &quot;progress&quot;,       double_value: 0.56},             {name:
    * &quot;progress scale&quot;, double_value: 1.0}]
    */
  var metrics: js.UndefOr[js.Array[Schema$Metric]] = js.native
  /**
    * A non-parameterized string describing an operation stage. Unset for
    * single-stage operations.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Substages of an operation or a stage.
    */
  var stages: js.UndefOr[js.Array[Schema$OperationProgress]] = js.native
  /**
    * Status of an operation stage. Unset for single-stage operations.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$OperationProgress {
  @scala.inline
  def apply(
    metrics: js.Array[Schema$Metric] = null,
    name: String = null,
    stages: js.Array[Schema$OperationProgress] = null,
    status: String = null
  ): Schema$OperationProgress = {
    val __obj = js.Dynamic.literal()
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stages != null) __obj.updateDynamic("stages")(stages.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationProgress]
  }
}

