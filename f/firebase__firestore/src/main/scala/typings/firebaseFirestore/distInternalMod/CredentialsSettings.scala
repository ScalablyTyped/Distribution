package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Settings for private credentials */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.distInternalMod.FirstPartyCredentialsSettings
  - typings.firebaseFirestore.distInternalMod.ProviderCredentialsSettings
*/
trait CredentialsSettings extends StObject
object CredentialsSettings {
  
  inline def FirstPartyCredentialsSettings(sessionIndex: String): typings.firebaseFirestore.distInternalMod.FirstPartyCredentialsSettings = {
    val __obj = js.Dynamic.literal(sessionIndex = sessionIndex.asInstanceOf[js.Any], authTokenFactory = null, iamToken = null)
    __obj.updateDynamic("type")("firstParty")
    __obj.asInstanceOf[typings.firebaseFirestore.distInternalMod.FirstPartyCredentialsSettings]
  }
  
  inline def ProviderCredentialsSettings(client: CredentialsProvider[User]): typings.firebaseFirestore.distInternalMod.ProviderCredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("provider")
    __obj.asInstanceOf[typings.firebaseFirestore.distInternalMod.ProviderCredentialsSettings]
  }
}
