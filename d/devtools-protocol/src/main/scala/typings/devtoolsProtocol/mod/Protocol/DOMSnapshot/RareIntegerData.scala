package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RareIntegerData extends js.Object {
  
  var index: js.Array[integer] = js.native
  
  var value: js.Array[integer] = js.native
}
object RareIntegerData {
  
  @scala.inline
  def apply(index: js.Array[integer], value: js.Array[integer]): RareIntegerData = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RareIntegerData]
  }
  
  @scala.inline
  implicit class RareIntegerDataOps[Self <: RareIntegerData] (val x: Self) extends AnyVal {
    
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
    def setIndexVarargs(value: integer*): Self = this.set("index", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: js.Array[integer]): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: integer*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[integer]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
