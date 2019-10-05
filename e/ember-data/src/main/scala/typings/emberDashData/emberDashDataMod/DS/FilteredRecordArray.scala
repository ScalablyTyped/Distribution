package typings.emberDashData.emberDashDataMod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of records whose membership is determined by the
  * store. As records are created, loaded, or modified, the store
  * evaluates them to determine if they should be part of the record
  * array.
  */
@JSImport("ember-data", "DS.FilteredRecordArray")
@js.native
class FilteredRecordArray[T] () extends RecordArray[T] {
  /**
    * The filterFunction is a function used to test records from the store to
    * determine if they should be part of the record array.
    */
  def filterFunction(record: Model): Boolean = js.native
}

