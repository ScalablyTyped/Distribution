package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the information about tab stops.
  */
trait TabsSettings extends js.Object {
  /**
    * Gets or sets the default tab stop value.
    * Value: An integer value specifying the default tab stop.
    */
  var defaultTabStop: scala.Double
  /**
    * Gets or sets a list of tab stops.
    * Value: An array of TabSettings objects containing individual tab stop settings.
    */
  var tabs: js.Array[TabSettings]
}

