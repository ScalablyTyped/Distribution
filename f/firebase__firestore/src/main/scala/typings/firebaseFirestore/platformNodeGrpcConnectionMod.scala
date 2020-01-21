package typings.firebaseFirestore

import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.remoteConnectionMod.Connection
import typings.grpc.mod.GrpcObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_node/grpc_connection", JSImport.Namespace)
@js.native
object platformNodeGrpcConnectionMod extends js.Object {
  @js.native
  class GrpcConnection protected () extends Connection {
    def this(protos: GrpcObject, databaseInfo: DatabaseInfo) = this()
    var cachedStub: js.Any = js.native
    var databaseInfo: js.Any = js.native
    var ensureActiveStub: js.Any = js.native
    var firestore: js.Any = js.native
  }
  
}

