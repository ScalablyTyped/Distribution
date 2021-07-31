package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.anon.Clientemail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  /**
    * The 'client_email' and 'private_key' properties of the service account
    * to use with your Firestore project. Can be omitted in environments that
    * support {@link https://cloud.google.com/docs/authentication Application
    * Default Credentials}. If your credentials are stored in a JSON file, you
    * can specify a `keyFilename` instead.
    */
  var credentials: js.UndefOr[Clientemail] = js.undefined
  
  /** The hostname to connect to. */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to skip nested properties that are set to `undefined` during
    * object serialization. If set to `true`, these properties are skipped
    * and not written to Firestore. If set `false` or omitted, the SDK throws
    * an exception when it encounters properties of type `undefined`.
    */
  var ignoreUndefinedProperties: js.UndefOr[Boolean] = js.undefined
  
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
  
  /**
    * Whether to use `BigInt` for integer types when deserializing Firestore
    * Documents. Regardless of magnitude, all integer values are returned as
    * `BigInt` to match the precision of the Firestore backend. Floating point
    * numbers continue to use JavaScript's `number` type.
    */
  var useBigInt: js.UndefOr[Boolean] = js.undefined
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: Clientemail): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setIgnoreUndefinedProperties(value: Boolean): Self = StObject.set(x, "ignoreUndefinedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefinedPropertiesUndefined: Self = StObject.set(x, "ignoreUndefinedProperties", js.undefined)
    
    @scala.inline
    def setKeyFilename(value: String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFilenameUndefined: Self = StObject.set(x, "keyFilename", js.undefined)
    
    @scala.inline
    def setMaxIdleChannels(value: Double): Self = StObject.set(x, "maxIdleChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIdleChannelsUndefined: Self = StObject.set(x, "maxIdleChannels", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setUseBigInt(value: Boolean): Self = StObject.set(x, "useBigInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBigIntUndefined: Self = StObject.set(x, "useBigInt", js.undefined)
  }
}
