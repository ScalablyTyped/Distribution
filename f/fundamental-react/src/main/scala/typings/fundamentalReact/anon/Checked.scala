package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var checked: js.UndefOr[js.Any] = js.undefined
  
  var unchecked: js.UndefOr[js.Any] = js.undefined
}
object Checked {
  
  inline def apply(): Checked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checked]
  }
  
  extension [Self <: Checked](x: Self) {
    
    inline def setChecked(value: js.Any): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setUnchecked(value: js.Any): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
    
    inline def setUncheckedUndefined: Self = StObject.set(x, "unchecked", js.undefined)
  }
}
