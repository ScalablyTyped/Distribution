package typings.firebaseFirestore

import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/serializer", JSImport.Namespace)
@js.native
object platformSerializerMod extends js.Object {
  def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = js.native
}

