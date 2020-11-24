package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BidProtocol extends js.Object {
  
  var bidProtocol: js.UndefOr[String] = js.native
  
  var maximumQps: js.UndefOr[Double] = js.native
  
  var region: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object BidProtocol {
  
  @scala.inline
  def apply(): BidProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BidProtocol]
  }
  
  @scala.inline
  implicit class BidProtocolOps[Self <: BidProtocol] (val x: Self) extends AnyVal {
    
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
    def setBidProtocol(value: String): Self = this.set("bidProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidProtocol: Self = this.set("bidProtocol", js.undefined)
    
    @scala.inline
    def setMaximumQps(value: Double): Self = this.set("maximumQps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumQps: Self = this.set("maximumQps", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
