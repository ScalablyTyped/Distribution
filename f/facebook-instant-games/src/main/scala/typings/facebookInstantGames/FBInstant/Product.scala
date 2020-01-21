package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a game's product information.
  */
trait Product extends js.Object {
  /**
    * The product description
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A link to the product's associated image
    */
  var imageURI: js.UndefOr[String] = js.undefined
  /**
    * The price of the product
    */
  var price: String
  /**
    * The currency code for the product
    */
  var priceCurrencyCode: String
  /**
    * The product's game-specified identifier
    */
  var productID: String
  /**
    * The title of the product
    */
  var title: String
}

object Product {
  @scala.inline
  def apply(
    price: String,
    priceCurrencyCode: String,
    productID: String,
    title: String,
    description: String = null,
    imageURI: String = null
  ): Product = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], priceCurrencyCode = priceCurrencyCode.asInstanceOf[js.Any], productID = productID.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (imageURI != null) __obj.updateDynamic("imageURI")(imageURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

