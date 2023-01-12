package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the SchedulerGroupType enumeration.
  */
trait ASPxSchedulerGroupType extends StObject {
  
  /**
    * Gets a string representation equivalent of SchedulerGroupType.Date enumeration for use in client scripts.
    */
  var Date: String
  
  /**
    * Gets a string representation equivalent of SchedulerGroupType.None enumeration for use in client scripts.
    */
  var None: String
  
  /**
    * Gets a string representation equivalent of SchedulerGroupType.Resource enumeration for use in client scripts.
    */
  var Resource: String
}
object ASPxSchedulerGroupType {
  
  inline def apply(Date: String, None: String, Resource: String): ASPxSchedulerGroupType = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxSchedulerGroupType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxSchedulerGroupType] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setNone(value: String): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
  }
}
