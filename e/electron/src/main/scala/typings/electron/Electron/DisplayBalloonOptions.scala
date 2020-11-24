package typings.electron.Electron

import typings.electron.electronStrings.custom
import typings.electron.electronStrings.error
import typings.electron.electronStrings.info
import typings.electron.electronStrings.none
import typings.electron.electronStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayBalloonOptions extends js.Object {
  
  var content: String = js.native
  
  /**
    * Icon to use when `iconType` is `custom`.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  
  /**
    * Can be `none`, `info`, `warning`, `error` or `custom`. Default is `custom`.
    */
  var iconType: js.UndefOr[none | info | warning | error | custom] = js.native
  
  /**
    * The large version of the icon should be used. Default is `true`. Maps to
    * `NIIF_LARGE_ICON`.
    */
  var largeIcon: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not play the associated sound. Default is `false`. Maps to `NIIF_NOSOUND`.
    */
  var noSound: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not display the balloon notification if the current user is in "quiet time".
    * Default is `false`. Maps to `NIIF_RESPECT_QUIET_TIME`.
    */
  var respectQuietTime: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
}
object DisplayBalloonOptions {
  
  @scala.inline
  def apply(content: String, title: String): DisplayBalloonOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayBalloonOptions]
  }
  
  @scala.inline
  implicit class DisplayBalloonOptionsOps[Self <: DisplayBalloonOptions] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconType(value: none | info | warning | error | custom): Self = this.set("iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconType: Self = this.set("iconType", js.undefined)
    
    @scala.inline
    def setLargeIcon(value: Boolean): Self = this.set("largeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeIcon: Self = this.set("largeIcon", js.undefined)
    
    @scala.inline
    def setNoSound(value: Boolean): Self = this.set("noSound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSound: Self = this.set("noSound", js.undefined)
    
    @scala.inline
    def setRespectQuietTime(value: Boolean): Self = this.set("respectQuietTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespectQuietTime: Self = this.set("respectQuietTime", js.undefined)
  }
}
