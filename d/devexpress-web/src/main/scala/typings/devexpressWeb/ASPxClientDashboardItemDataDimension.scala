package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the dimension metadata.
  */
trait ASPxClientDashboardItemDataDimension extends StObject {
  
  /**
    * Gets the data member identifier for the current dimension.
    */
  var DataMember: String
  
  /**
    * Gets the group interval for date-time values for the current dimension.
    */
  var DateTimeGroupInterval: String
  
  /**
    * Formats the specified value using format settings of the current dimension. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  def Format(value: Any): String
  
  /**
    * Gets the dimension identifier.
    */
  var Id: String
  
  /**
    * Gets or sets the name of the dimension.
    */
  var Name: String
  
  /**
    * Gets the group interval for string values.
    */
  var TextGroupInterval: String
}
object ASPxClientDashboardItemDataDimension {
  
  inline def apply(
    DataMember: String,
    DateTimeGroupInterval: String,
    Format: Any => String,
    Id: String,
    Name: String,
    TextGroupInterval: String
  ): ASPxClientDashboardItemDataDimension = {
    val __obj = js.Dynamic.literal(DataMember = DataMember.asInstanceOf[js.Any], DateTimeGroupInterval = DateTimeGroupInterval.asInstanceOf[js.Any], Format = js.Any.fromFunction1(Format), Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TextGroupInterval = TextGroupInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDashboardItemDataDimension] (val x: Self) extends AnyVal {
    
    inline def setDataMember(value: String): Self = StObject.set(x, "DataMember", value.asInstanceOf[js.Any])
    
    inline def setDateTimeGroupInterval(value: String): Self = StObject.set(x, "DateTimeGroupInterval", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Any => String): Self = StObject.set(x, "Format", js.Any.fromFunction1(value))
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTextGroupInterval(value: String): Self = StObject.set(x, "TextGroupInterval", value.asInstanceOf[js.Any])
  }
}
