package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait receiveArgs extends baseResponseArgs {
  /**
               * The channel over which the data was published.
               */
  var channel: java.lang.String
  /**
               * The published data.
               */
  var data: js.Any
  /**
               * Details about the client publishing the data.
               */
  var publishingClient: publishingClient
}

