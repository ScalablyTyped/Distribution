package typings.dnsPacket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoaData extends StObject {
  
  var expire: js.UndefOr[Double] = js.undefined
  
  var minimum: js.UndefOr[Double] = js.undefined
  
  var mname: String
  
  var refresh: js.UndefOr[Double] = js.undefined
  
  var retry: js.UndefOr[Double] = js.undefined
  
  var rname: String
  
  var serial: js.UndefOr[Double] = js.undefined
}
object SoaData {
  
  inline def apply(mname: String, rname: String): SoaData = {
    val __obj = js.Dynamic.literal(mname = mname.asInstanceOf[js.Any], rname = rname.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SoaData] (val x: Self) extends AnyVal {
    
    inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setMname(value: String): Self = StObject.set(x, "mname", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Double): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setRname(value: String): Self = StObject.set(x, "rname", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: Double): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
  }
}
