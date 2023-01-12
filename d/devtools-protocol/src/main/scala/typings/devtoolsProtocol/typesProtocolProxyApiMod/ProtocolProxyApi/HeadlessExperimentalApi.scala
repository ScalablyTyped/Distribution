package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameRequest
import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadlessExperimentalApi extends StObject {
  
  /**
    * Sends a BeginFrame to the target and returns when the frame was completed. Optionally captures a
    * screenshot from the resulting frame. Requires that the target was created with enabled
    * BeginFrameControl. Designed for use with --run-all-compositor-stages-before-draw, see also
    * https://goo.gle/chrome-headless-rendering for more background.
    */
  def beginFrame(params: BeginFrameRequest): js.Promise[BeginFrameResponse]
  
  /**
    * Disables headless events for the target.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables headless events for the target.
    */
  def enable(): js.Promise[Unit]
}
object HeadlessExperimentalApi {
  
  inline def apply(
    beginFrame: BeginFrameRequest => js.Promise[BeginFrameResponse],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit]
  ): HeadlessExperimentalApi = {
    val __obj = js.Dynamic.literal(beginFrame = js.Any.fromFunction1(beginFrame), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[HeadlessExperimentalApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadlessExperimentalApi] (val x: Self) extends AnyVal {
    
    inline def setBeginFrame(value: BeginFrameRequest => js.Promise[BeginFrameResponse]): Self = StObject.set(x, "beginFrame", js.Any.fromFunction1(value))
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
  }
}
