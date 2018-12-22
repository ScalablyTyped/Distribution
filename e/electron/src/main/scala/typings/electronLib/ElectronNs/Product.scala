package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Product extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/product
  /**
       * The total size of the content, in bytes.
       */
  var contentLengths: js.Array[scala.Double]
  /**
       * A string that identifies the version of the content.
       */
  var contentVersion: java.lang.String
  /**
       * A Boolean value that indicates whether the App Store has downloadable content
       * for this product.
       */
  var downloadable: scala.Boolean
  /**
       * The locale formatted price of the product.
       */
  var formattedPrice: java.lang.String
  /**
       * A description of the product.
       */
  var localizedDescription: java.lang.String
  /**
       * The name of the product.
       */
  var localizedTitle: java.lang.String
  /**
       * The cost of the product in the local currency.
       */
  var price: scala.Double
  /**
       * The string that identifies the product to the Apple App Store.
       */
  var productIdentifier: java.lang.String
}

