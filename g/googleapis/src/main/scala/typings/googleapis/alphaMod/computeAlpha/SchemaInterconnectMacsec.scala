package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectMacsec extends StObject {
  
  /**
    * If set to true, the Interconnect will be configured with a should-secure MACsec security policy, that allows the Google router to fallback to cleartext traffic if the MKA session cannot be established. By default, the Interconnect will be configured with a must-secure security policy that drops all traffic if the MKA session cannot be established with your router.
    */
  var failOpen: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK will be generated for each key in the key chain. Google router will automatically pick the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
    */
  var preSharedKeys: js.UndefOr[js.Array[SchemaInterconnectMacsecPreSharedKey]] = js.undefined
}
object SchemaInterconnectMacsec {
  
  inline def apply(): SchemaInterconnectMacsec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectMacsec]
  }
  
  extension [Self <: SchemaInterconnectMacsec](x: Self) {
    
    inline def setFailOpen(value: Boolean): Self = StObject.set(x, "failOpen", value.asInstanceOf[js.Any])
    
    inline def setFailOpenNull: Self = StObject.set(x, "failOpen", null)
    
    inline def setFailOpenUndefined: Self = StObject.set(x, "failOpen", js.undefined)
    
    inline def setPreSharedKeys(value: js.Array[SchemaInterconnectMacsecPreSharedKey]): Self = StObject.set(x, "preSharedKeys", value.asInstanceOf[js.Any])
    
    inline def setPreSharedKeysUndefined: Self = StObject.set(x, "preSharedKeys", js.undefined)
    
    inline def setPreSharedKeysVarargs(value: SchemaInterconnectMacsecPreSharedKey*): Self = StObject.set(x, "preSharedKeys", js.Array(value*))
  }
}
