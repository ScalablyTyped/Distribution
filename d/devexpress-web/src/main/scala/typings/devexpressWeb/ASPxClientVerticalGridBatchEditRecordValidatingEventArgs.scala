package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordValidating event.
  */
@js.native
trait ASPxClientVerticalGridBatchEditRecordValidatingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides validation information on the record currently being validated.
    */
  var validationInfo: js.Any = js.native
  
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double = js.native
}
object ASPxClientVerticalGridBatchEditRecordValidatingEventArgs {
  
  @scala.inline
  def apply(validationInfo: js.Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditRecordValidatingEventArgs = {
    val __obj = js.Dynamic.literal(validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordValidatingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditRecordValidatingEventArgsMutableBuilder[Self <: ASPxClientVerticalGridBatchEditRecordValidatingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidationInfo(value: js.Any): Self = StObject.set(x, "validationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
