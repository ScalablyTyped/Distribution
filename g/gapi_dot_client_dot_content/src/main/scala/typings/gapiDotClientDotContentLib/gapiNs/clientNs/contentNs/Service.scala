package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Service extends js.Object {
  /** A boolean exposing the active status of the shipping service. Required. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** The CLDR code of the currency to which this service applies. Must match that of the prices in rate groups. */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /** The CLDR territory code of the country to which the service applies. Required. */
  var deliveryCountry: js.UndefOr[java.lang.String] = js.undefined
  /** Time spent in various aspects from order to the delivery of the product. Required. */
  var deliveryTime: js.UndefOr[DeliveryTime] = js.undefined
  /**
               * Minimum order value for this service. If set, indicates that customers will have to spend at least this amount. All prices within a service must have
               * the same currency.
               */
  var minimumOrderValue: js.UndefOr[Price] = js.undefined
  /** Free-form name of the service. Must be unique within target account. Required. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Shipping rate group definitions. Only the last one is allowed to have an empty applicableShippingLabels, which means "everything else". The other
               * applicableShippingLabels must not overlap.
               */
  var rateGroups: js.UndefOr[js.Array[RateGroup]] = js.undefined
}

