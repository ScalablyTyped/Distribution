package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.CaptureSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.CaptureSnapshotResponse
import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMSnapshotApi extends js.Object {
  
  /**
    * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
    * template contents, and imported documents) in a flattened array, as well as layout and
    * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
    * flattened.
    */
  def captureSnapshot(params: CaptureSnapshotRequest): js.Promise[CaptureSnapshotResponse] = js.native
  
  /**
    * Disables DOM snapshot agent for the given page.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables DOM snapshot agent for the given page.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
    * template contents, and imported documents) in a flattened array, as well as layout and
    * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
    * flattened.
    */
  def getSnapshot(params: GetSnapshotRequest): js.Promise[GetSnapshotResponse] = js.native
}
object DOMSnapshotApi {
  
  @scala.inline
  def apply(
    captureSnapshot: CaptureSnapshotRequest => js.Promise[CaptureSnapshotResponse],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getSnapshot: GetSnapshotRequest => js.Promise[GetSnapshotResponse]
  ): DOMSnapshotApi = {
    val __obj = js.Dynamic.literal(captureSnapshot = js.Any.fromFunction1(captureSnapshot), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getSnapshot = js.Any.fromFunction1(getSnapshot))
    __obj.asInstanceOf[DOMSnapshotApi]
  }
  
  @scala.inline
  implicit class DOMSnapshotApiOps[Self <: DOMSnapshotApi] (val x: Self) extends AnyVal {
    
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
    def setCaptureSnapshot(value: CaptureSnapshotRequest => js.Promise[CaptureSnapshotResponse]): Self = this.set("captureSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSnapshot(value: GetSnapshotRequest => js.Promise[GetSnapshotResponse]): Self = this.set("getSnapshot", js.Any.fromFunction1(value))
  }
}
