package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/tasks", JSImport.Default)
@js.native
class default protected ()
  extends StObject
     with CloudTasksClient {
  /**
    * Construct an instance of CloudTasksClient.
    *
    * @param [options] - The configuration object. See the subsequent
    *   parameters for more details.
    * @param [options.credentials] - Credentials object.
    * @param [options.credentials.client_email]
    * @param [options.credentials.private_key]
    * @param [options.email] - Account email address. Required when
    *     using a .pem or .p12 keyFilename.
    * @param [options.keyFilename] - Full path to the a .json, .pem, or
    *     .p12 key downloaded from the Google Developers Console. If you provide
    *     a path to a JSON file, the projectId option below is not necessary.
    *     NOTE: .pem and .p12 require you to specify options.email as well.
    * @param [options.port] - The port on which to connect to
    *     the remote host.
    * @param [options.projectId] - The project ID from the Google
    *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
    *     the environment variable GCLOUD_PROJECT for your project ID. If your
    *     app is running in an environment which supports
    *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
    *     your project ID will be detected automatically.
    * @param [options.promise] - Custom promise module to use instead
    *     of native Promises.
    * @param [options.servicePath] - The domain name of the
    *     API remote host.
    */
  def this(config: CloudTasksConfig) = this()
}
/* static members */
object default {
  
  @JSImport("@google-cloud/tasks", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The port for this API service.
    * @default 443
    */
  @JSImport("@google-cloud/tasks", "default.port")
  @js.native
  val port: Double = js.native
  
  /**
    * The scopes needed to make gRPC calls for every method defined
    * in this service.
    * @default ["https://www.googleapis.com/auth/cloud-platform"]
    */
  @JSImport("@google-cloud/tasks", "default.readonlyscopes")
  @js.native
  def readonlyscopes: String = js.native
  @scala.inline
  def readonlyscopes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readonlyscopes")(x.asInstanceOf[js.Any])
  
  /**
    * The DNS address for this API service.
    * @default 'cloudtasks.googleapis.com'
    */
  @JSImport("@google-cloud/tasks", "default.servicePath")
  @js.native
  val servicePath: String = js.native
}
