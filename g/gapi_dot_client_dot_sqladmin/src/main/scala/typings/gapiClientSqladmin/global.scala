package typings.gapiClientSqladmin

import typings.gapiClientSqladmin.gapi.client.sqladmin.BackupRunsResource
import typings.gapiClientSqladmin.gapi.client.sqladmin.DatabasesResource
import typings.gapiClientSqladmin.gapi.client.sqladmin.FlagsResource
import typings.gapiClientSqladmin.gapi.client.sqladmin.InstancesResource
import typings.gapiClientSqladmin.gapi.client.sqladmin.OperationsResource
import typings.gapiClientSqladmin.gapi.client.sqladmin.SslCertsResource
import typings.gapiClientSqladmin.gapi.client.sqladmin.TiersResource
import typings.gapiClientSqladmin.gapi.client.sqladmin.UsersResource
import typings.gapiClientSqladmin.gapiClientSqladminStrings.sqladmin
import typings.gapiClientSqladmin.gapiClientSqladminStrings.v1beta4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
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
    
  }
  
}

