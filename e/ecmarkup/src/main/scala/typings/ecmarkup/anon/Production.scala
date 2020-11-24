package typings.ecmarkup.anon

import typings.grammarkdown.mod.OneOfList
import typings.grammarkdown.mod.RightHandSide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Production extends js.Object {
  
  var production: typings.grammarkdown.mod.Production = js.native
  
  var rhses: js.Array[RightHandSide | OneOfList] = js.native
}
object Production {
  
  @scala.inline
  def apply(production: typings.grammarkdown.mod.Production, rhses: js.Array[RightHandSide | OneOfList]): Production = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], rhses = rhses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Production]
  }
  
  @scala.inline
  implicit class ProductionOps[Self <: Production] (val x: Self) extends AnyVal {
    
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
    def setProduction(value: typings.grammarkdown.mod.Production): Self = this.set("production", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRhsesVarargs(value: (RightHandSide | OneOfList)*): Self = this.set("rhses", js.Array(value :_*))
    
    @scala.inline
    def setRhses(value: js.Array[RightHandSide | OneOfList]): Self = this.set("rhses", value.asInstanceOf[js.Any])
  }
}
