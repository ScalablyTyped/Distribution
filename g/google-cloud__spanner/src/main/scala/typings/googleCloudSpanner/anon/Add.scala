package typings.googleCloudSpanner.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  var add: js.Function
}
object Add {
  
  inline def apply(add: js.Function): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: js.Function): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
  }
}
