package typings.gematriya.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geresh extends js.Object {
  
  var geresh: js.UndefOr[Boolean] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var punctuate: js.UndefOr[Boolean] = js.native
}
object Geresh {
  
  @scala.inline
  def apply(): Geresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geresh]
  }
  
  @scala.inline
  implicit class GereshOps[Self <: Geresh] (val x: Self) extends AnyVal {
    
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
    def setGeresh(value: Boolean): Self = this.set("geresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeresh: Self = this.set("geresh", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setPunctuate(value: Boolean): Self = this.set("punctuate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePunctuate: Self = this.set("punctuate", js.undefined)
  }
}
