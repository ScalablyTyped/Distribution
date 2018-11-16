package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * When implemented, represents the Web Dashboard extension.
 */

trait IExtension extends js.Object {
  /**
       * Gets a unique name of a Web Dashboard extension.
       * Value: A string value that is a unique name of a Web Dashboard extension.
       */
  var name: java.lang.String
  /**
       * Contains code that will be invoked when you register the dashboard extension.
       */
  def start(): scala.Unit
  /**
       * Contains code that will be invoked when you unregister the dashboard extension.
       */
  def stop(): scala.Unit
}

