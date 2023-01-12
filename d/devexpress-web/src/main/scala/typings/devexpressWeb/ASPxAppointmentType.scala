package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the AppointmentType enumeration.
  */
trait ASPxAppointmentType extends StObject {
  
  /**
    * Gets a string representation equivalent of AppointmentType.ChangedOccurrence enumeration for use in client scripts.
    */
  var ChangedOccurrence: String
  
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.DeletedOccurrence enumeration for use in client scripts.
    */
  var DeletedOccurrence: String
  
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.Normal enumeration for use in client scripts.
    */
  var Normal: String
  
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.Occurrence enumeration for use in client scripts.
    */
  var Occurrence: String
  
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.Pattern enumeration for use in client scripts.
    */
  var Pattern: String
}
object ASPxAppointmentType {
  
  inline def apply(
    ChangedOccurrence: String,
    DeletedOccurrence: String,
    Normal: String,
    Occurrence: String,
    Pattern: String
  ): ASPxAppointmentType = {
    val __obj = js.Dynamic.literal(ChangedOccurrence = ChangedOccurrence.asInstanceOf[js.Any], DeletedOccurrence = DeletedOccurrence.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], Occurrence = Occurrence.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxAppointmentType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxAppointmentType] (val x: Self) extends AnyVal {
    
    inline def setChangedOccurrence(value: String): Self = StObject.set(x, "ChangedOccurrence", value.asInstanceOf[js.Any])
    
    inline def setDeletedOccurrence(value: String): Self = StObject.set(x, "DeletedOccurrence", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: String): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    inline def setOccurrence(value: String): Self = StObject.set(x, "Occurrence", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
  }
}
