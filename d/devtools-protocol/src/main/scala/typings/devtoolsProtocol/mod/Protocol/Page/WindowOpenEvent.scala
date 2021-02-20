package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOpenEvent extends StObject {
  
  /**
    * The URL for the new window.
    */
  var url: String = js.native
  
  /**
    * Whether or not it was triggered by user gesture.
    */
  var userGesture: Boolean = js.native
  
  /**
    * An array of enabled window features.
    */
  var windowFeatures: js.Array[String] = js.native
  
  /**
    * Window name.
    */
  var windowName: String = js.native
}
object WindowOpenEvent {
  
  @scala.inline
  def apply(url: String, userGesture: Boolean, windowFeatures: js.Array[String], windowName: String): WindowOpenEvent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], userGesture = userGesture.asInstanceOf[js.Any], windowFeatures = windowFeatures.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOpenEvent]
  }
  
  @scala.inline
  implicit class WindowOpenEventMutableBuilder[Self <: WindowOpenEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGesture(value: Boolean): Self = StObject.set(x, "userGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowFeatures(value: js.Array[String]): Self = StObject.set(x, "windowFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowFeaturesVarargs(value: String*): Self = StObject.set(x, "windowFeatures", js.Array(value :_*))
    
    @scala.inline
    def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
  }
}
