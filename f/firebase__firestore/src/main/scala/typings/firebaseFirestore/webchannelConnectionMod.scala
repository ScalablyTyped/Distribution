package typings.firebaseFirestore

import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.restConnectionMod.RestConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webchannelConnectionMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/platform/browser/webchannel_connection", "WebChannelConnection")
  @js.native
  open class WebChannelConnection protected () extends RestConnection {
    def this(info: DatabaseInfo) = this()
    
    /* private */ val autoDetectLongPolling: Any = js.native
    
    /* private */ val forceLongPolling: Any = js.native
    
    /* private */ val useFetchStreams: Any = js.native
  }
}
