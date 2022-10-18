package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distFirestoreSrcRemoteRestConnectionMod.RestConnection
import typings.firebaseFirestore.distFirestoreSrcUtilTypesMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestUnitRemoteRestConnectionDottestMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/remote/rest_connection.test", "TestRestConnection")
  @js.native
  open class TestRestConnection protected () extends RestConnection {
    def this(databaseInfo: DatabaseInfo) = this()
    
    var lastHeaders: StringMap = js.native
    
    var lastRequestBody: Any = js.native
    
    var lastUrl: String = js.native
    
    var nextResponse: js.Promise[Any] = js.native
  }
}
