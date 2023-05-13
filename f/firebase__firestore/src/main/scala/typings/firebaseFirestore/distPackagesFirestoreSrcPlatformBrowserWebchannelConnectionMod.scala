package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteRestConnectionMod.RestConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcPlatformBrowserWebchannelConnectionMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/platform/browser/webchannel_connection", "WebChannelConnection")
  @js.native
  open class WebChannelConnection protected () extends RestConnection {
    def this(info: DatabaseInfo) = this()
    
    /* private */ val autoDetectLongPolling: Any = js.native
    
    /* private */ val forceLongPolling: Any = js.native
    
    /* private */ val longPollingOptions: Any = js.native
    
    /* private */ val useFetchStreams: Any = js.native
  }
}
