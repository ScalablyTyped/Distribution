package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StorelayoutclustersResource extends js.Object {
  /** Deletes a cluster. */
  def delete(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyPageIdUserIp): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of a cluster. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyPageIdUserIp): gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
  /** Inserts a new cluster in a page. */
  def insert(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyPageId): gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
  /** Retrieves the details of all clusters on the specified page. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyPageId): gapiDotClientLib.gapiNs.clientNs.Request[StoreLayoutClustersListResponse]
  /** Updates a cluster. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyPageIdUserIp): gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
  /** Updates a cluster. */
  def update(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKeyPageIdUserIp): gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
}

