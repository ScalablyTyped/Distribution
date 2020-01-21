package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseIdFields
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseIdFieldsKeyOauthtokenPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutpagesResource extends js.Object {
  /** Deletes a store page. */
  def delete(request: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId): Request_[Unit]
  /** Retrieves details of a store page. */
  def get(request: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId): Request_[StorePage]
  /** Inserts a new store page. */
  def insert(request: AnonAltEnterpriseIdFields): Request_[StorePage]
  /** Retrieves the details of all pages in the store. */
  def list(request: AnonAltEnterpriseIdFields): Request_[StoreLayoutPagesListResponse]
  /** Updates the content of a store page. This method supports patch semantics. */
  def patch(request: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId): Request_[StorePage]
  /** Updates the content of a store page. */
  def update(request: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId): Request_[StorePage]
}

object StorelayoutpagesResource {
  @scala.inline
  def apply(
    delete: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId => Request_[Unit],
    get: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId => Request_[StorePage],
    insert: AnonAltEnterpriseIdFields => Request_[StorePage],
    list: AnonAltEnterpriseIdFields => Request_[StoreLayoutPagesListResponse],
    patch: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId => Request_[StorePage],
    update: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId => Request_[StorePage]
  ): StorelayoutpagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StorelayoutpagesResource]
  }
}

