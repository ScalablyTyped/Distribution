package typings.dexie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeLowers extends js.Object {
  
  var includeLowers: js.UndefOr[Boolean] = js.native
  
  var includeUppers: js.UndefOr[Boolean] = js.native
}
object IncludeLowers {
  
  @scala.inline
  def apply(): IncludeLowers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeLowers]
  }
  
  @scala.inline
  implicit class IncludeLowersOps[Self <: IncludeLowers] (val x: Self) extends AnyVal {
    
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
    def setIncludeLowers(value: Boolean): Self = this.set("includeLowers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeLowers: Self = this.set("includeLowers", js.undefined)
    
    @scala.inline
    def setIncludeUppers(value: Boolean): Self = this.set("includeUppers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUppers: Self = this.set("includeUppers", js.undefined)
  }
}
