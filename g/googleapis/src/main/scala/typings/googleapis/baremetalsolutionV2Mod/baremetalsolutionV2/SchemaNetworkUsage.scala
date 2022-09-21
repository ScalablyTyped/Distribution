package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkUsage extends StObject {
  
  /**
    * Network.
    */
  var network: js.UndefOr[SchemaNetwork] = js.undefined
  
  /**
    * All used IP addresses in this network.
    */
  var usedIps: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaNetworkUsage {
  
  inline def apply(): SchemaNetworkUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkUsage]
  }
  
  extension [Self <: SchemaNetworkUsage](x: Self) {
    
    inline def setNetwork(value: SchemaNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setUsedIps(value: js.Array[String]): Self = StObject.set(x, "usedIps", value.asInstanceOf[js.Any])
    
    inline def setUsedIpsNull: Self = StObject.set(x, "usedIps", null)
    
    inline def setUsedIpsUndefined: Self = StObject.set(x, "usedIps", js.undefined)
    
    inline def setUsedIpsVarargs(value: String*): Self = StObject.set(x, "usedIps", js.Array(value*))
  }
}
