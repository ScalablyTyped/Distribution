package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of records from the dashboard data source.
  */
trait ASPxClientDashboardItemUnderlyingData extends js.Object {
  /**
    * Returns an array of data members available in a data source.
    */
  def GetDataMembers(): js.Array[java.lang.String]
  /**
    * Returns a callstack containing the error caused by an unsuccessful request for underlying data.
    */
  def GetRequestDataError(): java.lang.String
  /**
    * Gets the number of rows in the underlying data set.
    */
  def GetRowCount(): scala.Double
  /**
    * Returns the value of the specified cell within the underlying data set.
    * @param rowIndex An integer value that specifies the zero-based index of the required row.
    * @param dataMember A String that specifies the required data member.
    */
  def GetRowValue(rowIndex: scala.Double, dataMember: java.lang.String): js.Object
  /**
    * Returns whether or not a request for underlying data was successful.
    */
  def IsDataReceived(): scala.Boolean
}

