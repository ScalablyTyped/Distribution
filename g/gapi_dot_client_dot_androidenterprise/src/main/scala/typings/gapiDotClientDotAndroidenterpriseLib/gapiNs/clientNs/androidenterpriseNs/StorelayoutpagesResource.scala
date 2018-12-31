package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutpagesResource extends js.Object {
  /** Deletes a store page. */
  def delete(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyPageId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of a store page. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyPageId): gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
  /** Inserts a new store page. */
  def insert(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
  /** Retrieves the details of all pages in the store. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[StoreLayoutPagesListResponse]
  /** Updates the content of a store page. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyPageId): gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
  /** Updates the content of a store page. */
  def update(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyPageId): gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
}

