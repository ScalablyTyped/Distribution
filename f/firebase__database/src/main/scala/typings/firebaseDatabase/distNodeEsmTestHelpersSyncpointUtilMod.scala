package typings.firebaseDatabase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseDatabase.distNodeEsmSrcCoreSyncTreeMod.ListenProvider
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmTestHelpersSyncpointUtilMod {
  
  @JSImport("@firebase/database/dist/node-esm/test/helpers/syncpoint-util", "SyncPointTestParser")
  @js.native
  open class SyncPointTestParser () extends StObject {
    
    var app: FirebaseApp = js.native
    
    def defineTest(spec: Any): Unit = js.native
    
    def getTestPath(optBasePath: String): Path = js.native
    def getTestPath(optBasePath: String, path: String): Path = js.native
    def getTestPath(optBasePath: js.Array[String]): Path = js.native
    def getTestPath(optBasePath: js.Array[String], path: String): Path = js.native
    
    var listenProvider_ : ListenProvider = js.native
    
    var listens_ : Any = js.native
    
    /* private */ var syncTree_ : Any = js.native
    
    /* private */ var testRunner: Any = js.native
  }
}
