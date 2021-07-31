package typings.expoConfigureSplashScreen.anon

import typings.expoConfigureSplashScreen.constantsMod.SplashScreenStatusBarStyleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var style: js.UndefOr[SplashScreenStatusBarStyleType] = js.undefined
}
object `4` {
  
  @scala.inline
  def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: SplashScreenStatusBarStyleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
