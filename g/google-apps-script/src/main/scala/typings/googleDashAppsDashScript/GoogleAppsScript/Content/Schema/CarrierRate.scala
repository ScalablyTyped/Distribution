package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarrierRate extends js.Object {
  var carrierName: js.UndefOr[String] = js.undefined
  var carrierService: js.UndefOr[String] = js.undefined
  var flatAdjustment: js.UndefOr[Price] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var originPostalCode: js.UndefOr[String] = js.undefined
  var percentageAdjustment: js.UndefOr[String] = js.undefined
}

object CarrierRate {
  @scala.inline
  def apply(
    carrierName: String = null,
    carrierService: String = null,
    flatAdjustment: Price = null,
    name: String = null,
    originPostalCode: String = null,
    percentageAdjustment: String = null
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

