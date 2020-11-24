package typings.firebase.mod.firebase.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsOptions extends js.Object {
  
  /** Sets custom name for `dataLayer` array used by gtag. */
  var dataLayerName: js.UndefOr[String] = js.native
  
  /** Sets custom name for `gtag` function. */
  var gtagName: js.UndefOr[String] = js.native
}
object SettingsOptions {
  
  @scala.inline
  def apply(): SettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsOptions]
  }
  
  @scala.inline
  implicit class SettingsOptionsOps[Self <: SettingsOptions] (val x: Self) extends AnyVal {
    
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
    def setDataLayerName(value: String): Self = this.set("dataLayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLayerName: Self = this.set("dataLayerName", js.undefined)
    
    @scala.inline
    def setGtagName(value: String): Self = this.set("gtagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGtagName: Self = this.set("gtagName", js.undefined)
  }
}
