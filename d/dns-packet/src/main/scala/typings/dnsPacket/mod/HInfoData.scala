package typings.dnsPacket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HInfoData extends StObject {
  
  var cpu: String
  
  var os: String
}
object HInfoData {
  
  inline def apply(cpu: String, os: String): HInfoData = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[HInfoData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HInfoData] (val x: Self) extends AnyVal {
    
    inline def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}
