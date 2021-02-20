package typings.exceljs.anon

import typings.exceljs.exceljsStrings.auto
import typings.exceljs.exceljsStrings.custom
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.CommentMargins> */
@js.native
trait PartialCommentMargins extends StObject {
  
  var inset: js.UndefOr[js.Array[Number]] = js.native
  
  var insetmode: js.UndefOr[auto | custom] = js.native
}
object PartialCommentMargins {
  
  @scala.inline
  def apply(): PartialCommentMargins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommentMargins]
  }
  
  @scala.inline
  implicit class PartialCommentMarginsMutableBuilder[Self <: PartialCommentMargins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInset(value: js.Array[Number]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setInsetVarargs(value: Number*): Self = StObject.set(x, "inset", js.Array(value :_*))
    
    @scala.inline
    def setInsetmode(value: auto | custom): Self = StObject.set(x, "insetmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetmodeUndefined: Self = StObject.set(x, "insetmode", js.undefined)
  }
}
