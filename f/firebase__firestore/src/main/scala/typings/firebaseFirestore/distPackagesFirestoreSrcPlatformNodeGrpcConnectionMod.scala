package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteConnectionMod.Connection
import typings.grpcGrpcJs.buildSrcMakeClientMod.GrpcObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcPlatformNodeGrpcConnectionMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/platform/node/grpc_connection", "GrpcConnection")
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
