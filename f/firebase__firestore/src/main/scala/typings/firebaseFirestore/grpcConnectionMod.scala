package typings.firebaseFirestore

import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.remoteConnectionMod.Connection
import typings.grpcGrpcJs.makeClientMod.GrpcObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grpcConnectionMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/platform/node/grpc_connection", "GrpcConnection")
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
