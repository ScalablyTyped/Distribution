package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the delta metadata.
  */
@js.native
trait ASPxClientDashboardItemDataDelta extends js.Object {
  
  /**
    * Gets the identifier for the measure that provides actual values.
    */
  var ActualMeasureId: String = js.native
  
  /**
    * Gets the data item identifier.
    */
  var Id: String = js.native
  
  /**
    * Gets the name of the data item container.
    */
  var Name: String = js.native
  
  /**
    * Gets the identifier for the measure that provides target values.
    */
  var TargetMeasureId: String = js.native
}
object ASPxClientDashboardItemDataDelta {
  
  @scala.inline
  def apply(ActualMeasureId: String, Id: String, Name: String, TargetMeasureId: String): ASPxClientDashboardItemDataDelta = {
    val __obj = js.Dynamic.literal(ActualMeasureId = ActualMeasureId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TargetMeasureId = TargetMeasureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataDelta]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemDataDeltaOps[Self <: ASPxClientDashboardItemDataDelta] (val x: Self) extends AnyVal {
    
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
    def setActualMeasureId(value: String): Self = this.set("ActualMeasureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetMeasureId(value: String): Self = this.set("TargetMeasureId", value.asInstanceOf[js.Any])
  }
}
