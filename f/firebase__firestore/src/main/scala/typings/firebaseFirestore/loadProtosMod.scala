package typings.firebaseFirestore

import typings.grpcGrpcJs.makeClientMod.GrpcObject
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/node/load_protos", JSImport.Namespace)
@js.native
object loadProtosMod extends js.Object {
  val protoLoaderOptions: IConversionOptions = js.native
  def loadProtos(): GrpcObject = js.native
  def loadRawProtos(): Root = js.native
}

