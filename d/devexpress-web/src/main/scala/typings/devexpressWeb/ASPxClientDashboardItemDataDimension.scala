package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the dimension metadata.
  */
@js.native
trait ASPxClientDashboardItemDataDimension extends StObject {
  
  /**
    * Gets the data member identifier for the current dimension.
    */
  var DataMember: String = js.native
  
  /**
    * Gets the group interval for date-time values for the current dimension.
    */
  var DateTimeGroupInterval: String = js.native
  
  /**
    * Formats the specified value using format settings of the current dimension. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  def Format(value: js.Any): String = js.native
  
  /**
    * Gets the dimension identifier.
    */
  var Id: String = js.native
  
  /**
    * Gets or sets the name of the dimension.
    */
  var Name: String = js.native
  
  /**
    * Gets the group interval for string values.
    */
  var TextGroupInterval: String = js.native
}
object ASPxClientDashboardItemDataDimension {
  
  @scala.inline
  def apply(
    DataMember: String,
    DateTimeGroupInterval: String,
    Format: js.Any => String,
    Id: String,
    Name: String,
    TextGroupInterval: String
  ): ASPxClientDashboardItemDataDimension = {
    val __obj = js.Dynamic.literal(DataMember = DataMember.asInstanceOf[js.Any], DateTimeGroupInterval = DateTimeGroupInterval.asInstanceOf[js.Any], Format = js.Any.fromFunction1(Format), Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TextGroupInterval = TextGroupInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataDimension]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemDataDimensionMutableBuilder[Self <: ASPxClientDashboardItemDataDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataMember(value: String): Self = StObject.set(x, "DataMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeGroupInterval(value: String): Self = StObject.set(x, "DateTimeGroupInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Any => String): Self = StObject.set(x, "Format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextGroupInterval(value: String): Self = StObject.set(x, "TextGroupInterval", value.asInstanceOf[js.Any])
  }
}
