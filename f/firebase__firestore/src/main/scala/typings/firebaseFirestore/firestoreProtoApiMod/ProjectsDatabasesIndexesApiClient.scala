package typings.firebaseFirestore.firestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/src/protos/firestore_proto_api", "ProjectsDatabasesIndexesApiClient")
@js.native
/* private */ abstract class ProjectsDatabasesIndexesApiClient () extends StObject {
  
  def create(parent: String, $requestBody: Index): js.Promise[Operation] = js.native
  def create(
    parent: String,
    $requestBody: Index,
    __namedParams__ : ProjectsDatabasesIndexesCreateNamedParameters & js.Object
  ): js.Promise[Operation] = js.native
  
  def delete(name: String): js.Promise[Empty] = js.native
  def delete(name: String, __namedParams__ : ProjectsDatabasesIndexesDeleteNamedParameters & js.Object): js.Promise[Empty] = js.native
  
  def get(name: String): js.Promise[Index] = js.native
  def get(name: String, __namedParams__ : ProjectsDatabasesIndexesGetNamedParameters & js.Object): js.Promise[Index] = js.native
  
  def list(parent: String): js.Promise[ListIndexesResponse] = js.native
  def list(parent: String, __namedParams__ : ProjectsDatabasesIndexesListNamedParameters & js.Object): js.Promise[ListIndexesResponse] = js.native
}
