package typings.firebaseFirestore

import typings.grpc.mod.GrpcObject
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_node/load_protos", JSImport.Namespace)
@js.native
object platformNodeLoadProtosMod extends js.Object {
  val protoLoaderOptions: IConversionOptions = js.native
  def loadProtos(): GrpcObject = js.native
  def loadRawProtos(): Root = js.native
}

