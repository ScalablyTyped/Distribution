package typings.exceljs.anon

import typings.exceljs.exceljsStrings.auto
import typings.exceljs.exceljsStrings.custom
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.CommentMargins> */
@js.native
trait PartialCommentMargins extends js.Object {
  
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
  implicit class PartialCommentMarginsOps[Self <: PartialCommentMargins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsetVarargs(value: Number*): Self = this.set("inset", js.Array(value :_*))
    
    @scala.inline
    def setInset(value: js.Array[Number]): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setInsetmode(value: auto | custom): Self = this.set("insetmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsetmode: Self = this.set("insetmode", js.undefined)
  }
}
