package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/protos/firestore_proto_api", "ProjectsDatabasesIndexesApiClientImpl")
@js.native
class ProjectsDatabasesIndexesApiClientImpl protected () extends ProjectsDatabasesIndexesApiClient {
  def this(gapiVersion: String, gapiRequestService: PromiseRequestService) = this()
  def this(
    gapiVersion: String,
    gapiRequestService: PromiseRequestService,
    apiClientHookFactory: ApiClientHookFactory
  ) = this()
  @JSName("$apiClient")
  var $apiClient: js.Any = js.native
  var gapiVersion: js.Any = js.native
}

