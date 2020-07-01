package typings.firebaseFirestore

import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/node/serializer", JSImport.Namespace)
@js.native
object nodeSerializerMod extends js.Object {
  def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = js.native
}

