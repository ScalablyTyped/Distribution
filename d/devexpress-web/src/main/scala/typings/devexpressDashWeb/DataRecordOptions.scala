package typings.devexpressDashWeb

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
  var activeRecordIndex: Double
  /**
    * Gets or sets the count of data source records.
    * Value: An integer value specifying the count of data source records.
    */
  var recordCount: Double
}

object DataRecordOptions {
  @scala.inline
  def apply(activeRecordIndex: Double, recordCount: Double): DataRecordOptions = {
    val __obj = js.Dynamic.literal(activeRecordIndex = activeRecordIndex, recordCount = recordCount)
  
    __obj.asInstanceOf[DataRecordOptions]
  }
}

