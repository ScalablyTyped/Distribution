package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.prefetchStatusUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.preloadEnabledStateUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.preloadingAttemptSourcesUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.prerenderAttemptCompleted
import typings.devtoolsProtocol.devtoolsProtocolStrings.prerenderStatusUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.ruleSetRemoved
import typings.devtoolsProtocol.devtoolsProtocolStrings.ruleSetUpdated
import typings.devtoolsProtocol.mod.Protocol.Preload.PrefetchStatusUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.PreloadEnabledStateUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.PreloadingAttemptSourcesUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.PrerenderAttemptCompletedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.PrerenderStatusUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.RuleSetRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.RuleSetUpdatedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreloadApi extends StObject {
  
  def disable(): js.Promise[Unit] = js.native
  
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Fired when a prefetch attempt is updated.
    */
  @JSName("on")
  def on_prefetchStatusUpdated(
    event: prefetchStatusUpdated,
    listener: js.Function1[/* params */ PrefetchStatusUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when a preload enabled state is updated.
    */
  @JSName("on")
  def on_preloadEnabledStateUpdated(
    event: preloadEnabledStateUpdated,
    listener: js.Function1[/* params */ PreloadEnabledStateUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * Send a list of sources for all preloading attempts in a document.
    */
  @JSName("on")
  def on_preloadingAttemptSourcesUpdated(
    event: preloadingAttemptSourcesUpdated,
    listener: js.Function1[/* params */ PreloadingAttemptSourcesUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when a prerender attempt is completed.
    */
  @JSName("on")
  def on_prerenderAttemptCompleted(
    event: prerenderAttemptCompleted,
    listener: js.Function1[/* params */ PrerenderAttemptCompletedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when a prerender attempt is updated.
    */
  @JSName("on")
  def on_prerenderStatusUpdated(
    event: prerenderStatusUpdated,
    listener: js.Function1[/* params */ PrerenderStatusUpdatedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ruleSetRemoved(event: ruleSetRemoved, listener: js.Function1[/* params */ RuleSetRemovedEvent, Unit]): Unit = js.native
  /**
    * Upsert. Currently, it is only emitted when a rule set added.
    */
  @JSName("on")
  def on_ruleSetUpdated(event: ruleSetUpdated, listener: js.Function1[/* params */ RuleSetUpdatedEvent, Unit]): Unit = js.native
}
