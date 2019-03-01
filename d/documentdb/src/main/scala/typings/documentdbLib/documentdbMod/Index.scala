package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var DataType: java.lang.String
  var Kind: IndexKind
  var Precision: scala.Double
}

object Index {
  @scala.inline
  def apply(DataType: java.lang.String, Kind: IndexKind, Precision: scala.Double): Index = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DataType")(DataType)
    __obj.updateDynamic("Kind")(Kind)
    __obj.updateDynamic("Precision")(Precision)
    __obj.asInstanceOf[Index]
  }
}

