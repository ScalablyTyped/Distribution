package typings.ethersprojectContracts.mod

import typings.ethersprojectAbstractProvider.mod.BlockTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallOverrides extends PayableOverrides {
  
  var blockTag: js.UndefOr[BlockTag | js.Promise[BlockTag]] = js.native
  
  var from: js.UndefOr[String | js.Promise[String]] = js.native
}
object CallOverrides {
  
  @scala.inline
  def apply(): CallOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOverrides]
  }
  
  @scala.inline
  implicit class CallOverridesOps[Self <: CallOverrides] (val x: Self) extends AnyVal {
    
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
    def setBlockTag(value: BlockTag | js.Promise[BlockTag]): Self = this.set("blockTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockTag: Self = this.set("blockTag", js.undefined)
    
    @scala.inline
    def setFrom(value: String | js.Promise[String]): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
  }
}
