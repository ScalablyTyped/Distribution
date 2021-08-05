package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of records from the dashboard data source.
  */
trait ASPxClientDashboardItemUnderlyingData extends StObject {
  
  /**
    * Returns an array of data members available in a data source.
    */
  def GetDataMembers(): js.Array[String]
  
  /**
    * Returns a callstack containing the error caused by an unsuccessful request for underlying data.
    */
  def GetRequestDataError(): String
  
  /**
    * Gets the number of rows in the underlying data set.
    */
  def GetRowCount(): Double
  
  /**
    * Returns the value of the specified cell within the underlying data set. An object that represents the value of the specified cell.
    * @param rowIndex An integer value that specifies the zero-based index of the required row.
    * @param dataMember A String that specifies the required data member.
    */
  def GetRowValue(rowIndex: Double, dataMember: String): js.Any
  
  /**
    * Returns whether a request for underlying data was successful.
    */
  def IsDataReceived(): Boolean
}
object ASPxClientDashboardItemUnderlyingData {
  
  inline def apply(
    GetDataMembers: () => js.Array[String],
    GetRequestDataError: () => String,
    GetRowCount: () => Double,
    GetRowValue: (Double, String) => js.Any,
    IsDataReceived: () => Boolean
  ): ASPxClientDashboardItemUnderlyingData = {
    val __obj = js.Dynamic.literal(GetDataMembers = js.Any.fromFunction0(GetDataMembers), GetRequestDataError = js.Any.fromFunction0(GetRequestDataError), GetRowCount = js.Any.fromFunction0(GetRowCount), GetRowValue = js.Any.fromFunction2(GetRowValue), IsDataReceived = js.Any.fromFunction0(IsDataReceived))
    __obj.asInstanceOf[ASPxClientDashboardItemUnderlyingData]
  }
  
  extension [Self <: ASPxClientDashboardItemUnderlyingData](x: Self) {
    
    inline def setGetDataMembers(value: () => js.Array[String]): Self = StObject.set(x, "GetDataMembers", js.Any.fromFunction0(value))
    
    inline def setGetRequestDataError(value: () => String): Self = StObject.set(x, "GetRequestDataError", js.Any.fromFunction0(value))
    
    inline def setGetRowCount(value: () => Double): Self = StObject.set(x, "GetRowCount", js.Any.fromFunction0(value))
    
    inline def setGetRowValue(value: (Double, String) => js.Any): Self = StObject.set(x, "GetRowValue", js.Any.fromFunction2(value))
    
    inline def setIsDataReceived(value: () => Boolean): Self = StObject.set(x, "IsDataReceived", js.Any.fromFunction0(value))
  }
}
