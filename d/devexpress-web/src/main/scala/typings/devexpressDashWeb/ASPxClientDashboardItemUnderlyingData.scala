package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of records from the dashboard data source.
  */
@JSGlobal("ASPxClientDashboardItemUnderlyingData")
@js.native
class ASPxClientDashboardItemUnderlyingData () extends js.Object {
  /**
    * Returns an array of data members available in a data source.
    */
  def GetDataMembers(): js.Array[String] = js.native
  /**
    * Returns a callstack containing the error caused by an unsuccessful request for underlying data.
    */
  def GetRequestDataError(): String = js.native
  /**
    * Gets the number of rows in the underlying data set.
    */
  def GetRowCount(): Double = js.native
  /**
    * Returns the value of the specified cell within the underlying data set. An object that represents the value of the specified cell.
    * @param rowIndex An integer value that specifies the zero-based index of the required row.
    * @param dataMember A String that specifies the required data member.
    */
  def GetRowValue(rowIndex: Double, dataMember: String): js.Any = js.native
  /**
    * Returns whether a request for underlying data was successful.
    */
  def IsDataReceived(): Boolean = js.native
}

