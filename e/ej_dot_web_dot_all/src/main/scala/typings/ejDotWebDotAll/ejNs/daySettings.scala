package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait daySettings extends js.Object {
  var names: js.Array[String]
  var namesAbbr: js.Array[String]
  var namesShort: js.Array[String]
}

object daySettings {
  @scala.inline
  def apply(names: js.Array[String], namesAbbr: js.Array[String], namesShort: js.Array[String]): daySettings = {
    val __obj = js.Dynamic.literal(names = names, namesAbbr = namesAbbr, namesShort = namesShort)
  
    __obj.asInstanceOf[daySettings]
  }
}

