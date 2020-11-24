package typings.extjs.Ext.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISizePolicy extends js.Object {
  
  /** [Property] (Boolean) */
  var readsHeight: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var readsWidth: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var setsHeight: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var setsWidth: js.UndefOr[Boolean] = js.native
}
object ISizePolicy {
  
  @scala.inline
  def apply(): ISizePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISizePolicy]
  }
  
  @scala.inline
  implicit class ISizePolicyOps[Self <: ISizePolicy] (val x: Self) extends AnyVal {
    
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
    def setReadsHeight(value: Boolean): Self = this.set("readsHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadsHeight: Self = this.set("readsHeight", js.undefined)
    
    @scala.inline
    def setReadsWidth(value: Boolean): Self = this.set("readsWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadsWidth: Self = this.set("readsWidth", js.undefined)
    
    @scala.inline
    def setSetsHeight(value: Boolean): Self = this.set("setsHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetsHeight: Self = this.set("setsHeight", js.undefined)
    
    @scala.inline
    def setSetsWidth(value: Boolean): Self = this.set("setsWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetsWidth: Self = this.set("setsWidth", js.undefined)
  }
}
