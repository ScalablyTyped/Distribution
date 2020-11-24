package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.playerErrorsRaised
import typings.devtoolsProtocol.devtoolsProtocolStrings.playerEventsAdded
import typings.devtoolsProtocol.devtoolsProtocolStrings.playerMessagesLogged
import typings.devtoolsProtocol.devtoolsProtocolStrings.playerPropertiesChanged
import typings.devtoolsProtocol.devtoolsProtocolStrings.playersCreated
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerErrorsRaisedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerEventsAddedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerMessagesLoggedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerPropertiesChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayersCreatedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaApi extends js.Object {
  
  /**
    * Disables the Media domain.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables the Media domain
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Send a list of any errors that need to be delivered.
    */
  @JSName("on")
  def on_playerErrorsRaised(event: playerErrorsRaised, listener: js.Function1[/* params */ PlayerErrorsRaisedEvent, Unit]): Unit = js.native
  /**
    * Send events as a list, allowing them to be batched on the browser for less
    * congestion. If batched, events must ALWAYS be in chronological order.
    */
  @JSName("on")
  def on_playerEventsAdded(event: playerEventsAdded, listener: js.Function1[/* params */ PlayerEventsAddedEvent, Unit]): Unit = js.native
  /**
    * Send a list of any messages that need to be delivered.
    */
  @JSName("on")
  def on_playerMessagesLogged(event: playerMessagesLogged, listener: js.Function1[/* params */ PlayerMessagesLoggedEvent, Unit]): Unit = js.native
  /**
    * This can be called multiple times, and can be used to set / override /
    * remove player properties. A null propValue indicates removal.
    */
  @JSName("on")
  def on_playerPropertiesChanged(
    event: playerPropertiesChanged,
    listener: js.Function1[/* params */ PlayerPropertiesChangedEvent, Unit]
  ): Unit = js.native
  /**
    * Called whenever a player is created, or when a new agent joins and recieves
    * a list of active players. If an agent is restored, it will recieve the full
    * list of player ids and all events again.
    */
  @JSName("on")
  def on_playersCreated(event: playersCreated, listener: js.Function1[/* params */ PlayersCreatedEvent, Unit]): Unit = js.native
}
