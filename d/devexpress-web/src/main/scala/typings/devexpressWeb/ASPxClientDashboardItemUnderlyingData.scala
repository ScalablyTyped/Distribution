package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of records from the dashboard data source.
  */
@js.native
trait ASPxClientDashboardItemUnderlyingData extends js.Object {
  
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
object ASPxClientDashboardItemUnderlyingData {
  
  @scala.inline
  def apply(
    GetDataMembers: () => js.Array[String],
    GetRequestDataError: () => String,
    GetRowCount: () => Double,
    GetRowValue: (Double, String) => js.Any,
    IsDataReceived: () => Boolean
  ): ASPxClientDashboardItemUnderlyingData = {
    val __obj = js.Dynamic.literal(GetDataMembers = js.Any.fromFunction0(GetDataMembers), GetRequestDataError = js.Any.fromFunction0(GetRequestDataError), GetRowCount = js.Any.fromFunction0(GetRowCount), GetRowValue = js.Any.fromFunction2(GetRowValue), IsDataReceived = js.Any.fromFunction0(IsDataReceived))
    __obj.asInstanceOf[ASPxClientDashboardItemUnderlyingData]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemUnderlyingDataOps[Self <: ASPxClientDashboardItemUnderlyingData] (val x: Self) extends AnyVal {
    
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
    def setGetDataMembers(value: () => js.Array[String]): Self = this.set("GetDataMembers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequestDataError(value: () => String): Self = this.set("GetRequestDataError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowCount(value: () => Double): Self = this.set("GetRowCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowValue(value: (Double, String) => js.Any): Self = this.set("GetRowValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsDataReceived(value: () => Boolean): Self = this.set("IsDataReceived", js.Any.fromFunction0(value))
  }
}
