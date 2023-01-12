package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.anon.BackgroundColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'androidStatusBar'> */
trait PickExpoConfigandroidStat extends StObject {
  
  var androidStatusBar: js.UndefOr[BackgroundColor] = js.undefined
}
object PickExpoConfigandroidStat {
  
  inline def apply(): PickExpoConfigandroidStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigandroidStat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigandroidStat] (val x: Self) extends AnyVal {
    
    inline def setAndroidStatusBar(value: BackgroundColor): Self = StObject.set(x, "androidStatusBar", value.asInstanceOf[js.Any])
    
    inline def setAndroidStatusBarUndefined: Self = StObject.set(x, "androidStatusBar", js.undefined)
  }
}
