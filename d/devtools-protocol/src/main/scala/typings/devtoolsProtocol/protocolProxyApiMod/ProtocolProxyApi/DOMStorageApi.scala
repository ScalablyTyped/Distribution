package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.domStorageItemAdded
import typings.devtoolsProtocol.devtoolsProtocolStrings.domStorageItemRemoved
import typings.devtoolsProtocol.devtoolsProtocolStrings.domStorageItemUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.domStorageItemsCleared
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.ClearRequest
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemAddedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemsClearedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.GetDOMStorageItemsRequest
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.GetDOMStorageItemsResponse
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.RemoveDOMStorageItemRequest
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.SetDOMStorageItemRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMStorageApi extends StObject {
  
  def clear(params: ClearRequest): js.Promise[Unit] = js.native
  
  /**
    * Disables storage tracking, prevents storage events from being sent to the client.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables storage tracking, storage events will now be delivered to the client.
    */
  def enable(): js.Promise[Unit] = js.native
  
  def getDOMStorageItems(params: GetDOMStorageItemsRequest): js.Promise[GetDOMStorageItemsResponse] = js.native
  
  @JSName("on")
  def on_domStorageItemAdded(event: domStorageItemAdded, listener: js.Function1[/* params */ DomStorageItemAddedEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_domStorageItemRemoved(
    event: domStorageItemRemoved,
    listener: js.Function1[/* params */ DomStorageItemRemovedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_domStorageItemUpdated(
    event: domStorageItemUpdated,
    listener: js.Function1[/* params */ DomStorageItemUpdatedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_domStorageItemsCleared(
    event: domStorageItemsCleared,
    listener: js.Function1[/* params */ DomStorageItemsClearedEvent, Unit]
  ): Unit = js.native
  
  def removeDOMStorageItem(params: RemoveDOMStorageItemRequest): js.Promise[Unit] = js.native
  
  def setDOMStorageItem(params: SetDOMStorageItemRequest): js.Promise[Unit] = js.native
}
