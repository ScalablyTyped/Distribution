package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the CrosshairElement class.
  */
@js.native
trait ASPxClientCrosshairElement extends js.Object {
  
  /**
    * Gets a series that a crosshair element hovers over when implementing a custom draw.
    */
  var Series: ASPxClientSeries = js.native
}
object ASPxClientCrosshairElement {
  
  @scala.inline
  def apply(Series: ASPxClientSeries): ASPxClientCrosshairElement = {
    val __obj = js.Dynamic.literal(Series = Series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairElement]
  }
  
  @scala.inline
  implicit class ASPxClientCrosshairElementOps[Self <: ASPxClientCrosshairElement] (val x: Self) extends AnyVal {
    
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
    def setSeries(value: ASPxClientSeries): Self = this.set("Series", value.asInstanceOf[js.Any])
  }
}
