package typings.gapiDotClientDotSqladmin.gapiNs.clientNs

import typings.gapiDotClientDotSqladmin.gapiDotClientDotSqladminStrings.sqladmin
import typings.gapiDotClientDotSqladmin.gapiDotClientDotSqladminStrings.v1beta4
import typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs.BackupRunsResource
import typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs.DatabasesResource
import typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs.FlagsResource
import typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs.InstancesResource
import typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs.OperationsResource
import typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs.SslCertsResource
import typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs.TiersResource
import typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs.UsersResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val backupRuns: BackupRunsResource = js.native
  val databases: DatabasesResource = js.native
  val flags: FlagsResource = js.native
  val instances: InstancesResource = js.native
  val operations: OperationsResource = js.native
  val sslCerts: SslCertsResource = js.native
  val tiers: TiersResource = js.native
  val users: UsersResource = js.native
  /** Load Cloud SQL Administration API v1beta4 */
  def load(name: sqladmin, version: v1beta4): js.Thenable[Unit] = js.native
  def load(name: sqladmin, version: v1beta4, callback: js.Function0[_]): Unit = js.native
}

