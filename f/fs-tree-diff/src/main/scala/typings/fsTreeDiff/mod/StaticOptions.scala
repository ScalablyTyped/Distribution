package typings.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticOptions extends js.Object {
  
  var sortAndExpand: js.UndefOr[Boolean] = js.native
}
object StaticOptions {
  
  @scala.inline
  def apply(): StaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticOptions]
  }
  
  @scala.inline
  implicit class StaticOptionsOps[Self <: StaticOptions] (val x: Self) extends AnyVal {
    
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
    def setSortAndExpand(value: Boolean): Self = this.set("sortAndExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortAndExpand: Self = this.set("sortAndExpand", js.undefined)
  }
}
