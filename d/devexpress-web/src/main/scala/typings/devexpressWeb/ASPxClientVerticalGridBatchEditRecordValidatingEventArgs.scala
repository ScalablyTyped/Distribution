package typings.devexpressWeb

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
  implicit class ASPxClientVerticalGridBatchEditRecordValidatingEventArgsOps[Self <: ASPxClientVerticalGridBatchEditRecordValidatingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValidationInfo(value: js.Any): Self = this.set("validationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
}
