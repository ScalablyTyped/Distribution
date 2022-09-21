package typings.firebaseAuth.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identities extends StObject {
  
  var identities: js.UndefOr[Record[String, String]] = js.undefined
  
  var sign_in_provider: js.UndefOr[String] = js.undefined
  
  var sign_in_second_factor: js.UndefOr[String] = js.undefined
}
object Identities {
  
  inline def apply(): Identities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identities]
  }
  
  extension [Self <: Identities](x: Self) {
    
    inline def setIdentities(value: Record[String, String]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setSign_in_provider(value: String): Self = StObject.set(x, "sign_in_provider", value.asInstanceOf[js.Any])
    
    inline def setSign_in_providerUndefined: Self = StObject.set(x, "sign_in_provider", js.undefined)
    
    inline def setSign_in_second_factor(value: String): Self = StObject.set(x, "sign_in_second_factor", value.asInstanceOf[js.Any])
    
    inline def setSign_in_second_factorUndefined: Self = StObject.set(x, "sign_in_second_factor", js.undefined)
  }
}
