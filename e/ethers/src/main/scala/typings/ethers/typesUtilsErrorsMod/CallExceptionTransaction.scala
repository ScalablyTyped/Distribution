package typings.ethers.typesUtilsErrorsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExceptionTransaction extends StObject {
  
  var data: String
  
  var from: js.UndefOr[String] = js.undefined
  
  var to: Null | String
}
object CallExceptionTransaction {
  
  inline def apply(data: String): CallExceptionTransaction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], to = null)
    __obj.asInstanceOf[CallExceptionTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallExceptionTransaction] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
  }
}
