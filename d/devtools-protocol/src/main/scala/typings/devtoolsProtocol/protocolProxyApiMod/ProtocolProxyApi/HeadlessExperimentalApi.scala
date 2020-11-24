package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.needsBeginFramesChanged
import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameRequest
import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameResponse
import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.NeedsBeginFramesChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadlessExperimentalApi extends js.Object {
  
  /**
    * Sends a BeginFrame to the target and returns when the frame was completed. Optionally captures a
    * screenshot from the resulting frame. Requires that the target was created with enabled
    * BeginFrameControl. Designed for use with --run-all-compositor-stages-before-draw, see also
    * https://goo.gl/3zHXhB for more background.
    */
  def beginFrame(params: BeginFrameRequest): js.Promise[BeginFrameResponse] = js.native
  
  /**
    * Disables headless events for the target.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables headless events for the target.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Issued when the target starts or stops needing BeginFrames.
    * Deprecated. Issue beginFrame unconditionally instead and use result from
    * beginFrame to detect whether the frames were suppressed.
    */
  @JSName("on")
  def on_needsBeginFramesChanged(
    event: needsBeginFramesChanged,
    listener: js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]
  ): Unit = js.native
}
object HeadlessExperimentalApi {
  
  @scala.inline
  def apply(
    beginFrame: BeginFrameRequest => js.Promise[BeginFrameResponse],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    on: (needsBeginFramesChanged, js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]) => Unit
  ): HeadlessExperimentalApi = {
    val __obj = js.Dynamic.literal(beginFrame = js.Any.fromFunction1(beginFrame), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[HeadlessExperimentalApi]
  }
  
  @scala.inline
  implicit class HeadlessExperimentalApiOps[Self <: HeadlessExperimentalApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeginFrame(value: BeginFrameRequest => js.Promise[BeginFrameResponse]): Self = this.set("beginFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(
      value: (needsBeginFramesChanged, js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]) => Unit
    ): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
