package typings.ethersprojectProviders.formatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommunityResourcable extends js.Object {
  
  def isCommunityResource(): Boolean = js.native
}
object CommunityResourcable {
  
  @scala.inline
  def apply(isCommunityResource: () => Boolean): CommunityResourcable = {
    val __obj = js.Dynamic.literal(isCommunityResource = js.Any.fromFunction0(isCommunityResource))
    __obj.asInstanceOf[CommunityResourcable]
  }
  
  @scala.inline
  implicit class CommunityResourcableOps[Self <: CommunityResourcable] (val x: Self) extends AnyVal {
    
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
    def setIsCommunityResource(value: () => Boolean): Self = this.set("isCommunityResource", js.Any.fromFunction0(value))
  }
}
