package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPoint extends js.Object {
  /** Used for version checking during transformation; that is, a datapoint can only replace another datapoint that has an older computation time stamp. */
  var computationTimeMillis: js.UndefOr[String] = js.native
  /** The data type defining the format of the values in this data point. */
  var dataTypeName: js.UndefOr[String] = js.native
  /** The end time of the interval represented by this data point, in nanoseconds since epoch. */
  var endTimeNanos: js.UndefOr[String] = js.native
  /**
    * Indicates the last time this data point was modified. Useful only in contexts where we are listing the data changes, rather than representing the
    * current state of the data.
    */
  var modifiedTimeMillis: js.UndefOr[String] = js.native
  /**
    * If the data point is contained in a dataset for a derived data source, this field will be populated with the data source stream ID that created the
    * data point originally.
    */
  var originDataSourceId: js.UndefOr[String] = js.native
  /** The raw timestamp from the original SensorEvent. */
  var rawTimestampNanos: js.UndefOr[String] = js.native
  /** The start time of the interval represented by this data point, in nanoseconds since epoch. */
  var startTimeNanos: js.UndefOr[String] = js.native
  /**
    * Values of each data type field for the data point. It is expected that each value corresponding to a data type field will occur in the same order that
    * the field is listed with in the data type specified in a data source.
    *
    * Only one of integer and floating point fields will be populated, depending on the format enum value within data source's type field.
    */
  var value: js.UndefOr[js.Array[Value]] = js.native
}

object DataPoint {
  @scala.inline
  def apply(): DataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPoint]
  }
  @scala.inline
  implicit class DataPointOps[Self <: DataPoint] (val x: Self) extends AnyVal {
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
    def setComputationTimeMillis(value: String): Self = this.set("computationTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputationTimeMillis: Self = this.set("computationTimeMillis", js.undefined)
    @scala.inline
    def setDataTypeName(value: String): Self = this.set("dataTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTypeName: Self = this.set("dataTypeName", js.undefined)
    @scala.inline
    def setEndTimeNanos(value: String): Self = this.set("endTimeNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTimeNanos: Self = this.set("endTimeNanos", js.undefined)
    @scala.inline
    def setModifiedTimeMillis(value: String): Self = this.set("modifiedTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedTimeMillis: Self = this.set("modifiedTimeMillis", js.undefined)
    @scala.inline
    def setOriginDataSourceId(value: String): Self = this.set("originDataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginDataSourceId: Self = this.set("originDataSourceId", js.undefined)
    @scala.inline
    def setRawTimestampNanos(value: String): Self = this.set("rawTimestampNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawTimestampNanos: Self = this.set("rawTimestampNanos", js.undefined)
    @scala.inline
    def setStartTimeNanos(value: String): Self = this.set("startTimeNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimeNanos: Self = this.set("startTimeNanos", js.undefined)
    @scala.inline
    def setValueVarargs(value: Value*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[Value]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

