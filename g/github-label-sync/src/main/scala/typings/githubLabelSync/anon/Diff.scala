package typings.githubLabelSync.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diff extends js.Object {
  
  var diff: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  
  var success: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  
  var warning: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
}
object Diff {
  
  @scala.inline
  def apply(): Diff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diff]
  }
  
  @scala.inline
  implicit class DiffOps[Self <: Diff] (val x: Self) extends AnyVal {
    
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
    def setDiff(value: /* str */ String => String): Self = this.set("diff", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDiff: Self = this.set("diff", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* str */ String => String): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setWarning(value: /* str */ String => String): Self = this.set("warning", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
