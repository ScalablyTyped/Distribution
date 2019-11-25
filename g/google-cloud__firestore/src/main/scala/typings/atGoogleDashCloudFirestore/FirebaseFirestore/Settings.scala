package typings.atGoogleDashCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.atGoogleDashCloudFirestore.Anon_Clientemail
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
  var credentials: js.UndefOr[Anon_Clientemail] = js.undefined
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
  /**
    * Specifies whether to use `Timestamp` objects for timestamp fields in
    * `DocumentSnapshot`s. This is enabled by default and should not be disabled.
    *
    * Previously, Firestore returned timestamp fields as `Date` but `Date` only
    * supports millisecond precision, which leads to truncation and causes
    * unexpected behavior when using a timestamp from a snapshot as a part of a
    * subsequent query.
    *
    * So now Firestore returns `Timestamp` values instead of `Date`, avoiding
    * this kind of problem.
    *
    * To opt into the old behavior of returning `Date` objects, you can
    * temporarily set `timestampsInSnapshots` to false.
    *
    * @deprecated This setting will be removed in a future release. You should
    * update your code to expect `Timestamp` objects and stop using the
    * `timestampsInSnapshots` setting.
    */
  var timestampsInSnapshots: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    credentials: Anon_Clientemail = null,
    host: String = null,
    keyFilename: String = null,
    port: Int | Double = null,
    projectId: String = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    timestampsInSnapshots: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(timestampsInSnapshots)) __obj.updateDynamic("timestampsInSnapshots")(timestampsInSnapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

