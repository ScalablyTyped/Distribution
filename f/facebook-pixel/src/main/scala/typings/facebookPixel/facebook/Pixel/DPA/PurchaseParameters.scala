package typings.facebookPixel.facebook.Pixel.DPA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseParameters
  extends typings.facebookPixel.facebook.Pixel.PurchaseParameters

object PurchaseParameters {
  @scala.inline
  def apply(currency: String, value: Double): PurchaseParameters = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseParameters]
  }
}

