package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toolbar extends js.Object {
  def getTabs(): js.Array[ToolbarTab]
}

object Toolbar {
  @scala.inline
  def apply(getTabs: js.Function0[js.Array[ToolbarTab]]): Toolbar = {
    val __obj = js.Dynamic.literal(getTabs = getTabs)
  
    __obj.asInstanceOf[Toolbar]
  }
}

