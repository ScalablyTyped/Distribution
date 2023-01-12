package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arg extends StObject {
  
  var arg: js.UndefOr[js.Date | Double | String] = js.undefined
  
  var `val`: js.UndefOr[js.Date | Double | String] = js.undefined
}
object Arg {
  
  inline def apply(): Arg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arg] (val x: Self) extends AnyVal {
    
    inline def setArg(value: js.Date | Double | String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
    
    inline def setVal(value: js.Date | Double | String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setValUndefined: Self = StObject.set(x, "val", js.undefined)
  }
}
