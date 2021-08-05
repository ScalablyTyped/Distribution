package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.CaptureSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.CaptureSnapshotResponse
import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMSnapshotApi extends StObject {
  
  /**
    * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
    * template contents, and imported documents) in a flattened array, as well as layout and
    * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
    * flattened.
    */
  def captureSnapshot(params: CaptureSnapshotRequest): js.Promise[CaptureSnapshotResponse]
  
  /**
    * Disables DOM snapshot agent for the given page.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables DOM snapshot agent for the given page.
    */
  def enable(): js.Promise[Unit]
  
  /**
    * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
    * template contents, and imported documents) in a flattened array, as well as layout and
    * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
    * flattened.
    */
  def getSnapshot(params: GetSnapshotRequest): js.Promise[GetSnapshotResponse]
}
object DOMSnapshotApi {
  
  inline def apply(
    captureSnapshot: CaptureSnapshotRequest => js.Promise[CaptureSnapshotResponse],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getSnapshot: GetSnapshotRequest => js.Promise[GetSnapshotResponse]
  ): DOMSnapshotApi = {
    val __obj = js.Dynamic.literal(captureSnapshot = js.Any.fromFunction1(captureSnapshot), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getSnapshot = js.Any.fromFunction1(getSnapshot))
    __obj.asInstanceOf[DOMSnapshotApi]
  }
  
  extension [Self <: DOMSnapshotApi](x: Self) {
    
    inline def setCaptureSnapshot(value: CaptureSnapshotRequest => js.Promise[CaptureSnapshotResponse]): Self = StObject.set(x, "captureSnapshot", js.Any.fromFunction1(value))
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setGetSnapshot(value: GetSnapshotRequest => js.Promise[GetSnapshotResponse]): Self = StObject.set(x, "getSnapshot", js.Any.fromFunction1(value))
  }
}
