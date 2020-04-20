package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var DataType: String
  var Kind: IndexKind
  var Precision: Double
}

object Index {
  @scala.inline
  def apply(DataType: String, Kind: IndexKind, Precision: Double): Index = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], Kind = Kind.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

