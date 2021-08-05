package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Protection> */
trait PartialProtection extends StObject {
  
  var locked: js.UndefOr[Boolean] = js.undefined
}
object PartialProtection {
  
  inline def apply(): PartialProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProtection]
  }
  
  extension [Self <: PartialProtection](x: Self) {
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}
