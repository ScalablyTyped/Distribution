package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigTypes.expoConfigTypesStrings.contain
import typings.expoConfigTypes.expoConfigTypesStrings.cover
import typings.expoConfigTypes.expoConfigTypesStrings.native
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mdpi
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Color to fill the loading screen background
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration for loading and splash screen for managed and standalone Android apps in dark mode.
    */
  var dark: js.UndefOr[Hdpi] = js.undefined
  
  /**
    * Local path or remote URL to an image to fill the background of the loading screen in "native" mode. Image size and aspect ratio are up to you. [Learn more]( https://developer.android.com/training/multiscreen/screendensities)
    *
    *  `Scale 1.5x`
    */
  var hdpi: js.UndefOr[String] = js.undefined
  
  /**
    * Local path or remote URL to an image to fill the background of the loading screen. Image size and aspect ratio are up to you. Must be a .png.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * Local path or remote URL to an image to fill the background of the loading screen in "native" mode. Image size and aspect ratio are up to you. [Learn more]( https://developer.android.com/training/multiscreen/screendensities)
    *
    *  `Natural sized image (baseline)`
    */
  var mdpi: js.UndefOr[String] = js.undefined
  
  /**
    * Determines how the `image` will be displayed in the splash loading screen. Must be one of `cover`, `contain` or `native`, defaults to `contain`.
    */
  var resizeMode: js.UndefOr[cover | contain | native] = js.undefined
  
  /**
    * Local path or remote URL to an image to fill the background of the loading screen in "native" mode. Image size and aspect ratio are up to you. [Learn more]( https://developer.android.com/training/multiscreen/screendensities)
    *
    *  `Scale 2x`
    */
  var xhdpi: js.UndefOr[String] = js.undefined
  
  /**
    * Local path or remote URL to an image to fill the background of the loading screen in "native" mode. Image size and aspect ratio are up to you. [Learn more]( https://developer.android.com/training/multiscreen/screendensities)
    *
    *  `Scale 3x`
    */
  var xxhdpi: js.UndefOr[String] = js.undefined
  
  /**
    * Local path or remote URL to an image to fill the background of the loading screen in "native" mode. Image size and aspect ratio are up to you. [Learn more]( https://developer.android.com/training/multiscreen/screendensities)
    *
    *  `Scale 4x`
    */
  var xxxhdpi: js.UndefOr[String] = js.undefined
}
object Mdpi {
  
  inline def apply(): Mdpi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mdpi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mdpi] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setDark(value: Hdpi): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setHdpi(value: String): Self = StObject.set(x, "hdpi", value.asInstanceOf[js.Any])
    
    inline def setHdpiUndefined: Self = StObject.set(x, "hdpi", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setMdpi(value: String): Self = StObject.set(x, "mdpi", value.asInstanceOf[js.Any])
    
    inline def setMdpiUndefined: Self = StObject.set(x, "mdpi", js.undefined)
    
    inline def setResizeMode(value: cover | contain | native): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    inline def setXhdpi(value: String): Self = StObject.set(x, "xhdpi", value.asInstanceOf[js.Any])
    
    inline def setXhdpiUndefined: Self = StObject.set(x, "xhdpi", js.undefined)
    
    inline def setXxhdpi(value: String): Self = StObject.set(x, "xxhdpi", value.asInstanceOf[js.Any])
    
    inline def setXxhdpiUndefined: Self = StObject.set(x, "xxhdpi", js.undefined)
    
    inline def setXxxhdpi(value: String): Self = StObject.set(x, "xxxhdpi", value.asInstanceOf[js.Any])
    
    inline def setXxxhdpiUndefined: Self = StObject.set(x, "xxxhdpi", js.undefined)
  }
}
