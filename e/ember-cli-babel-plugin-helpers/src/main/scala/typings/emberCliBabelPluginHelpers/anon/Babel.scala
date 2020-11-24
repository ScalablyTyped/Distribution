package typings.emberCliBabelPluginHelpers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Babel extends js.Object {
  
  var babel: js.UndefOr[Plugins] = js.native
}
object Babel {
  
  @scala.inline
  def apply(): Babel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Babel]
  }
  
  @scala.inline
  implicit class BabelOps[Self <: Babel] (val x: Self) extends AnyVal {
    
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
    def setBabel(value: Plugins): Self = this.set("babel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabel: Self = this.set("babel", js.undefined)
  }
}
