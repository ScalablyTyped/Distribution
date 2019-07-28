package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixRow extends js.Object {
  var elements: js.Array[DistanceMatrixRowElement]
}

object DistanceMatrixRow {
  @scala.inline
  def apply(elements: js.Array[DistanceMatrixRowElement]): DistanceMatrixRow = {
    val __obj = js.Dynamic.literal(elements = elements)
  
    __obj.asInstanceOf[DistanceMatrixRow]
  }
}

