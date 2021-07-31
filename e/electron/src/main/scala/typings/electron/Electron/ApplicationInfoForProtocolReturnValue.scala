package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationInfoForProtocolReturnValue extends StObject {
  
  /**
    * the display icon of the app handling the protocol.
    */
  var icon: NativeImage_
  
  /**
    * display name of the app handling the protocol.
    */
  var name: String
  
  /**
    * installation path of the app handling the protocol.
    */
  var path: String
}
object ApplicationInfoForProtocolReturnValue {
  
  @scala.inline
  def apply(icon: NativeImage_, name: String, path: String): ApplicationInfoForProtocolReturnValue = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInfoForProtocolReturnValue]
  }
  
  @scala.inline
  implicit class ApplicationInfoForProtocolReturnValueMutableBuilder[Self <: ApplicationInfoForProtocolReturnValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
