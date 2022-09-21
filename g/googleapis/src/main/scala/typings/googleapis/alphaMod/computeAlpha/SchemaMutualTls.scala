package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMutualTls extends StObject {
  
  /**
    * Specifies if the server TLS is configured to be strict or permissive. This field can be set to one of the following: STRICT: Client certificate must be presented, connection is in TLS. PERMISSIVE: Client certificate can be omitted, connection can be either plaintext or TLS.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaMutualTls {
  
  inline def apply(): SchemaMutualTls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutualTls]
  }
  
  extension [Self <: SchemaMutualTls](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
