package typings.exceljs.mod

import typings.exceljs.exceljsStrings.auto
import typings.exceljs.exceljsStrings.custom
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentMargins extends StObject {
  
  var inset: js.Array[Number]
  
  var insetmode: auto | custom
}
object CommentMargins {
  
  inline def apply(inset: js.Array[Number], insetmode: auto | custom): CommentMargins = {
    val __obj = js.Dynamic.literal(inset = inset.asInstanceOf[js.Any], insetmode = insetmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentMargins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentMargins] (val x: Self) extends AnyVal {
    
    inline def setInset(value: js.Array[Number]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetVarargs(value: Number*): Self = StObject.set(x, "inset", js.Array(value*))
    
    inline def setInsetmode(value: auto | custom): Self = StObject.set(x, "insetmode", value.asInstanceOf[js.Any])
  }
}
