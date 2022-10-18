package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.layerPainted
import typings.devtoolsProtocol.devtoolsProtocolStrings.layerTreeDidChange
import typings.devtoolsProtocol.mod.Protocol.LayerTree.CompositingReasonsRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.CompositingReasonsResponse
import typings.devtoolsProtocol.mod.Protocol.LayerTree.LayerPaintedEvent
import typings.devtoolsProtocol.mod.Protocol.LayerTree.LayerTreeDidChangeEvent
import typings.devtoolsProtocol.mod.Protocol.LayerTree.LoadSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.LoadSnapshotResponse
import typings.devtoolsProtocol.mod.Protocol.LayerTree.MakeSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.MakeSnapshotResponse
import typings.devtoolsProtocol.mod.Protocol.LayerTree.ProfileSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.ProfileSnapshotResponse
import typings.devtoolsProtocol.mod.Protocol.LayerTree.ReleaseSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.ReplaySnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.ReplaySnapshotResponse
import typings.devtoolsProtocol.mod.Protocol.LayerTree.SnapshotCommandLogRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.SnapshotCommandLogResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerTreeApi extends StObject {
  
  /**
    * Provides the reasons why the given layer was composited.
    */
  def compositingReasons(params: CompositingReasonsRequest): js.Promise[CompositingReasonsResponse] = js.native
  
  /**
    * Disables compositing tree inspection.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables compositing tree inspection.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Returns the snapshot identifier.
    */
  def loadSnapshot(params: LoadSnapshotRequest): js.Promise[LoadSnapshotResponse] = js.native
  
  /**
    * Returns the layer snapshot identifier.
    */
  def makeSnapshot(params: MakeSnapshotRequest): js.Promise[MakeSnapshotResponse] = js.native
  
  @JSName("on")
  def on_layerPainted(event: layerPainted, listener: js.Function1[/* params */ LayerPaintedEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_layerTreeDidChange(event: layerTreeDidChange, listener: js.Function1[/* params */ LayerTreeDidChangeEvent, Unit]): Unit = js.native
  
  def profileSnapshot(params: ProfileSnapshotRequest): js.Promise[ProfileSnapshotResponse] = js.native
  
  /**
    * Releases layer snapshot captured by the back-end.
    */
  def releaseSnapshot(params: ReleaseSnapshotRequest): js.Promise[Unit] = js.native
  
  /**
    * Replays the layer snapshot and returns the resulting bitmap.
    */
  def replaySnapshot(params: ReplaySnapshotRequest): js.Promise[ReplaySnapshotResponse] = js.native
  
  /**
    * Replays the layer snapshot and returns canvas log.
    */
  def snapshotCommandLog(params: SnapshotCommandLogRequest): js.Promise[SnapshotCommandLogResponse] = js.native
}
