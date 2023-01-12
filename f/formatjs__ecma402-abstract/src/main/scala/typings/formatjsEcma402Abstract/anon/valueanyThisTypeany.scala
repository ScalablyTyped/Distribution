package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  value :any} & std.ThisType<any> */
trait valueanyThisTypeany extends StObject {
  
  var value: Any
}
object valueanyThisTypeany {
  
  inline def apply(value: Any): valueanyThisTypeany = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[valueanyThisTypeany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: valueanyThisTypeany] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
