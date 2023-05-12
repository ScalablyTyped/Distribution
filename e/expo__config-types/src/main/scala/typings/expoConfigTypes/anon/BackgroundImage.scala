package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImage extends StObject {
  
  /**
    * Color to use as the background for your app's Adaptive Icon on Android. Defaults to white, `#FFFFFF`. Has no effect if `foregroundImage` is not specified.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Local path or remote URL to a background image for your app's Adaptive Icon on Android. If specified, this overrides the `backgroundColor` key. Must have the same dimensions as `foregroundImage`, and has no effect if `foregroundImage` is not specified. Should follow the [specified guidelines](https://developer.android.com/guide/practices/ui_guidelines/icon_design_adaptive).
    */
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  /**
    * Local path or remote URL to an image to use for your app's icon on Android. If specified, this overrides the top-level `icon` and the `android.icon` keys. Should follow the [specified guidelines](https://developer.android.com/guide/practices/ui_guidelines/icon_design_adaptive). This icon will appear on the home screen.
    */
  var foregroundImage: js.UndefOr[String] = js.undefined
  
  /**
    * Local path or remote URL to an image representing the Android 13+ monochromatic icon. Should follow the [specified guidelines](https://developer.android.com/guide/practices/ui_guidelines/icon_design_adaptive). This icon will appear on the home screen when the user enables 'Themed icons' in system settings on a device running Android 13+.
    */
  var monochromeImage: js.UndefOr[String] = js.undefined
}
object BackgroundImage {
  
  inline def apply(): BackgroundImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundImage] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setForegroundImage(value: String): Self = StObject.set(x, "foregroundImage", value.asInstanceOf[js.Any])
    
    inline def setForegroundImageUndefined: Self = StObject.set(x, "foregroundImage", js.undefined)
    
    inline def setMonochromeImage(value: String): Self = StObject.set(x, "monochromeImage", value.asInstanceOf[js.Any])
    
    inline def setMonochromeImageUndefined: Self = StObject.set(x, "monochromeImage", js.undefined)
  }
}
