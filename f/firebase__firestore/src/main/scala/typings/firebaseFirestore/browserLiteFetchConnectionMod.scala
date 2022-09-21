package typings.firebaseFirestore

import typings.firebaseFirestore.anon.FnCall
import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.remoteRestConnectionMod.RestConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserLiteFetchConnectionMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/platform/browser_lite/fetch_connection", "FetchConnection")
  @js.native
  open class FetchConnection protected () extends RestConnection {
    /**
      * @param databaseInfo - The connection info.
      * @param fetchImpl - `fetch` or a Polyfill that implements the fetch API.
      */
    def this(databaseInfo: DatabaseInfo, fetchImpl: FnCall) = this()
    
    /* private */ val fetchImpl: Any = js.native
  }
}
