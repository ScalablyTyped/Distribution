package typings.ecmarkdown.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseFragmentOpts extends js.Object {
  
  var inList: js.UndefOr[Boolean] = js.native
}
object ParseFragmentOpts {
  
  @scala.inline
  def apply(): ParseFragmentOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseFragmentOpts]
  }
  
  @scala.inline
  implicit class ParseFragmentOptsOps[Self <: ParseFragmentOpts] (val x: Self) extends AnyVal {
    
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
    def setInList(value: Boolean): Self = this.set("inList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInList: Self = this.set("inList", js.undefined)
  }
}
