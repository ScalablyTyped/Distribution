package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceSearchOption extends js.Object {
  var attributes: js.Array[java.lang.String]
  var operator: java.lang.String
  var param: java.lang.String
}

object ResourceSearchOption {
  @scala.inline
  def apply(attributes: js.Array[java.lang.String], operator: java.lang.String, param: java.lang.String): ResourceSearchOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[ResourceSearchOption]
  }
}

