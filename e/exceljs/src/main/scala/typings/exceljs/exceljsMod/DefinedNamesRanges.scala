package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinedNamesRanges extends js.Object {
  var name: String
  var range: js.Array[String]
}

object DefinedNamesRanges {
  @scala.inline
  def apply(name: String, range: js.Array[String]): DefinedNamesRanges = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefinedNamesRanges]
  }
}

