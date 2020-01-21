package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.AnonClientemail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings
  extends /* key */ StringDictionary[js.Any] {
  /**
    * The 'client_email' and 'private_key' properties of the service account
    * to use with your Firestore project. Can be omitted in environments that
    * support {@link https://cloud.google.com/docs/authentication Application
    * Default Credentials}. If your credentials are stored in a JSON file, you
    * can specify a `keyFilename` instead.
    */
  var credentials: js.UndefOr[AnonClientemail] = js.undefined
  /** The hostname to connect to. */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Local file containing the Service Account credentials as downloaded from
    * the Google Developers Console. Can  be omitted in environments that
    * support {@link https://cloud.google.com/docs/authentication Application
    * Default Credentials}. To configure Firestore with custom credentials, use
    * the `credentials` property to provide the `client_email` and
    * `private_key` of your service account.
    */
  var keyFilename: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of idle GRPC channels to keep. A smaller number of idle
    * channels reduces memory usage but increases request latency for clients
    * with fluctuating request rates. If set to 0, shuts down all GRPC channels
    * when the client becomes idle. Defaults to 1.
    */
  var maxIdleChannels: js.UndefOr[Double] = js.undefined
  /** The port to connect to. */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * The project ID from the Google Developer's Console, e.g.
    * 'grape-spaceship-123'. We will also check the environment variable
    * GCLOUD_PROJECT for your project ID.  Can be omitted in environments that
    * support {@link https://cloud.google.com/docs/authentication Application
    * Default Credentials}
    */
  var projectId: js.UndefOr[String] = js.undefined
  /** Whether to use SSL when connecting. */
  var ssl: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    credentials: AnonClientemail = null,
    host: String = null,
    keyFilename: String = null,
    maxIdleChannels: Int | Double = null,
    port: Int | Double = null,
    projectId: String = null,
    ssl: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename.asInstanceOf[js.Any])
    if (maxIdleChannels != null) __obj.updateDynamic("maxIdleChannels")(maxIdleChannels.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

