package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoContentDetailsRegionRestriction extends js.Object {
  
  var allowed: js.UndefOr[js.Array[String]] = js.native
  
  var blocked: js.UndefOr[js.Array[String]] = js.native
}
object VideoContentDetailsRegionRestriction {
  
  @scala.inline
  def apply(): VideoContentDetailsRegionRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContentDetailsRegionRestriction]
  }
  
  @scala.inline
  implicit class VideoContentDetailsRegionRestrictionOps[Self <: VideoContentDetailsRegionRestriction] (val x: Self) extends AnyVal {
    
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
    def setAllowedVarargs(value: String*): Self = this.set("allowed", js.Array(value :_*))
    
    @scala.inline
    def setAllowed(value: js.Array[String]): Self = this.set("allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed: Self = this.set("allowed", js.undefined)
    
    @scala.inline
    def setBlockedVarargs(value: String*): Self = this.set("blocked", js.Array(value :_*))
    
    @scala.inline
    def setBlocked(value: js.Array[String]): Self = this.set("blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocked: Self = this.set("blocked", js.undefined)
  }
}
