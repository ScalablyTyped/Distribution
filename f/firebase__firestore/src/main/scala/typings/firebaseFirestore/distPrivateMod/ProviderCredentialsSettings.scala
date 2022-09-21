package typings.firebaseFirestore.distPrivateMod

import typings.firebaseFirestore.firebaseFirestoreStrings.provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderCredentialsSettings
  extends StObject
     with CredentialsSettings {
  
  var client: CredentialsProvider[User]
  
  var `type`: provider
}
object ProviderCredentialsSettings {
  
  inline def apply(client: CredentialsProvider[User]): ProviderCredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("provider")
    __obj.asInstanceOf[ProviderCredentialsSettings]
  }
  
  extension [Self <: ProviderCredentialsSettings](x: Self) {
    
    inline def setClient(value: CredentialsProvider[User]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setType(value: provider): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
