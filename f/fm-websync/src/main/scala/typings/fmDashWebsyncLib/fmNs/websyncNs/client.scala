package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("fm.websync.client")
@js.native
class client () extends js.Object {
  /**
               * Sets up and maintains a streaming connection to the server.
               * While this method will typically run asychronously, the WebSync client is designed to be used without (much) consideration for its asynchronous nature.
               * To that end, any calls to methods that require an active connection, like bind, subscribe and publish, will be queued automatically and executed once this
               * method has completed successfully.
               */
  def connect(config: connectConfig): client = js.native
  /**
               *
               * @param config Takes down a streaming connection to the server and unsubscribes the client.
               * After the disconnect completes successfully, any further calls to methods that require an active connection, like bind, subscribe and publish, will be queued
               * automatically and executed only if/when the client reconnects.
               */
  def disconnect(config: disconnectConfig): client = js.native
  /**
               * Reconnects after a stream failure using either the most recent connectConfig or the one specified.
               * This method should only be called from the callback specified by onSreamFailure and only if the args.willReconnect flag is set to false.
               * Otherwise, the client will reconnect automatically.
               */
  def reconnect(): client = js.native
  /**
               * Reconnects after a stream failure using either the most recent connectConfig or the one specified.
               * This method should only be called from the callback specified by onSreamFailure and only if the args.willReconnect flag is set to false.
               * Otherwise, the client will reconnect automatically.
               */
  def reconnect(config: connectConfig): client = js.native
  /**
               * Subscribes the client to receive messages on one or more channels.
               * When the subscribe completes successfully, the callback specified by onSuccess will be invoked, passing in the subscribed channel(s),
               * including any modifications made on the server.
               */
  def subscribe(config: subscribeConfig): client = js.native
  /**
               * Unsubscribes the client from receiving messages on one or more channels.
               * When the unsubscribe completes successfully, the callback specified by onSuccess will be invoked, passing in the unsubscribed channel(s),
               * including any modifications made on the server.
               */
  def unsubscribe(config: unsubscribeConfig): client = js.native
}

@JSGlobal("fm.websync.client")
@js.native
object client extends js.Object {
  /**
               * Initializes the client according to the specified configuration.
               * This method must always be called first. While is always executes synchronously, callbacks are allowed for the purposes of method chaining.
               */
  def initialize(config: fmDashWebsyncLib.fmNs.websyncNs.initializeConfig): fmDashWebsyncLib.fmNs.websyncNs.client = js.native
}

