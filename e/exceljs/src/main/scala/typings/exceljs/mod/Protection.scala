package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Protection extends StObject {
  
  var locked: Boolean
}
object Protection {
  
  @scala.inline
  def apply(locked: Boolean): Protection = {
    val __obj = js.Dynamic.literal(locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protection]
  }
  
  @scala.inline
  implicit class ProtectionMutableBuilder[Self <: Protection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
  }
}
