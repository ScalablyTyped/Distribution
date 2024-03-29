package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var checked: Boolean
}
object Checked {
  
  inline def apply(checked: Boolean): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checked] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
  }
}
