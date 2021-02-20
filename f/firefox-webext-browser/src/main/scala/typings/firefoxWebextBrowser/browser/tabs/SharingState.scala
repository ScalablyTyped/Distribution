package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tab sharing state for screen, microphone and camera. */
@js.native
trait SharingState extends StObject {
  
  /** True if the tab is using the camera. */
  var camera: Boolean = js.native
  
  /** True if the tab is using the microphone. */
  var microphone: Boolean = js.native
  
  /**
    * If the tab is sharing the screen the value will be one of "Screen", "Window", or "Application", or undefined if not screen sharing.
    */
  var screen: js.UndefOr[String] = js.native
}
object SharingState {
  
  @scala.inline
  def apply(camera: Boolean, microphone: Boolean): SharingState = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], microphone = microphone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharingState]
  }
  
  @scala.inline
  implicit class SharingStateMutableBuilder[Self <: SharingState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamera(value: Boolean): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrophone(value: Boolean): Self = StObject.set(x, "microphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
  }
}
