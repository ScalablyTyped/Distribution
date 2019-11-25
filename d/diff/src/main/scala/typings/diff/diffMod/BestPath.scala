package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BestPath extends js.Object {
  var componenets: js.Array[Change]
  var newPos: Double
}

object BestPath {
  @scala.inline
  def apply(componenets: js.Array[Change], newPos: Double): BestPath = {
    val __obj = js.Dynamic.literal(componenets = componenets.asInstanceOf[js.Any], newPos = newPos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BestPath]
  }
}

