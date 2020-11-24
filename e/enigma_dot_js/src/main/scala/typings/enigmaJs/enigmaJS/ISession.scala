package typings.enigmaJs.enigmaJS

import typings.enigmaJs.enigmaJsStrings.closed
import typings.enigmaJs.enigmaJsStrings.opened
import typings.enigmaJs.enigmaJsStrings.resumed
import typings.enigmaJs.enigmaJsStrings.suspended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISession extends js.Object {
  
  /**
    * Closes the websocket and cleans up internal caches, also triggers the closed event on all generated APIs.
    * Eventually resolved when the websocket has been closed.
    *
    * Note: you need to manually invoke this when you want to close a session and config.suspendOnClose is true.
    * @return Promise.
    */
  def close(): js.Promise[_] = js.native
  
  def on(event: String, func: js.Any): Unit = js.native
  @JSName("on")
  def on_closed(event: closed, func: js.Any): Unit = js.native
  /**
    * Handle opened state. This event is triggered whenever the websocket is connected and ready for communication.
    *
    * Handle closed state. This event is triggered when the underlying websocket is closed and config.suspendOnClose is false.
    *
    * Handle suspended state. This event is triggered in two cases (listed below). It is useful in scenarios where you for example
    * want to block interaction in your application until you are resumed again.
    * If config.suspendOnClose is true and there was a network disconnect (socked closed)
    * If you ran session.suspend()
    * The evt.initiator value is a string indicating what triggered the suspended state. Possible values: network, manual.
    *
    * Handle resumed state. This event is triggered when the session was properly resumed.
    * It is useful in scenarios where you for example can close blocking modal dialogs and allow the user to interact with your application again.
    *
    * notification:*
    * @param event - Event that triggers the function
    * @param func - Called function
    */
  @JSName("on")
  def on_opened(event: opened, func: js.Any): Unit = js.native
  @JSName("on")
  def on_resumed(event: resumed, func: js.Any): Unit = js.native
  @JSName("on")
  def on_suspended(event: suspended, func: js.Any): Unit = js.native
  
  /**
    * Establishes the websocket against the configured URL. Eventually resolved with the QIX global interface when the connection has been established.
    * @return Promise.
    */
  def open[T /* <: IGeneratedAPI */](): js.Promise[T] = js.native
  
  /**
    * Resume a previously suspended enigma.js session by re-creating the websocket and, if possible, re-open the document
    * as well as refreshing the internal caches. If successful, changed events will be triggered on all generated APIs,
    * and on the ones it was unable to restore, the closed event will be triggered.
    * @param onlyIfAttached onlyIfAttached can be used to only allow resuming if the QIX Engine session was reattached properly.
    * @return Promise.
    * Note: Eventually resolved when the websocket (and potentially the previously opened document, and generated APIs) has been restored,
    * rejected when it fails any of those steps, or when onlyIfAttached is true and a new QIX Engine session was created.
    */
  def resume(): js.Promise[_] = js.native
  def resume(onlyIfAttached: Boolean): js.Promise[_] = js.native
  
  /**
    * Suspends the enigma.js session by closing the websocket and rejecting all method calls until it has been resumed again.
    * @return Promise.
    */
  def suspend(): js.Promise[_] = js.native
}
