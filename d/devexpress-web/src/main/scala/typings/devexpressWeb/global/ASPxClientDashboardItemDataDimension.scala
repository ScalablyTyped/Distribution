package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the dimension metadata.
  */
@JSGlobal("ASPxClientDashboardItemDataDimension")
@js.native
open class ASPxClientDashboardItemDataDimension ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardItemDataDimension {
  
  /**
    * Gets the data member identifier for the current dimension.
    */
  /* CompleteClass */
  var DataMember: String = js.native
  
  /**
    * Gets the group interval for date-time values for the current dimension.
    */
  /* CompleteClass */
  var DateTimeGroupInterval: String = js.native
  
  /**
    * Formats the specified value using format settings of the current dimension. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  /* CompleteClass */
  override def Format(value: Any): String = js.native
  
  /**
    * Gets the dimension identifier.
    */
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * Gets or sets the name of the dimension.
    */
  /* CompleteClass */
  var Name: String = js.native
  
  /**
    * Gets the group interval for string values.
    */
  /* CompleteClass */
  var TextGroupInterval: String = js.native
}
