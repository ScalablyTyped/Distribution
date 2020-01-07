package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of a operator that can be used in a Search/Suggest request.
  */
@js.native
trait Schema$QueryOperator extends js.Object {
  /**
    * Display name of the operator
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Potential list of values for the opeatror field. This field is only
    * filled when we can safely enumerate all the possible values of this
    * operator.
    */
  var enumValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates the operator name that can be used to  isolate the property
    * using the greater-than operator.
    */
  var greaterThanOperatorName: js.UndefOr[String] = js.native
  /**
    * Can this operator be used to get facets.
    */
  var isFacetable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if multiple values can be set for this property.
    */
  var isRepeatable: js.UndefOr[Boolean] = js.native
  /**
    * Will the property associated with this facet be returned as part of
    * search results.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  /**
    * Can this operator be used to sort results.
    */
  var isSortable: js.UndefOr[Boolean] = js.native
  /**
    * Can get suggestions for this field.
    */
  var isSuggestable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the operator name that can be used to  isolate the property
    * using the less-than operator.
    */
  var lessThanOperatorName: js.UndefOr[String] = js.native
  /**
    * The name of the operator.
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * Type of the operator.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$QueryOperator {
  @scala.inline
  def apply(
    displayName: String = null,
    enumValues: js.Array[String] = null,
    greaterThanOperatorName: String = null,
    isFacetable: js.UndefOr[Boolean] = js.undefined,
    isRepeatable: js.UndefOr[Boolean] = js.undefined,
    isReturnable: js.UndefOr[Boolean] = js.undefined,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    isSuggestable: js.UndefOr[Boolean] = js.undefined,
    lessThanOperatorName: String = null,
    operatorName: String = null,
    `type`: String = null
  ): Schema$QueryOperator = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (enumValues != null) __obj.updateDynamic("enumValues")(enumValues.asInstanceOf[js.Any])
    if (greaterThanOperatorName != null) __obj.updateDynamic("greaterThanOperatorName")(greaterThanOperatorName.asInstanceOf[js.Any])
    if (!js.isUndefined(isFacetable)) __obj.updateDynamic("isFacetable")(isFacetable.asInstanceOf[js.Any])
    if (!js.isUndefined(isRepeatable)) __obj.updateDynamic("isRepeatable")(isRepeatable.asInstanceOf[js.Any])
    if (!js.isUndefined(isReturnable)) __obj.updateDynamic("isReturnable")(isReturnable.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.asInstanceOf[js.Any])
    if (!js.isUndefined(isSuggestable)) __obj.updateDynamic("isSuggestable")(isSuggestable.asInstanceOf[js.Any])
    if (lessThanOperatorName != null) __obj.updateDynamic("lessThanOperatorName")(lessThanOperatorName.asInstanceOf[js.Any])
    if (operatorName != null) __obj.updateDynamic("operatorName")(operatorName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryOperator]
  }
}

