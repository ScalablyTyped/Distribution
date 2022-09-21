package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordValidating event.
  */
trait ASPxClientVerticalGridBatchEditRecordValidatingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides validation information on the record currently being validated.
    */
  var validationInfo: Any
  
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double
}
object ASPxClientVerticalGridBatchEditRecordValidatingEventArgs {
  
  inline def apply(validationInfo: Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditRecordValidatingEventArgs = {
    val __obj = js.Dynamic.literal(validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordValidatingEventArgs]
  }
  
  extension [Self <: ASPxClientVerticalGridBatchEditRecordValidatingEventArgs](x: Self) {
    
    inline def setValidationInfo(value: Any): Self = StObject.set(x, "validationInfo", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
