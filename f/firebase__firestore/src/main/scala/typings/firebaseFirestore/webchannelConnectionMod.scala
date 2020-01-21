package typings.firebaseFirestore

import typings.firebaseFirestore.connectionMod.Connection
import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/platform_browser/webchannel_connection", JSImport.Namespace)
@js.native
object webchannelConnectionMod extends js.Object {
  @js.native
  class WebChannelConnection protected () extends Connection {
    def this(info: DatabaseInfo) = this()
    val baseUrl: js.Any = js.native
    val databaseId: js.Any = js.native
    val forceLongPolling: js.Any = js.native
    /**
      * Modifies the headers for a request, adding any authorization token if
      * present and any additional headers for the request.
      */
    var modifyHeadersForRequest: js.Any = js.native
    def makeUrl(rpcName: String): String = js.native
  }
  
}

