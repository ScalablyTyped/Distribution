package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterMd5AuthenticationKey extends StObject {
  
  /**
    * [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value from the previous configuration. This is allowed if the key with the same name existed before the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name used to identify the key. Must be unique within a router. Must be referenced by at least one bgpPeer. Must comply with RFC1035.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaRouterMd5AuthenticationKey {
  
  inline def apply(): SchemaRouterMd5AuthenticationKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterMd5AuthenticationKey]
  }
  
  extension [Self <: SchemaRouterMd5AuthenticationKey](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
