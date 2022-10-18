package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Settings for private credentials */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.distLitePrivateMod.FirstPartyCredentialsSettings
  - typings.firebaseFirestore.distLitePrivateMod.ProviderCredentialsSettings
*/
trait CredentialsSettings extends StObject
object CredentialsSettings {
  
  inline def FirstPartyCredentialsSettings(client: Any, sessionIndex: String): typings.firebaseFirestore.distLitePrivateMod.FirstPartyCredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], sessionIndex = sessionIndex.asInstanceOf[js.Any], authTokenFactory = null, iamToken = null)
    __obj.updateDynamic("type")("gapi")
    __obj.asInstanceOf[typings.firebaseFirestore.distLitePrivateMod.FirstPartyCredentialsSettings]
  }
  
  inline def ProviderCredentialsSettings(client: CredentialsProvider[User]): typings.firebaseFirestore.distLitePrivateMod.ProviderCredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("provider")
    __obj.asInstanceOf[typings.firebaseFirestore.distLitePrivateMod.ProviderCredentialsSettings]
  }
}
