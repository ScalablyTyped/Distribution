package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataStatus extends StObject {
  
  var data: Accountname
  
  var status: String
}
object DataStatus {
  
  inline def apply(data: Accountname, status: String): DataStatus = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStatus]
  }
  
  extension [Self <: DataStatus](x: Self) {
    
    inline def setData(value: Accountname): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
