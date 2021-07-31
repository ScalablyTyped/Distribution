package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the measure metadata.
  */
@JSGlobal("ASPxClientDashboardItemDataMeasure")
@js.native
class ASPxClientDashboardItemDataMeasure ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardItemDataMeasure {
  
  /**
    * Gets the data member that identifies the data source list used to provide data for the current measure.
    */
  /* CompleteClass */
  var DataMember: String = js.native
  
  /**
    * Formats the specified value using format settings of the current measure. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  /* CompleteClass */
  override def Format(value: js.Any): String = js.native
  
  /**
    * Gets the measure identifier.
    */
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * Gets the name of the measure.
    */
  /* CompleteClass */
  var Name: String = js.native
  
  /**
    * Gets the type of summary function calculated against the current measure.
    */
  /* CompleteClass */
  var SummaryType: String = js.native
}
