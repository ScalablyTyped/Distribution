package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixRow extends js.Object {
  var elements: js.Array[DistanceMatrixRowElement]
}

object DistanceMatrixRow {
  @scala.inline
  def apply(elements: js.Array[DistanceMatrixRowElement]): DistanceMatrixRow = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistanceMatrixRow]
  }
}

