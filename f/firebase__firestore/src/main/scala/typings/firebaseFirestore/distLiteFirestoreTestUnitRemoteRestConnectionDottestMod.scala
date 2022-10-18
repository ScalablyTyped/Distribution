package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteRestConnectionMod.RestConnection
import typings.firebaseFirestore.distLiteFirestoreSrcUtilTypesMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreTestUnitRemoteRestConnectionDottestMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/remote/rest_connection.test", "TestRestConnection")
  @js.native
  open class TestRestConnection protected () extends RestConnection {
    def this(databaseInfo: DatabaseInfo) = this()
    
    var lastHeaders: StringMap = js.native
    
    var lastRequestBody: Any = js.native
    
    var lastUrl: String = js.native
    
    var nextResponse: js.Promise[Any] = js.native
  }
}
