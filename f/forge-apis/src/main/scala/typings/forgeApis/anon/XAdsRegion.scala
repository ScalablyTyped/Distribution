package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAdsRegion extends js.Object {
  
  var xAdsRegion: js.UndefOr[String] = js.native
}
object XAdsRegion {
  
  @scala.inline
  def apply(): XAdsRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAdsRegion]
  }
  
  @scala.inline
  implicit class XAdsRegionOps[Self <: XAdsRegion] (val x: Self) extends AnyVal {
    
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
    def setXAdsRegion(value: String): Self = this.set("xAdsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAdsRegion: Self = this.set("xAdsRegion", js.undefined)
  }
}
