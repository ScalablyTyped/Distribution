package typings.expoConfigTypes.anon

import typings.expoConfigTypes.expoConfigTypesStrings.`dark-content`
import typings.expoConfigTypes.expoConfigTypesStrings.`light-content`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarStyle extends StObject {
  
  /**
    * Specifies the background color of the status bar. Defaults to `#00000000` (transparent) for `dark-content` bar style and `#00000088` (semi-transparent black) for `light-content` bar style
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the status bar icons to have a light or dark color. Valid values: `light-content`, `dark-content`. Defaults to `dark-content`
    */
  var barStyle: js.UndefOr[`light-content` | `dark-content`] = js.undefined
  
  /**
    * Instructs the system whether the status bar should be visible or not. Defaults to `false`
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets `android:windowTranslucentStatus` in `styles.xml`. When false, the system status bar pushes the content of your app down (similar to `position: relative`). When true, the status bar floats above the content in your app (similar to `position: absolute`). Defaults to `true` to match the iOS status bar behavior (which can only float above content).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object BarStyle {
  
  inline def apply(): BarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarStyle]
  }
  
  extension [Self <: BarStyle](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBarStyle(value: `light-content` | `dark-content`): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
