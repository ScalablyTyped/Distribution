package typings.ethersprojectAbstractProvider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends EventFilter {
  
  var fromBlock: js.UndefOr[BlockTag] = js.native
  
  var toBlock: js.UndefOr[BlockTag] = js.native
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setFromBlock(value: BlockTag): Self = this.set("fromBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromBlock: Self = this.set("fromBlock", js.undefined)
    
    @scala.inline
    def setToBlock(value: BlockTag): Self = this.set("toBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToBlock: Self = this.set("toBlock", js.undefined)
  }
}
