package typings.gapiClientCivicinfo

import typings.gapiClientCivicinfo.gapi.client.civicinfo.DivisionsResource
import typings.gapiClientCivicinfo.gapi.client.civicinfo.ElectionsResource
import typings.gapiClientCivicinfo.gapi.client.civicinfo.RepresentativesResource
import typings.gapiClientCivicinfo.gapiClientCivicinfoStrings.civicinfo
import typings.gapiClientCivicinfo.gapiClientCivicinfoStrings.v2
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
      val divisions: DivisionsResource = js.native
      val elections: ElectionsResource = js.native
      val representatives: RepresentativesResource = js.native
      /** Load Google Civic Information API v2 */
      def load(name: civicinfo, version: v2): js.Thenable[Unit] = js.native
      def load(name: civicinfo, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

