package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteConnectionMod.Connection
import typings.grpcGrpcJs.buildSrcMakeClientMod.GrpcObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcPlatformNodeGrpcConnectionMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/platform/node/grpc_connection", "GrpcConnection")
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
    
    @JSName("shouldResourcePathBeIncludedInRequest")
    def shouldResourcePathBeIncludedInRequest_MGrpcConnection: Boolean = js.native
  }
}
