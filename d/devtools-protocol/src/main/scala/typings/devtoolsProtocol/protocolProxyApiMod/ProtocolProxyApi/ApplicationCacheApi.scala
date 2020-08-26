package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.applicationCacheStatusUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.networkStateUpdated
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCacheStatusUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetApplicationCacheForFrameRequest
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetApplicationCacheForFrameResponse
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetFramesWithManifestsResponse
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetManifestForFrameRequest
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.GetManifestForFrameResponse
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.NetworkStateUpdatedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCacheApi extends js.Object {
  /**
    * Enables application cache domain notifications.
    */
  def enable(): js.Promise[Unit] = js.native
  /**
    * Returns relevant application cache data for the document in given frame.
    */
  def getApplicationCacheForFrame(params: GetApplicationCacheForFrameRequest): js.Promise[GetApplicationCacheForFrameResponse] = js.native
  /**
    * Returns array of frame identifiers with manifest urls for each frame containing a document
    * associated with some application cache.
    */
  def getFramesWithManifests(): js.Promise[GetFramesWithManifestsResponse] = js.native
  /**
    * Returns manifest URL for document in the given frame.
    */
  def getManifestForFrame(params: GetManifestForFrameRequest): js.Promise[GetManifestForFrameResponse] = js.native
  @JSName("on")
  def on_applicationCacheStatusUpdated(
    event: applicationCacheStatusUpdated,
    listener: js.Function1[/* params */ ApplicationCacheStatusUpdatedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_networkStateUpdated(event: networkStateUpdated, listener: js.Function1[/* params */ NetworkStateUpdatedEvent, Unit]): Unit = js.native
}

