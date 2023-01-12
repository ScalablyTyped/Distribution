package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Realm extends StObject {
  
  var acs: js.UndefOr[String] = js.undefined
  
  var realm: js.UndefOr[String] = js.undefined
  
  var relay_state: js.UndefOr[String] = js.undefined
}
object Realm {
  
  inline def apply(): Realm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Realm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Realm] (val x: Self) extends AnyVal {
    
    inline def setAcs(value: String): Self = StObject.set(x, "acs", value.asInstanceOf[js.Any])
    
    inline def setAcsUndefined: Self = StObject.set(x, "acs", js.undefined)
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    inline def setRelay_state(value: String): Self = StObject.set(x, "relay_state", value.asInstanceOf[js.Any])
    
    inline def setRelay_stateUndefined: Self = StObject.set(x, "relay_state", js.undefined)
  }
}
