package typings.exceljs.mod

import typings.exceljs.exceljsStrings.False
import typings.exceljs.exceljsStrings.True
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentProtection extends StObject {
  
  var lockText: True | False
  
  var locked: True | False
}
object CommentProtection {
  
  inline def apply(lockText: True | False, locked: True | False): CommentProtection = {
    val __obj = js.Dynamic.literal(lockText = lockText.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentProtection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentProtection] (val x: Self) extends AnyVal {
    
    inline def setLockText(value: True | False): Self = StObject.set(x, "lockText", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: True | False): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
  }
}
