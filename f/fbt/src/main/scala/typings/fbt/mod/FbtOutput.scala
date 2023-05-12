package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtOutput extends StObject {
  
  var fbt: String
  
  var params: String
}
object FbtOutput {
  
  inline def apply(fbt: String, params: String): FbtOutput = {
    val __obj = js.Dynamic.literal(fbt = fbt.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FbtOutput] (val x: Self) extends AnyVal {
    
    inline def setFbt(value: String): Self = StObject.set(x, "fbt", value.asInstanceOf[js.Any])
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
