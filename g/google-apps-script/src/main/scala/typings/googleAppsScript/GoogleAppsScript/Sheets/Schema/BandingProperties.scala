package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BandingProperties extends js.Object {
  
  var firstBandColor: js.UndefOr[Color] = js.native
  
  var footerColor: js.UndefOr[Color] = js.native
  
  var headerColor: js.UndefOr[Color] = js.native
  
  var secondBandColor: js.UndefOr[Color] = js.native
}
object BandingProperties {
  
  @scala.inline
  def apply(): BandingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandingProperties]
  }
  
  @scala.inline
  implicit class BandingPropertiesOps[Self <: BandingProperties] (val x: Self) extends AnyVal {
    
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
    def setFirstBandColor(value: Color): Self = this.set("firstBandColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstBandColor: Self = this.set("firstBandColor", js.undefined)
    
    @scala.inline
    def setFooterColor(value: Color): Self = this.set("footerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterColor: Self = this.set("footerColor", js.undefined)
    
    @scala.inline
    def setHeaderColor(value: Color): Self = this.set("headerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderColor: Self = this.set("headerColor", js.undefined)
    
    @scala.inline
    def setSecondBandColor(value: Color): Self = this.set("secondBandColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondBandColor: Self = this.set("secondBandColor", js.undefined)
  }
}
