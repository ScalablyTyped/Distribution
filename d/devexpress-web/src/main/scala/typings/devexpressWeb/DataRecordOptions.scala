package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a data record.
  */
trait DataRecordOptions extends js.Object {
  /**
    * Gets or sets the index of the active data record.
    */
  var activeRecordIndex: Double
  /**
    * Gets or sets the count of data source records.
    */
  var recordCount: Double
}

object DataRecordOptions {
  @scala.inline
  def apply(activeRecordIndex: Double, recordCount: Double): DataRecordOptions = {
    val __obj = js.Dynamic.literal(activeRecordIndex = activeRecordIndex.asInstanceOf[js.Any], recordCount = recordCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRecordOptions]
  }
}

