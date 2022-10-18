package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  var info: js.Array[Cardlocale]
  
  var page_info: Pagesize
}
object Info {
  
  inline def apply(info: js.Array[Cardlocale], page_info: Pagesize): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  extension [Self <: Info](x: Self) {
    
    inline def setInfo(value: js.Array[Cardlocale]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoVarargs(value: Cardlocale*): Self = StObject.set(x, "info", js.Array(value*))
    
    inline def setPage_info(value: Pagesize): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
  }
}
