package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAltFieldsKeyOauthtokenPackageNamePrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Checks the purchase and consumption status of an inapp item. */
  def get(request: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrint): Request_[ProductPurchase]
}

object ProductsResource {
  @scala.inline
  def apply(get: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrint => Request_[ProductPurchase]): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ProductsResource]
  }
}

