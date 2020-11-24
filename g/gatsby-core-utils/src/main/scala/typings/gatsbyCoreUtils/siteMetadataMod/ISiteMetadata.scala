package typings.gatsbyCoreUtils.siteMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISiteMetadata extends js.Object {
  
  var lastRun: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pid: js.UndefOr[Double] = js.native
  
  var sitePath: String = js.native
}
object ISiteMetadata {
  
  @scala.inline
  def apply(sitePath: String): ISiteMetadata = {
    val __obj = js.Dynamic.literal(sitePath = sitePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISiteMetadata]
  }
  
  @scala.inline
  implicit class ISiteMetadataOps[Self <: ISiteMetadata] (val x: Self) extends AnyVal {
    
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
    def setSitePath(value: String): Self = this.set("sitePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRun(value: Double): Self = this.set("lastRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRun: Self = this.set("lastRun", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePid: Self = this.set("pid", js.undefined)
  }
}
