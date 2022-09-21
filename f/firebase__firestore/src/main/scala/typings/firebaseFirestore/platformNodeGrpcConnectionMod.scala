package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcRemoteConnectionMod.Connection
import typings.firebaseFirestore.srcCoreDatabaseInfoMod.DatabaseInfo
import typings.grpcGrpcJs.makeClientMod.GrpcObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformNodeGrpcConnectionMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/platform/node/grpc_connection", "GrpcConnection")
  @js.native
  open class GrpcConnection protected ()
    extends StObject
       with Connection {
    def this(protos: GrpcObject, databaseInfo: DatabaseInfo) = this()
    
    /* private */ var cachedStub: Any = js.native
    
    /* private */ var databaseInfo: Any = js.native
    
    /* private */ val databasePath: Any = js.native
    
    /* private */ var ensureActiveStub: Any = js.native
    
    /* private */ val firestore: Any = js.native
  }
}
