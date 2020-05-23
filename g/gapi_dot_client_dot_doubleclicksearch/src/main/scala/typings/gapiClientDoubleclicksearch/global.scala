package typings.gapiClientDoubleclicksearch

import typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ConversionResource
import typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ReportsResource
import typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch.SavedColumnsResource
import typings.gapiClientDoubleclicksearch.gapiClientDoubleclicksearchStrings.doubleclicksearch
import typings.gapiClientDoubleclicksearch.gapiClientDoubleclicksearchStrings.v2
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
      val conversion: ConversionResource = js.native
      val reports: ReportsResource = js.native
      val savedColumns: SavedColumnsResource = js.native
      /** Load DoubleClick Search API v2 */
      def load(name: doubleclicksearch, version: v2): js.Thenable[Unit] = js.native
      def load(name: doubleclicksearch, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

