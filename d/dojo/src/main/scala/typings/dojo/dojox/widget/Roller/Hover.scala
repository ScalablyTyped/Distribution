package typings.dojo.dojox.widget.Roller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Roller._Hover.html
  *
  * A mixin class to provide a way to automate the "stop on hover" functionality.
  * A mixin class used to provide a way to automate a "stop on hover" behavior,
  * while still allowing for ambiguous subclassing for custom animations.
  * Simply mix this class into a dojox.widget.Roller variant, and instantiate
  * as you would. The hover connection is done automatically.
  *
  * The "hover" functionality is as such: Stop rotation while the mouse is over the
  * instance, and resume again once leaving. Even if autoStart is disabled, the widget
  * will start if a mouse enters and leaves the node in this case.
  *
  */
@JSGlobal("dojox.widget.Roller._Hover")
@js.native
class Hover () extends js.Object {
  /**
    *
    */
  def postCreate(): Unit = js.native
}

