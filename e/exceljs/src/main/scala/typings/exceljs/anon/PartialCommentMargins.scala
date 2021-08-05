package typings.exceljs.anon

import typings.exceljs.exceljsStrings.auto
import typings.exceljs.exceljsStrings.custom
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.CommentMargins> */
trait PartialCommentMargins extends StObject {
  
  var inset: js.UndefOr[js.Array[Number]] = js.undefined
  
  var insetmode: js.UndefOr[auto | custom] = js.undefined
}
object PartialCommentMargins {
  
  inline def apply(): PartialCommentMargins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommentMargins]
  }
  
  extension [Self <: PartialCommentMargins](x: Self) {
    
    inline def setInset(value: js.Array[Number]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setInsetVarargs(value: Number*): Self = StObject.set(x, "inset", js.Array(value :_*))
    
    inline def setInsetmode(value: auto | custom): Self = StObject.set(x, "insetmode", value.asInstanceOf[js.Any])
    
    inline def setInsetmodeUndefined: Self = StObject.set(x, "insetmode", js.undefined)
  }
}
