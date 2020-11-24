package typings.emberData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeId extends js.Object {
  
  var includeId: js.UndefOr[Boolean] = js.native
}
object IncludeId {
  
  @scala.inline
  def apply(): IncludeId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeId]
  }
  
  @scala.inline
  implicit class IncludeIdOps[Self <: IncludeId] (val x: Self) extends AnyVal {
    
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
    def setIncludeId(value: Boolean): Self = this.set("includeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeId: Self = this.set("includeId", js.undefined)
  }
}
