package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  value :any} & std.ThisType<any> */
trait valueanyThisTypeany extends StObject {
  
  var value: js.Any
}
object valueanyThisTypeany {
  
  @scala.inline
  def apply(value: js.Any): valueanyThisTypeany = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[valueanyThisTypeany]
  }
  
  @scala.inline
  implicit class valueanyThisTypeanyMutableBuilder[Self <: valueanyThisTypeany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
