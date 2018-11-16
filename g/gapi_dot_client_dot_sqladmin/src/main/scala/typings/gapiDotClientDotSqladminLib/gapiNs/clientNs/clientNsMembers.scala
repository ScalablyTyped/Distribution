package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val backupRuns: gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs.BackupRunsResource = js.native
  val databases: gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs.DatabasesResource = js.native
  val flags: gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs.FlagsResource = js.native
  val instances: gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs.InstancesResource = js.native
  val operations: gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs.OperationsResource = js.native
  val sslCerts: gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs.SslCertsResource = js.native
  val tiers: gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs.TiersResource = js.native
  val users: gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs.UsersResource = js.native
  /** Load Cloud SQL Administration API v1beta4 */
  def load(
    name: gapiDotClientDotSqladminLib.gapiDotClientDotSqladminLibStrings.sqladmin,
    version: gapiDotClientDotSqladminLib.gapiDotClientDotSqladminLibStrings.v1beta4
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotSqladminLib.gapiDotClientDotSqladminLibStrings.sqladmin,
    version: gapiDotClientDotSqladminLib.gapiDotClientDotSqladminLibStrings.v1beta4,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

