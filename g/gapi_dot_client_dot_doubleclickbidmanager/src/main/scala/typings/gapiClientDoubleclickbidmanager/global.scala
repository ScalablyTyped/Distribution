package typings.gapiClientDoubleclickbidmanager

import typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.LineitemsResource
import typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.QueriesResource
import typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.ReportsResource
import typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.SdfResource
import typings.gapiClientDoubleclickbidmanager.gapiClientDoubleclickbidmanagerStrings.doubleclickbidmanager
import typings.gapiClientDoubleclickbidmanager.gapiClientDoubleclickbidmanagerStrings.v1
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
      val lineitems: LineitemsResource = js.native
      val queries: QueriesResource = js.native
      val reports: ReportsResource = js.native
      val sdf: SdfResource = js.native
      /** Load DoubleClick Bid Manager API v1 */
      def load(name: doubleclickbidmanager, version: v1): js.Thenable[Unit] = js.native
      def load(name: doubleclickbidmanager, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

