package typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/src/protos/firestore_proto_api", "ProjectsDatabasesIndexesApiClient")
@js.native
/* private */ open class ProjectsDatabasesIndexesApiClient () extends StObject {
  
  def create(parent: String, $requestBody: Index): js.Promise[Operation] = js.native
  def create(
    parent: String,
    $requestBody: Index,
    __namedParams__ : ProjectsDatabasesIndexesCreateNamedParameters
  ): js.Promise[Operation] = js.native
  
  def delete(name: String): js.Promise[Empty] = js.native
  def delete(name: String, __namedParams__ : ProjectsDatabasesIndexesDeleteNamedParameters): js.Promise[Empty] = js.native
  
  def get(name: String): js.Promise[Index] = js.native
  def get(name: String, __namedParams__ : ProjectsDatabasesIndexesGetNamedParameters): js.Promise[Index] = js.native
  
  def list(parent: String): js.Promise[ListIndexesResponse] = js.native
  def list(parent: String, __namedParams__ : ProjectsDatabasesIndexesListNamedParameters): js.Promise[ListIndexesResponse] = js.native
}
