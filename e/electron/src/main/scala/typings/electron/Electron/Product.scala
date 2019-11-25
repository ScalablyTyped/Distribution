package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/product
  /**
    * The total size of the content, in bytes.
    */
  var contentLengths: js.Array[Double]
  /**
    * A string that identifies the version of the content.
    */
  var contentVersion: String
  /**
    * The locale formatted price of the product.
    */
  var formattedPrice: String
  /**
    * A Boolean value that indicates whether the App Store has downloadable content
    * for this product. true if at least one file has been associated with the
    * product.
    */
  var isDownloadable: Boolean
  /**
    * A description of the product.
    */
  var localizedDescription: String
  /**
    * The name of the product.
    */
  var localizedTitle: String
  /**
    * The cost of the product in the local currency.
    */
  var price: Double
  /**
    * The string that identifies the product to the Apple App Store.
    */
  var productIdentifier: String
}

object Product {
  @scala.inline
  def apply(
    contentLengths: js.Array[Double],
    contentVersion: String,
    formattedPrice: String,
    isDownloadable: Boolean,
    localizedDescription: String,
    localizedTitle: String,
    price: Double,
    productIdentifier: String
  ): Product = {
    val __obj = js.Dynamic.literal(contentLengths = contentLengths.asInstanceOf[js.Any], contentVersion = contentVersion.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], isDownloadable = isDownloadable.asInstanceOf[js.Any], localizedDescription = localizedDescription.asInstanceOf[js.Any], localizedTitle = localizedTitle.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productIdentifier = productIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Product]
  }
}

