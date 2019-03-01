package typings
package gaeaDashModelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewIndex extends js.Object {
  var newIndex: scala.Double
  var oldIndex: scala.Double
}

object Anon_NewIndex {
  @scala.inline
  def apply(newIndex: scala.Double, oldIndex: scala.Double): Anon_NewIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newIndex")(newIndex)
    __obj.updateDynamic("oldIndex")(oldIndex)
    __obj.asInstanceOf[Anon_NewIndex]
  }
}

