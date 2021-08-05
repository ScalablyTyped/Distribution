package typings.exceljs.anon

import typings.exceljs.exceljsStrings.False
import typings.exceljs.exceljsStrings.True
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.CommentProtection> */
trait PartialCommentProtection extends StObject {
  
  var lockText: js.UndefOr[True | False] = js.undefined
  
  var locked: js.UndefOr[True | False] = js.undefined
}
object PartialCommentProtection {
  
  inline def apply(): PartialCommentProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommentProtection]
  }
  
  extension [Self <: PartialCommentProtection](x: Self) {
    
    inline def setLockText(value: True | False): Self = StObject.set(x, "lockText", value.asInstanceOf[js.Any])
    
    inline def setLockTextUndefined: Self = StObject.set(x, "lockText", js.undefined)
    
    inline def setLocked(value: True | False): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}
