package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsResourceRecord extends StObject {
  
  /**
    * Output only. Data of the DNS Resource Record.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Fully qualified name of the DNS Resource Record. e.g. `_acme-challenge.example.com`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Type of the DNS Resource Record. Currently always set to "CNAME".
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDnsResourceRecord {
  
  inline def apply(): SchemaDnsResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsResourceRecord]
  }
  
  extension [Self <: SchemaDnsResourceRecord](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
