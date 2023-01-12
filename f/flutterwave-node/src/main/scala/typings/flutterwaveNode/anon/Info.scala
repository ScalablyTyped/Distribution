package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  var info: js.Array[Account]
  
  var page_info: Pagesize
}
object Info {
  
  inline def apply(info: js.Array[Account], page_info: Pagesize): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
    
    inline def setInfo(value: js.Array[Account]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoVarargs(value: Account*): Self = StObject.set(x, "info", js.Array(value*))
    
    inline def setPage_info(value: Pagesize): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
  }
}
