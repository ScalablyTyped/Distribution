package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  var synonyms: js.Array[java.lang.String]
  var value: java.lang.String
}

object Entity {
  @scala.inline
  def apply(synonyms: js.Array[java.lang.String], value: java.lang.String): Entity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("synonyms")(synonyms)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Entity]
  }
}

