package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectMacsecConfigPreSharedKey extends StObject {
  
  /**
    * An auto-generated Connectivity Association Key (CAK) for this key.
    */
  var cak: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An auto-generated Connectivity Association Key Name (CKN) for this key.
    */
  var ckn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User provided name for this pre-shared key.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User provided timestamp on or after which this key is valid.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterconnectMacsecConfigPreSharedKey {
  
  inline def apply(): SchemaInterconnectMacsecConfigPreSharedKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectMacsecConfigPreSharedKey]
  }
  
  extension [Self <: SchemaInterconnectMacsecConfigPreSharedKey](x: Self) {
    
    inline def setCak(value: String): Self = StObject.set(x, "cak", value.asInstanceOf[js.Any])
    
    inline def setCakNull: Self = StObject.set(x, "cak", null)
    
    inline def setCakUndefined: Self = StObject.set(x, "cak", js.undefined)
    
    inline def setCkn(value: String): Self = StObject.set(x, "ckn", value.asInstanceOf[js.Any])
    
    inline def setCknNull: Self = StObject.set(x, "ckn", null)
    
    inline def setCknUndefined: Self = StObject.set(x, "ckn", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
