package typings.emberDebug.dataAdapterMod.DataAdapter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedRecord extends js.Object {
  var columnValues: js.Object
  var `object`: js.Object
}

object WrappedRecord {
  @scala.inline
  def apply(columnValues: js.Object, `object`: js.Object): WrappedRecord = {
    val __obj = js.Dynamic.literal(columnValues = columnValues.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedRecord]
  }
}

