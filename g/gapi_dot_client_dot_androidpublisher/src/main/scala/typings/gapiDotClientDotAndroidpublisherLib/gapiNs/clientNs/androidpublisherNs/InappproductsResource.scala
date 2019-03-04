package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsResource extends js.Object {
  def batch(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[InappproductsBatchResponse]
  /** Delete an in-app product for an app. */
  def delete(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageName): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns information about the in-app product specified. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageName): gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
  /** Creates a new in-app product for an app. */
  def insert(request: gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPrices): gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
  /** List all the in-app products for an Android app, both subscriptions and managed in-app products.. */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[InappproductsListResponse]
  /** Updates the details of an in-app product. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPricesFields): gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
  /** Updates the details of an in-app product. */
  def update(request: gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPricesFields): gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
}

object InappproductsResource {
  @scala.inline
  def apply(
    batch: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[InappproductsBatchResponse]
    ],
    delete: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageName, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageName, 
      gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
    ],
    insert: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPrices, 
      gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
    ],
    list: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyMaxResults, 
      gapiDotClientLib.gapiNs.clientNs.Request[InappproductsListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPricesFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
    ],
    update: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPricesFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
    ]
  ): InappproductsResource = {
    val __obj = js.Dynamic.literal(batch = batch, delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[InappproductsResource]
  }
}

