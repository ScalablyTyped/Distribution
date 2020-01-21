package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  /** A list of location ID sets. Must be non-empty. Can only be set if all other fields are not set. */
  var locations: js.UndefOr[js.Array[LocationIdSet]] = js.undefined
  /**
    * A list of inclusive number of items upper bounds. The last value can be "infinity". For example ["10", "50", "infinity"] represents the headers "<= 10
    * items", " 50 items". Must be non-empty. Can only be set if all other fields are not set.
    */
  var numberOfItems: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of postal group names. The last value can be "all other locations". Example: ["zone 1", "zone 2", "all other locations"]. The referred postal
    * code groups must match the delivery country of the service. Must be non-empty. Can only be set if all other fields are not set.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * be "infinity". For example [{"value": "10", "currency": "USD"}, {"value": "500", "currency": "USD"}, {"value": "infinity", "currency": "USD"}]
    * represents the headers "<= $10", " $500". All prices within a service must have the same currency. Must be non-empty. Can only be set if all other
    * fields are not set.
    */
  var prices: js.UndefOr[js.Array[Price]] = js.undefined
  /**
    * be "infinity". For example [{"value": "10", "unit": "kg"}, {"value": "50", "unit": "kg"}, {"value": "infinity", "unit": "kg"}] represents the headers
    * "<= 10kg", " 50kg". All weights within a service must have the same unit. Must be non-empty. Can only be set if all other fields are not set.
    */
  var weights: js.UndefOr[js.Array[Weight]] = js.undefined
}

object Headers {
  @scala.inline
  def apply(
    locations: js.Array[LocationIdSet] = null,
    numberOfItems: js.Array[String] = null,
    postalCodeGroupNames: js.Array[String] = null,
    prices: js.Array[Price] = null,
    weights: js.Array[Weight] = null
  ): Headers = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (numberOfItems != null) __obj.updateDynamic("numberOfItems")(numberOfItems.asInstanceOf[js.Any])
    if (postalCodeGroupNames != null) __obj.updateDynamic("postalCodeGroupNames")(postalCodeGroupNames.asInstanceOf[js.Any])
    if (prices != null) __obj.updateDynamic("prices")(prices.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

