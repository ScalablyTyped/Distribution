package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a data record.
  */
@js.native
trait DataRecordOptions extends js.Object {
  /**
    * Gets or sets the index of the active data record.
    */
  var activeRecordIndex: Double = js.native
  /**
    * Gets or sets the count of data source records.
    */
  var recordCount: Double = js.native
}

object DataRecordOptions {
  @scala.inline
  def apply(activeRecordIndex: Double, recordCount: Double): DataRecordOptions = {
    val __obj = js.Dynamic.literal(activeRecordIndex = activeRecordIndex.asInstanceOf[js.Any], recordCount = recordCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRecordOptions]
  }
  @scala.inline
  implicit class DataRecordOptionsOps[Self <: DataRecordOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveRecordIndex(value: Double): Self = this.set("activeRecordIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordCount(value: Double): Self = this.set("recordCount", value.asInstanceOf[js.Any])
  }
  
}

