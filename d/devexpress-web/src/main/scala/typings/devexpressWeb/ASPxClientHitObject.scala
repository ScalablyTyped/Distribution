package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an object under the hit test point within a chart control, on the client side.
  */
@js.native
trait ASPxClientHitObject extends js.Object {
  /**
    * Provides access to an object, which is in some way related to the object being hit. The returned value depends on the ASPxClientHitObject.Object type and hit point location.
    */
  var AdditionalObject: ASPxClientWebChartElement = js.native
  /**
    * Gets the chart element for which the event was raised.
    */
  var Object: ASPxClientWebChartElement = js.native
}

object ASPxClientHitObject {
  @scala.inline
  def apply(AdditionalObject: ASPxClientWebChartElement, Object: ASPxClientWebChartElement): ASPxClientHitObject = {
    val __obj = js.Dynamic.literal(AdditionalObject = AdditionalObject.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHitObject]
  }
  @scala.inline
  implicit class ASPxClientHitObjectOps[Self <: ASPxClientHitObject] (val x: Self) extends AnyVal {
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
    def setAdditionalObject(value: ASPxClientWebChartElement): Self = this.set("AdditionalObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: ASPxClientWebChartElement): Self = this.set("Object", value.asInstanceOf[js.Any])
  }
  
}

