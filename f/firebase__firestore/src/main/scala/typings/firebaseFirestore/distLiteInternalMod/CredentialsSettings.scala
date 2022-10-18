package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Settings for private credentials */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.distLiteInternalMod.FirstPartyCredentialsSettings
  - typings.firebaseFirestore.distLiteInternalMod.ProviderCredentialsSettings
*/
trait CredentialsSettings extends StObject
object CredentialsSettings {
  
  inline def FirstPartyCredentialsSettings(client: Any, sessionIndex: String): typings.firebaseFirestore.distLiteInternalMod.FirstPartyCredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], sessionIndex = sessionIndex.asInstanceOf[js.Any], authTokenFactory = null, iamToken = null)
    __obj.updateDynamic("type")("gapi")
    __obj.asInstanceOf[typings.firebaseFirestore.distLiteInternalMod.FirstPartyCredentialsSettings]
  }
  
  inline def ProviderCredentialsSettings(client: CredentialsProvider[User]): typings.firebaseFirestore.distLiteInternalMod.ProviderCredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("provider")
    __obj.asInstanceOf[typings.firebaseFirestore.distLiteInternalMod.ProviderCredentialsSettings]
  }
}
