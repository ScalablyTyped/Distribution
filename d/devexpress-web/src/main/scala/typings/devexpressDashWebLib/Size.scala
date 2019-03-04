package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the size settings.
  */
trait Size extends js.Object {
  /**
    * Gets or sets the height value in twips.
    * Value: An integer value specifying the height.
    */
  var height: scala.Double
  /**
    * Gets or sets the width value in twips.
    * Value: An integer value specifying the width.
    */
  var width: scala.Double
}

object Size {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): Size = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Size]
  }
}

