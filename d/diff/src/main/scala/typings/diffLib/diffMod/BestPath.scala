package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BestPath extends js.Object {
  var componenets: js.Array[Change]
  var newPos: scala.Double
}

object BestPath {
  @scala.inline
  def apply(componenets: js.Array[Change], newPos: scala.Double): BestPath = {
    val __obj = js.Dynamic.literal(componenets = componenets, newPos = newPos)
  
    __obj.asInstanceOf[BestPath]
  }
}

