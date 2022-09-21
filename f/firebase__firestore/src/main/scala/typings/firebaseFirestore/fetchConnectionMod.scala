package typings.firebaseFirestore

import typings.firebaseFirestore.anon.FnCall
import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.restConnectionMod.RestConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchConnectionMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/platform/browser_lite/fetch_connection", "FetchConnection")
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
