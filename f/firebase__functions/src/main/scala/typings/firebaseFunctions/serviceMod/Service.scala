package typings.firebaseFunctions.serviceMod

import typings.firebaseAppTypes.privateMod.FirebaseService
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFunctions.AnonDelete
import typings.firebaseFunctions.mod.FirebaseApp
import typings.firebaseFunctionsTypes.mod.FirebaseFunctions
import typings.firebaseMessagingTypes.mod.FirebaseMessagingName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/functions/dist/src/api/service", "Service")
@js.native
class Service protected ()
  extends FirebaseFunctions
     with FirebaseService {
  /**
    * Creates a new Functions service for the given app and (optional) region.
    * @param app_ The FirebaseApp to use.
    * @param region_ The region to call functions in.
    */
  def this(
    app_ : FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    messagingProvider: Provider[FirebaseMessagingName]
  ) = this()
  def this(
    app_ : FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    messagingProvider: Provider[FirebaseMessagingName],
    region_ : String
  ) = this()
  @JSName("INTERNAL")
  var INTERNAL_Service: AnonDelete = js.native
  /* CompleteClass */
  override var app: typings.firebaseAppTypes.mod.FirebaseApp = js.native
  var app_ : js.Any = js.native
  /**
    * Calls a callable function asynchronously and returns the result.
    * @param name The name of the callable trigger.
    * @param data The data to pass as params to the function.s
    */
  var call: js.Any = js.native
  var cancelAllRequests: js.Any = js.native
  val contextProvider: js.Any = js.native
  var deleteService: js.Any = js.native
  var emulatorOrigin: js.Any = js.native
  /**
    * Does an HTTP POST and returns the completed response.
    * @param url The url to post to.
    * @param body The JSON body of the post.
    * @param headers The HTTP headers to include in the request.
    * @return A Promise that will succeed when the request finishes.
    */
  var postJSON: js.Any = js.native
  var region_ : js.Any = js.native
  val serializer: js.Any = js.native
  /**
    * Returns the URL for a callable with the given name.
    * @param name The name of the callable.
    */
  def _url(name: String): String = js.native
  @JSName("app")
  def app_MService(): FirebaseApp = js.native
}

