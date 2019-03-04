package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Checks the purchase and consumption status of an inapp item. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ProductPurchase]
}

object ProductsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[ProductPurchase]
    ]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[ProductsResource]
  }
}

