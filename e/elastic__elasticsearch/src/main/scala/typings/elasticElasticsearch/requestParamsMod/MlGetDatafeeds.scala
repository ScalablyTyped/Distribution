package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetDatafeeds extends Generic {
  
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.native
  
  var allow_no_match: js.UndefOr[Boolean] = js.native
  
  var datafeed_id: js.UndefOr[String] = js.native
}
object MlGetDatafeeds {
  
  @scala.inline
  def apply(): MlGetDatafeeds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetDatafeeds]
  }
  
  @scala.inline
  implicit class MlGetDatafeedsOps[Self <: MlGetDatafeeds] (val x: Self) extends AnyVal {
    
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
    def setAllow_no_datafeeds(value: Boolean): Self = this.set("allow_no_datafeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_datafeeds: Self = this.set("allow_no_datafeeds", js.undefined)
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = this.set("allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_match: Self = this.set("allow_no_match", js.undefined)
    
    @scala.inline
    def setDatafeed_id(value: String): Self = this.set("datafeed_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatafeed_id: Self = this.set("datafeed_id", js.undefined)
  }
}
