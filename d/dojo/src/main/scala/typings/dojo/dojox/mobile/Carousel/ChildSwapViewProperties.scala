package typings.dojo.dojox.mobile.Carousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Carousel.ChildSwapViewProperties.html
  *
  * This property can be specified for the SwapView children of a dojox/mobile/Carousel.
  *
  */
trait ChildSwapViewProperties extends js.Object {
  /**
    * Specifies that the Carousel child must be lazily loaded.
    *
    */
  var `lazy`: Boolean
}

object ChildSwapViewProperties {
  @scala.inline
  def apply(`lazy`: Boolean): ChildSwapViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lazy")(`lazy`)
    __obj.asInstanceOf[ChildSwapViewProperties]
  }
}

