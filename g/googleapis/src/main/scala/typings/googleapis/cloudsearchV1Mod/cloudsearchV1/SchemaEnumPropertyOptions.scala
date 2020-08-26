package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for enum properties, which allow you to define a restricted set of
  * strings to match user queries, set rankings for those string values, and
  * define an operator name to be paired with those strings so that users can
  * narrow results to only items with a specific value. For example, for items
  * in a request tracking system with priority information, you could define
  * *p0* as an allowable enum value and tie this enum to the operator name
  * *priority* so that search users could add *priority:p0* to their query to
  * restrict the set of results to only those items indexed with the value
  * *p0*.
  */
@js.native
trait SchemaEnumPropertyOptions extends js.Object {
  /**
    * If set, describes how the enum should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaEnumOperatorOptions] = js.native
  /**
    * Used to specify the ordered ranking for the enumeration that determines
    * how the integer values provided in the possible EnumValuePairs are used
    * to rank results. If specified, integer values must be provided for all
    * possible EnumValuePair values given for this property. Can only be used
    * if isRepeatable is false.
    */
  var orderedRanking: js.UndefOr[String] = js.native
  /**
    * The list of possible values for the enumeration property. All
    * EnumValuePairs must provide a string value. If you specify an integer
    * value for one EnumValuePair, then all possible EnumValuePairs must
    * provide an integer value. Both the string value and integer value must be
    * unique over all possible values. Once set, possible values cannot be
    * removed or modified. If you supply an ordered ranking and think you might
    * insert additional enum values in the future, leave gaps in the initial
    * integer values to allow adding a value in between previously registered
    * values. The maximum number of elements is 100.
    */
  var possibleValues: js.UndefOr[js.Array[SchemaEnumValuePair]] = js.native
}

object SchemaEnumPropertyOptions {
  @scala.inline
  def apply(): SchemaEnumPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnumPropertyOptions]
  }
  @scala.inline
  implicit class SchemaEnumPropertyOptionsOps[Self <: SchemaEnumPropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperatorOptions(value: SchemaEnumOperatorOptions): Self = this.set("operatorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatorOptions: Self = this.set("operatorOptions", js.undefined)
    @scala.inline
    def setOrderedRanking(value: String): Self = this.set("orderedRanking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderedRanking: Self = this.set("orderedRanking", js.undefined)
    @scala.inline
    def setPossibleValuesVarargs(value: SchemaEnumValuePair*): Self = this.set("possibleValues", js.Array(value :_*))
    @scala.inline
    def setPossibleValues(value: js.Array[SchemaEnumValuePair]): Self = this.set("possibleValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePossibleValues: Self = this.set("possibleValues", js.undefined)
  }
  
}

