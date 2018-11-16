package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait unsubscribeSuccessArgs extends baseResponseArgs {
  /**
               * The channel from which the client was unsubscribed. Must start with a forward slash (/).
               */
  var channel: java.lang.String
  /**
               * The channels from which the client was unsubscribed. Each must start with a forward slash (/).
               */
  var channels: js.Array[java.lang.String]
}

