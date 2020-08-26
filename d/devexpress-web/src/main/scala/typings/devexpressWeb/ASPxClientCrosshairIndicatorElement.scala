package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Crosshair Cursor's element that displays information about an indicator.
  */
@js.native
trait ASPxClientCrosshairIndicatorElement extends js.Object {
  /**
    * Returns the indicator for whose point the Crosshair Cursor creates the element.
    */
  var Indicator: ASPxClientIndicator = js.native
}

object ASPxClientCrosshairIndicatorElement {
  @scala.inline
  def apply(Indicator: ASPxClientIndicator): ASPxClientCrosshairIndicatorElement = {
    val __obj = js.Dynamic.literal(Indicator = Indicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairIndicatorElement]
  }
  @scala.inline
  implicit class ASPxClientCrosshairIndicatorElementOps[Self <: ASPxClientCrosshairIndicatorElement] (val x: Self) extends AnyVal {
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
    def setIndicator(value: ASPxClientIndicator): Self = this.set("Indicator", value.asInstanceOf[js.Any])
  }
  
}

