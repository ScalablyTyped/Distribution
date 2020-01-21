package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/protos/firestore_proto_api", "ProjectsDatabasesIndexesApiClient")
@js.native
abstract class ProjectsDatabasesIndexesApiClient protected () extends js.Object {
  def create(parent: String, $requestBody: Index): js.Promise[Operation] = js.native
  def create(
    parent: String,
    $requestBody: Index,
    __namedParams__ : ProjectsDatabasesIndexesCreateNamedParameters with js.Object
  ): js.Promise[Operation] = js.native
  def delete(name: String): js.Promise[Empty] = js.native
  def delete(name: String, __namedParams__ : ProjectsDatabasesIndexesDeleteNamedParameters with js.Object): js.Promise[Empty] = js.native
  def get(name: String): js.Promise[Index] = js.native
  def get(name: String, __namedParams__ : ProjectsDatabasesIndexesGetNamedParameters with js.Object): js.Promise[Index] = js.native
  def list(parent: String): js.Promise[ListIndexesResponse] = js.native
  def list(parent: String, __namedParams__ : ProjectsDatabasesIndexesListNamedParameters with js.Object): js.Promise[ListIndexesResponse] = js.native
}

