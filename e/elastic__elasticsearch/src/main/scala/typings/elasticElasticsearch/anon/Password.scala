package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Password extends StObject {
  
  var password: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Password] = js.undefined
  
  var password_hash: js.UndefOr[String] = js.undefined
}
object Password {
  
  inline def apply(): Password = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Password]
  }
  
  extension [Self <: Password](x: Self) {
    
    inline def setPassword(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPassword_hash(value: String): Self = StObject.set(x, "password_hash", value.asInstanceOf[js.Any])
    
    inline def setPassword_hashUndefined: Self = StObject.set(x, "password_hash", js.undefined)
  }
}
