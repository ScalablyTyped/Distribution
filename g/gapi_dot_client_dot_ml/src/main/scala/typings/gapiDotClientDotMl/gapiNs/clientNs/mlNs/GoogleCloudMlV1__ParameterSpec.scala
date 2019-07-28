package typings.gapiDotClientDotMl.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__ParameterSpec extends js.Object {
  /** Required if type is `CATEGORICAL`. The list of possible categories. */
  var categoricalValues: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Required if type is `DISCRETE`.
    * A list of feasible points.
    * The list should be in strictly increasing order. For instance, this
    * parameter might have possible settings of 1.5, 2.5, and 4.0. This list
    * should not contain more than 1,000 values.
    */
  var discreteValues: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Required if typeis `DOUBLE` or `INTEGER`. This field
    * should be unset if type is `CATEGORICAL`. This value should be integers if
    * type is `INTEGER`.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * Required if type is `DOUBLE` or `INTEGER`. This field
    * should be unset if type is `CATEGORICAL`. This value should be integers if
    * type is INTEGER.
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * Required. The parameter name must be unique amongst all ParameterConfigs in
    * a HyperparameterSpec message. E.g., "learning_rate".
    */
  var parameterName: js.UndefOr[String] = js.undefined
  /**
    * Optional. How the parameter should be scaled to the hypercube.
    * Leave unset for categorical parameters.
    * Some kind of scaling is strongly recommended for real or integral
    * parameters (e.g., `UNIT_LINEAR_SCALE`).
    */
  var scaleType: js.UndefOr[String] = js.undefined
  /** Required. The type of the parameter. */
  var `type`: js.UndefOr[String] = js.undefined
}

object GoogleCloudMlV1__ParameterSpec {
  @scala.inline
  def apply(
    categoricalValues: js.Array[String] = null,
    discreteValues: js.Array[Double] = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    parameterName: String = null,
    scaleType: String = null,
    `type`: String = null
  ): GoogleCloudMlV1__ParameterSpec = {
    val __obj = js.Dynamic.literal()
    if (categoricalValues != null) __obj.updateDynamic("categoricalValues")(categoricalValues)
    if (discreteValues != null) __obj.updateDynamic("discreteValues")(discreteValues)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName)
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GoogleCloudMlV1__ParameterSpec]
  }
}

