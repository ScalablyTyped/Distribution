package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPProtocol extends StObject {
  
  var IPProtocol: js.UndefOr[String] = js.undefined
  
  var ports: js.UndefOr[js.Array[String]] = js.undefined
}
object IPProtocol {
  
  inline def apply(): IPProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPProtocol]
  }
  
  extension [Self <: IPProtocol](x: Self) {
    
    inline def setIPProtocol(value: String): Self = StObject.set(x, "IPProtocol", value.asInstanceOf[js.Any])
    
    inline def setIPProtocolUndefined: Self = StObject.set(x, "IPProtocol", js.undefined)
    
    inline def setPorts(value: js.Array[String]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: String*): Self = StObject.set(x, "ports", js.Array(value :_*))
  }
}
