package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visible extends StObject {
  
  /**
    * Specifies the background color of the navigation bar.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Configure the navigation bar icons to have a light or dark color. Supported on Android Oreo and newer. Valid values: `'light-content'`, `'dark-content'`
    */
  var barStyle: js.UndefOr["light-content" | "dark-content"] = js.undefined
  
  /**
    * Determines how and when the navigation bar is shown. [Learn more](https://developer.android.com/training/system-ui/immersive). Requires `expo-navigation-bar` be installed in your project. Valid values: `leanback`, `immersive`, `sticky-immersive`
    *
    *  `leanback` results in the navigation bar being hidden until the first touch gesture is registered.
    *
    *  `immersive` results in the navigation bar being hidden until the user swipes up from the edge where the navigation bar is hidden.
    *
    *  `sticky-immersive` is identical to `'immersive'` except that the navigation bar will be semi-transparent and will be hidden again after a short period of time.
    */
  var visible: js.UndefOr["leanback" | "immersive" | "sticky-immersive"] = js.undefined
}
object Visible {
  
  inline def apply(): Visible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visible]
  }
  
  extension [Self <: Visible](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBarStyle(value: "light-content" | "dark-content"): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setVisible(value: "leanback" | "immersive" | "sticky-immersive"): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
