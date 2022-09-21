package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.firestoreSrcRemoteRestConnectionMod.RestConnection
import typings.firebaseFirestore.packagesFirestoreSrcUtilTypesMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteRestConnectionDottestMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/remote/rest_connection.test", "TestRestConnection")
  @js.native
  open class TestRestConnection protected () extends RestConnection {
    def this(databaseInfo: DatabaseInfo) = this()
    
    var lastHeaders: StringMap = js.native
    
    var lastRequestBody: Any = js.native
    
    var lastUrl: String = js.native
    
    var nextResponse: js.Promise[Any] = js.native
  }
}
