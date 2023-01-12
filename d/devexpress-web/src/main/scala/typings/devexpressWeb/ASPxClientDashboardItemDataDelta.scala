package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the delta metadata.
  */
trait ASPxClientDashboardItemDataDelta extends StObject {
  
  /**
    * Gets the identifier for the measure that provides actual values.
    */
  var ActualMeasureId: String
  
  /**
    * Gets the data item identifier.
    */
  var Id: String
  
  /**
    * Gets the name of the data item container.
    */
  var Name: String
  
  /**
    * Gets the identifier for the measure that provides target values.
    */
  var TargetMeasureId: String
}
object ASPxClientDashboardItemDataDelta {
  
  inline def apply(ActualMeasureId: String, Id: String, Name: String, TargetMeasureId: String): ASPxClientDashboardItemDataDelta = {
    val __obj = js.Dynamic.literal(ActualMeasureId = ActualMeasureId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TargetMeasureId = TargetMeasureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDashboardItemDataDelta] (val x: Self) extends AnyVal {
    
    inline def setActualMeasureId(value: String): Self = StObject.set(x, "ActualMeasureId", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTargetMeasureId(value: String): Self = StObject.set(x, "TargetMeasureId", value.asInstanceOf[js.Any])
  }
}
