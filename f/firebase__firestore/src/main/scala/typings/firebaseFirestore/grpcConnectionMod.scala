package typings.firebaseFirestore

import typings.firebaseFirestore.connectionMod.Connection
import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.grpc.mod.GrpcObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/platform_node/grpc_connection", JSImport.Namespace)
@js.native
object grpcConnectionMod extends js.Object {
  @js.native
  class GrpcConnection protected () extends Connection {
    def this(protos: GrpcObject, databaseInfo: DatabaseInfo) = this()
    var cachedStub: js.Any = js.native
    var databaseInfo: js.Any = js.native
    var ensureActiveStub: js.Any = js.native
    var firestore: js.Any = js.native
  }
  
}

