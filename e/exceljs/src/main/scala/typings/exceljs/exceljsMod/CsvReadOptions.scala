package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvReadOptions extends js.Object {
  var dateFormats: js.Array[String]
  def map(value: js.Any, index: Double): js.Any
}

object CsvReadOptions {
  @scala.inline
  def apply(dateFormats: js.Array[String], map: (js.Any, Double) => js.Any): CsvReadOptions = {
    val __obj = js.Dynamic.literal(dateFormats = dateFormats.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[CsvReadOptions]
  }
}

