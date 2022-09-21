package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectMacsecConfig extends StObject {
  
  /**
    * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK will be generated for each key in the key chain. Google router will automatically pick the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
    */
  var preSharedKeys: js.UndefOr[js.Array[SchemaInterconnectMacsecConfigPreSharedKey]] = js.undefined
}
object SchemaInterconnectMacsecConfig {
  
  inline def apply(): SchemaInterconnectMacsecConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectMacsecConfig]
  }
  
  extension [Self <: SchemaInterconnectMacsecConfig](x: Self) {
    
    inline def setPreSharedKeys(value: js.Array[SchemaInterconnectMacsecConfigPreSharedKey]): Self = StObject.set(x, "preSharedKeys", value.asInstanceOf[js.Any])
    
    inline def setPreSharedKeysUndefined: Self = StObject.set(x, "preSharedKeys", js.undefined)
    
    inline def setPreSharedKeysVarargs(value: SchemaInterconnectMacsecConfigPreSharedKey*): Self = StObject.set(x, "preSharedKeys", js.Array(value*))
  }
}
