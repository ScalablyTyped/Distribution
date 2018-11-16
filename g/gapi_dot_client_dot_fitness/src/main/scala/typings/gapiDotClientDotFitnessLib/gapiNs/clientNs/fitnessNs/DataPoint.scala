package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataPoint extends js.Object {
  /** Used for version checking during transformation; that is, a datapoint can only replace another datapoint that has an older computation time stamp. */
  var computationTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The data type defining the format of the values in this data point. */
  var dataTypeName: js.UndefOr[java.lang.String] = js.undefined
  /** The end time of the interval represented by this data point, in nanoseconds since epoch. */
  var endTimeNanos: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Indicates the last time this data point was modified. Useful only in contexts where we are listing the data changes, rather than representing the
               * current state of the data.
               */
  var modifiedTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /**
               * If the data point is contained in a dataset for a derived data source, this field will be populated with the data source stream ID that created the
               * data point originally.
               */
  var originDataSourceId: js.UndefOr[java.lang.String] = js.undefined
  /** The raw timestamp from the original SensorEvent. */
  var rawTimestampNanos: js.UndefOr[java.lang.String] = js.undefined
  /** The start time of the interval represented by this data point, in nanoseconds since epoch. */
  var startTimeNanos: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Values of each data type field for the data point. It is expected that each value corresponding to a data type field will occur in the same order that
               * the field is listed with in the data type specified in a data source.
               *
               * Only one of integer and floating point fields will be populated, depending on the format enum value within data source's type field.
               */
  var value: js.UndefOr[js.Array[Value]] = js.undefined
}

