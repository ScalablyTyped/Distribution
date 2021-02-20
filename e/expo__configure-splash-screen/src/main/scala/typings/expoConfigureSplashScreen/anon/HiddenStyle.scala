package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HiddenStyle extends StObject {
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[String] = js.native
}
object HiddenStyle {
  
  @scala.inline
  def apply(): HiddenStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenStyle]
  }
  
  @scala.inline
  implicit class HiddenStyleMutableBuilder[Self <: HiddenStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
