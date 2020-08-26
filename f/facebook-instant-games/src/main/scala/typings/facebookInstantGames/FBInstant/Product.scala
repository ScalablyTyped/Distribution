package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a game's product information.
  */
@js.native
trait Product extends js.Object {
  /**
    * The product description
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A link to the product's associated image
    */
  var imageURI: js.UndefOr[String] = js.native
  /**
    * The price of the product
    */
  var price: String = js.native
  /**
    * The currency code for the product
    */
  var priceCurrencyCode: String = js.native
  /**
    * The product's game-specified identifier
    */
  var productID: String = js.native
  /**
    * The title of the product
    */
  var title: String = js.native
}

object Product {
  @scala.inline
  def apply(price: String, priceCurrencyCode: String, productID: String, title: String): Product = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], priceCurrencyCode = priceCurrencyCode.asInstanceOf[js.Any], productID = productID.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
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
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriceCurrencyCode(value: String): Self = this.set("priceCurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductID(value: String): Self = this.set("productID", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setImageURI(value: String): Self = this.set("imageURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageURI: Self = this.set("imageURI", js.undefined)
  }
  
}

