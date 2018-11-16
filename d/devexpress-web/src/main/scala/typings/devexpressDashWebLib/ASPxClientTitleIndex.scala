package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the ASPxTitleIndex object.
 */

trait ASPxClientTitleIndex extends ASPxClientControl {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTitleIndex]]
  /**
       * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientTitleIndex.
       */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTitleIndex]]
  /**
       * Occurs on the client side after a callback's server-side processing has been completed.
       */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTitleIndex]]
  /**
       * Fires after an item has been clicked.
       */
  var ItemClick: ASPxClientEvent[ASPxClientTitleIndexItemEventHandler[ASPxClientTitleIndex]]
}

