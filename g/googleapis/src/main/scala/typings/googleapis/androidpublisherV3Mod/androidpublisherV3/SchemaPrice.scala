package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPrice extends js.Object {
  /**
    * 3 letter Currency code, as defined by ISO 4217.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The price in millionths of the currency base unit represented as a
    * string.
    */
  var priceMicros: js.UndefOr[String] = js.native
}

object SchemaPrice {
  @scala.inline
  def apply(): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrice]
  }
  @scala.inline
  implicit class SchemaPriceOps[Self <: SchemaPrice] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setPriceMicros(value: String): Self = this.set("priceMicros", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriceMicros: Self = this.set("priceMicros", js.undefined)
  }
  
}

