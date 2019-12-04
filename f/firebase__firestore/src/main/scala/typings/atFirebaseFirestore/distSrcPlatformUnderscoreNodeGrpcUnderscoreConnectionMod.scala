package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseInfo
import typings.atFirebaseFirestore.distSrcRemoteConnectionMod.Connection
import typings.grpc.grpcMod.GrpcObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_node/grpc_connection", JSImport.Namespace)
@js.native
object distSrcPlatformUnderscoreNodeGrpcUnderscoreConnectionMod extends js.Object {
  @js.native
  class GrpcConnection protected () extends Connection {
    def this(protos: GrpcObject, databaseInfo: DatabaseInfo) = this()
    var cachedStub: js.Any = js.native
    var databaseInfo: js.Any = js.native
    var ensureActiveStub: js.Any = js.native
    var firestore: js.Any = js.native
  }
  
}

