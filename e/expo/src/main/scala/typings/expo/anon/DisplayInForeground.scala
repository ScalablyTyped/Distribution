package typings.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayInForeground extends StObject {
  
  var _displayInForeground: js.UndefOr[Boolean] = js.native
  
  var sound: js.UndefOr[Boolean] = js.native
}
object DisplayInForeground {
  
  @scala.inline
  def apply(): DisplayInForeground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayInForeground]
  }
  
  @scala.inline
  implicit class DisplayInForegroundMutableBuilder[Self <: DisplayInForeground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    @scala.inline
    def set_displayInForeground(value: Boolean): Self = StObject.set(x, "_displayInForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_displayInForegroundUndefined: Self = StObject.set(x, "_displayInForeground", js.undefined)
  }
}
