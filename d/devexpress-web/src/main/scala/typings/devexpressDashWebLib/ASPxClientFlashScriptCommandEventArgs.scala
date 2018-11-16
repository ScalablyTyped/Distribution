package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the FlashScriptCommand client event.
 */

trait ASPxClientFlashScriptCommandEventArgs extends ASPxClientEventArgs {
  /**
       * Gets arguments passed via the FSCommand action of the flash object.
       * Value: A string that represents the value of the FSCommand action's args parameter.
       */
  var args: java.lang.String
  /**
       * Gets a command passed via the FSCommand action of the flash object.
       * Value: A string that represents the value of the FSCommand action's command parameter.
       */
  var command: java.lang.String
}

