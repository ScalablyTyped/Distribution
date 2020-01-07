package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for integer properties.
  */
@js.native
trait Schema$IntegerPropertyOptions extends js.Object {
  /**
    * The maximum value of the property. The minimum and maximum values for the
    * property are used to rank results according to the ordered ranking.
    * Indexing requests with values greater than the maximum are accepted and
    * ranked with the same weight as items indexed with the maximum value.
    */
  var maximumValue: js.UndefOr[String] = js.native
  /**
    * The minimum value of the property. The minimum and maximum values for the
    * property are used to rank results according to the ordered ranking.
    * Indexing requests with values less than the minimum are accepted and
    * ranked with the same weight as items indexed with the minimum value.
    */
  var minimumValue: js.UndefOr[String] = js.native
  /**
    * If set, describes how the integer should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[Schema$IntegerOperatorOptions] = js.native
  /**
    * Used to specify the ordered ranking for the integer. Can only be used if
    * isRepeatable is false.
    */
  var orderedRanking: js.UndefOr[String] = js.native
}

object Schema$IntegerPropertyOptions {
  @scala.inline
  def apply(
    maximumValue: String = null,
    minimumValue: String = null,
    operatorOptions: Schema$IntegerOperatorOptions = null,
    orderedRanking: String = null
  ): Schema$IntegerPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    if (orderedRanking != null) __obj.updateDynamic("orderedRanking")(orderedRanking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IntegerPropertyOptions]
  }
}

