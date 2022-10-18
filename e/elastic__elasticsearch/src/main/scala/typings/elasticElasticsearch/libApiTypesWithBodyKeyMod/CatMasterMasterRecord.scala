package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatMasterMasterRecord extends StObject {
  
  var h: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var ip: js.UndefOr[String] = js.undefined
  
  var n: js.UndefOr[String] = js.undefined
  
  var node: js.UndefOr[String] = js.undefined
}
object CatMasterMasterRecord {
  
  inline def apply(): CatMasterMasterRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatMasterMasterRecord]
  }
  
  extension [Self <: CatMasterMasterRecord](x: Self) {
    
    inline def setH(value: String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
