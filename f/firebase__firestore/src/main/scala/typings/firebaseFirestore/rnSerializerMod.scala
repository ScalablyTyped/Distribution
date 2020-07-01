package typings.firebaseFirestore

import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/rn/serializer", JSImport.Namespace)
@js.native
object rnSerializerMod extends js.Object {
  def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = js.native
}

