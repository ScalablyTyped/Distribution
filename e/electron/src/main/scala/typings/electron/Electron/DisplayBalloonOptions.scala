package typings.electron.Electron

import typings.electron.electronStrings.custom
import typings.electron.electronStrings.error
import typings.electron.electronStrings.info
import typings.electron.electronStrings.none
import typings.electron.electronStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayBalloonOptions extends StObject {
  
  var content: String
  
  /**
    * Icon to use when `iconType` is `custom`.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.undefined
  
  /**
    * Can be `none`, `info`, `warning`, `error` or `custom`. Default is `custom`.
    */
  var iconType: js.UndefOr[none | info | warning | error | custom] = js.undefined
  
  /**
    * The large version of the icon should be used. Default is `true`. Maps to
    * `NIIF_LARGE_ICON`.
    */
  var largeIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not play the associated sound. Default is `false`. Maps to `NIIF_NOSOUND`.
    */
  var noSound: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not display the balloon notification if the current user is in "quiet time".
    * Default is `false`. Maps to `NIIF_RESPECT_QUIET_TIME`.
    */
  var respectQuietTime: js.UndefOr[Boolean] = js.undefined
  
  var title: String
}
object DisplayBalloonOptions {
  
  inline def apply(content: String, title: String): DisplayBalloonOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayBalloonOptions]
  }
  
  extension [Self <: DisplayBalloonOptions](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconType(value: none | info | warning | error | custom): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLargeIcon(value: Boolean): Self = StObject.set(x, "largeIcon", value.asInstanceOf[js.Any])
    
    inline def setLargeIconUndefined: Self = StObject.set(x, "largeIcon", js.undefined)
    
    inline def setNoSound(value: Boolean): Self = StObject.set(x, "noSound", value.asInstanceOf[js.Any])
    
    inline def setNoSoundUndefined: Self = StObject.set(x, "noSound", js.undefined)
    
    inline def setRespectQuietTime(value: Boolean): Self = StObject.set(x, "respectQuietTime", value.asInstanceOf[js.Any])
    
    inline def setRespectQuietTimeUndefined: Self = StObject.set(x, "respectQuietTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
