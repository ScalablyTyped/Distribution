package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait connectFailureArgs extends baseResponseArgs {
  /**
               * The error generated while completing the request.
               */
  var error: java.lang.String
  /**
               * Whether the call to client.connect was triggered by a reconnection after network failure.
               */
  var isReconnect: scala.Boolean
  /**
               * Whether or not to reconnect automatically after this callback has finished execution.
               */
  var reconnect: scala.Boolean
}

