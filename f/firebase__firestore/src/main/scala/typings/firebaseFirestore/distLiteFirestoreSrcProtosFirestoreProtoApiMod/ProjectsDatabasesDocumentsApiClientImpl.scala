package typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/protos/firestore_proto_api", "ProjectsDatabasesDocumentsApiClientImpl")
@js.native
open class ProjectsDatabasesDocumentsApiClientImpl protected () extends ProjectsDatabasesDocumentsApiClient {
  def this(gapiVersion: String, gapiRequestService: PromiseRequestService) = this()
  def this(
    gapiVersion: String,
    gapiRequestService: PromiseRequestService,
    apiClientHookFactory: ApiClientHookFactory
  ) = this()
  
  /* private */ @JSName("$apiClient")
  var $apiClient: Any = js.native
  
  /* private */ var gapiVersion: Any = js.native
}
