package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarrierRate extends js.Object {
  var carrierName: js.UndefOr[java.lang.String] = js.undefined
  var carrierService: js.UndefOr[java.lang.String] = js.undefined
  var flatAdjustment: js.UndefOr[Price] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var originPostalCode: js.UndefOr[java.lang.String] = js.undefined
  var percentageAdjustment: js.UndefOr[java.lang.String] = js.undefined
}

object CarrierRate {
  @scala.inline
  def apply(
    carrierName: java.lang.String = null,
    carrierService: java.lang.String = null,
    flatAdjustment: Price = null,
    name: java.lang.String = null,
    originPostalCode: java.lang.String = null,
    percentageAdjustment: java.lang.String = null
  ): CarrierRate = {
    val __obj = js.Dynamic.literal()
    if (carrierName != null) __obj.updateDynamic("carrierName")(carrierName)
    if (carrierService != null) __obj.updateDynamic("carrierService")(carrierService)
    if (flatAdjustment != null) __obj.updateDynamic("flatAdjustment")(flatAdjustment)
    if (name != null) __obj.updateDynamic("name")(name)
    if (originPostalCode != null) __obj.updateDynamic("originPostalCode")(originPostalCode)
    if (percentageAdjustment != null) __obj.updateDynamic("percentageAdjustment")(percentageAdjustment)
    __obj.asInstanceOf[CarrierRate]
  }
}

