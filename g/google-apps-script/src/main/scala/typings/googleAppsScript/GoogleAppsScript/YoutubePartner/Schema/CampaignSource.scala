package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignSource extends js.Object {
  
  var sourceType: js.UndefOr[String] = js.native
  
  var sourceValue: js.UndefOr[js.Array[String]] = js.native
}
object CampaignSource {
  
  @scala.inline
  def apply(): CampaignSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignSource]
  }
  
  @scala.inline
  implicit class CampaignSourceOps[Self <: CampaignSource] (val x: Self) extends AnyVal {
    
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
    def setSourceType(value: String): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    
    @scala.inline
    def setSourceValueVarargs(value: String*): Self = this.set("sourceValue", js.Array(value :_*))
    
    @scala.inline
    def setSourceValue(value: js.Array[String]): Self = this.set("sourceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceValue: Self = this.set("sourceValue", js.undefined)
  }
}
