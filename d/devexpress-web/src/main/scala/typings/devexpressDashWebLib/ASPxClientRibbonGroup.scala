package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonGroup object.
  */
trait ASPxClientRibbonGroup extends js.Object {
  /**
    * Gets or sets the group's index within the collection.
    * Value: An integer value that is the zero-based index of the group within the collection.
    */
  var index: scala.Double
  /**
    * Gets the name of the current ribbon group.
    * Value: A string value that is the group's name.
    */
  var name: java.lang.String
  /**
    * Gets the client ribbon object to which the current group belongs.
    * Value: An <see cref="ASPxClientRibbon" /> object to which the group belongs.
    */
  var ribbon: ASPxClientRibbon
  /**
    * Gets the client tab object to which the current group belongs.
    * Value: An <see cref="ASPxClientRibbonTab" /> object to which the group belongs.
    */
  var tab: ASPxClientRibbonTab
  /**
    * Returns a value specifying whether a ribbon group is displayed.
    */
  def GetVisible(): scala.Boolean
}

