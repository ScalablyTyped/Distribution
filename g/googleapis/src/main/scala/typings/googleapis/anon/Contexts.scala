package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contexts extends js.Object {
  
  var contexts: js.UndefOr[js.Array[AuctionType]] = js.native
  
  var details: js.UndefOr[js.Array[String]] = js.native
  
  var reason: js.UndefOr[String] = js.native
}
object Contexts {
  
  @scala.inline
  def apply(): Contexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contexts]
  }
  
  @scala.inline
  implicit class ContextsOps[Self <: Contexts] (val x: Self) extends AnyVal {
    
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
    def setContextsVarargs(value: AuctionType*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[AuctionType]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: String*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[String]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
