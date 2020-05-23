package typings.gapiClientQpxexpress

import typings.gapiClientQpxexpress.gapi.client.qpxexpress.TripsResource
import typings.gapiClientQpxexpress.gapiClientQpxexpressStrings.qpxexpress
import typings.gapiClientQpxexpress.gapiClientQpxexpressStrings.v1
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
      val trips: TripsResource = js.native
      /** Load QPX Express API v1 */
      def load(name: qpxexpress, version: v1): js.Thenable[Unit] = js.native
      def load(name: qpxexpress, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

