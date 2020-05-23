package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the CrosshairElement class.
  */
trait ASPxClientCrosshairElement extends js.Object {
  /**
    * Gets a series that a crosshair element hovers over when implementing a custom draw.
    */
  var Series: ASPxClientSeries
}

object ASPxClientCrosshairElement {
  @scala.inline
  def apply(Series: ASPxClientSeries): ASPxClientCrosshairElement = {
    val __obj = js.Dynamic.literal(Series = Series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairElement]
  }
}

