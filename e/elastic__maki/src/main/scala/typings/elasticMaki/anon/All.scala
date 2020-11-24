package typings.elasticMaki.anon

import typings.elasticMaki.mod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait All extends js.Object {
  
  var all: js.Array[IconName] = js.native
}
object All {
  
  @scala.inline
  def apply(all: js.Array[IconName]): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
    
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
    def setAllVarargs(value: IconName*): Self = this.set("all", js.Array(value :_*))
    
    @scala.inline
    def setAll(value: js.Array[IconName]): Self = this.set("all", value.asInstanceOf[js.Any])
  }
}
