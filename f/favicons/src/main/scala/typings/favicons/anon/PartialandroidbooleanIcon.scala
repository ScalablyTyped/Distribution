package typings.favicons.anon

import typings.favicons.mod.IconOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  android :boolean | favicons.favicons.IconOptions,   appleIcon :boolean | favicons.favicons.IconOptions,   appleStartup :boolean | favicons.favicons.IconOptions,   coast :boolean | favicons.favicons.IconOptions,   favicons :boolean | favicons.favicons.IconOptions,   firefox :boolean | favicons.favicons.IconOptions,   windows :boolean | favicons.favicons.IconOptions,   yandex :boolean | favicons.favicons.IconOptions}> */
@js.native
trait PartialandroidbooleanIcon extends js.Object {
  
  var android: js.UndefOr[Boolean | IconOptions] = js.native
  
  var appleIcon: js.UndefOr[Boolean | IconOptions] = js.native
  
  var appleStartup: js.UndefOr[Boolean | IconOptions] = js.native
  
  var coast: js.UndefOr[Boolean | IconOptions] = js.native
  
  var favicons: js.UndefOr[Boolean | IconOptions] = js.native
  
  var firefox: js.UndefOr[Boolean | IconOptions] = js.native
  
  var windows: js.UndefOr[Boolean | IconOptions] = js.native
  
  var yandex: js.UndefOr[Boolean | IconOptions] = js.native
}
object PartialandroidbooleanIcon {
  
  @scala.inline
  def apply(): PartialandroidbooleanIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialandroidbooleanIcon]
  }
  
  @scala.inline
  implicit class PartialandroidbooleanIconOps[Self <: PartialandroidbooleanIcon] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: Boolean | IconOptions): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    
    @scala.inline
    def setAppleIcon(value: Boolean | IconOptions): Self = this.set("appleIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppleIcon: Self = this.set("appleIcon", js.undefined)
    
    @scala.inline
    def setAppleStartup(value: Boolean | IconOptions): Self = this.set("appleStartup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppleStartup: Self = this.set("appleStartup", js.undefined)
    
    @scala.inline
    def setCoast(value: Boolean | IconOptions): Self = this.set("coast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoast: Self = this.set("coast", js.undefined)
    
    @scala.inline
    def setFavicons(value: Boolean | IconOptions): Self = this.set("favicons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavicons: Self = this.set("favicons", js.undefined)
    
    @scala.inline
    def setFirefox(value: Boolean | IconOptions): Self = this.set("firefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirefox: Self = this.set("firefox", js.undefined)
    
    @scala.inline
    def setWindows(value: Boolean | IconOptions): Self = this.set("windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindows: Self = this.set("windows", js.undefined)
    
    @scala.inline
    def setYandex(value: Boolean | IconOptions): Self = this.set("yandex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYandex: Self = this.set("yandex", js.undefined)
  }
}
