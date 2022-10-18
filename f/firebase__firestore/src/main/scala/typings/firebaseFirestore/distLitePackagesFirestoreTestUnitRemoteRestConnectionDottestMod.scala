package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distLitePackagesFirestoreSrcRemoteRestConnectionMod.RestConnection
import typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilTypesMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreTestUnitRemoteRestConnectionDottestMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/remote/rest_connection.test", "TestRestConnection")
  @js.native
  open class TestRestConnection protected () extends RestConnection {
    def this(databaseInfo: DatabaseInfo) = this()
    
    var lastHeaders: StringMap = js.native
    
    var lastRequestBody: Any = js.native
    
    var lastUrl: String = js.native
    
    var nextResponse: js.Promise[Any] = js.native
  }
}
