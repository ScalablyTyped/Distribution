package typings.devexpressDashWeb

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
  var height: Double
  /**
    * Gets or sets the width value in twips.
    * Value: An integer value specifying the width.
    */
  var width: Double
}

object Size {
  @scala.inline
  def apply(height: Double, width: Double): Size = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Size]
  }
}

