package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client collection that maintains client menu objects.
  */
trait ASPxClientMenuCollection extends ASPxClientControlCollection {
  /**
    * Hides all menus maitained by the collection.
    */
  def HideAll(): scala.Unit
  /**
    * Recalculates the position of visible sub menus.
    */
  def RecalculateAll(): scala.Unit
}

