package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBar extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var statusBar: js.UndefOr[`0`] = js.undefined
}
object StatusBar {
  
  @scala.inline
  def apply(): StatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBar]
  }
  
  @scala.inline
  implicit class StatusBarMutableBuilder[Self <: StatusBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setStatusBar(value: `0`): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
  }
}
