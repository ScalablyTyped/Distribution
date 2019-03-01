package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a data record.
  */
trait DataRecordOptions extends js.Object {
  /**
    * Gets or sets the index of the active data record.
    * Value: An integer value specifying the data record index.
    */
  var activeRecordIndex: scala.Double
  /**
    * Gets or sets the count of data source records.
    * Value: An integer value specifying the count of data source records.
    */
  var recordCount: scala.Double
}

object DataRecordOptions {
  @scala.inline
  def apply(activeRecordIndex: scala.Double, recordCount: scala.Double): DataRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeRecordIndex")(activeRecordIndex)
    __obj.updateDynamic("recordCount")(recordCount)
    __obj.asInstanceOf[DataRecordOptions]
  }
}

