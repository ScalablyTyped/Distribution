package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ZoomEnd event.
  */
trait BootstrapClientChartZoomEndEventArgs extends BootstrapUIWidgetEventArgsBase {
  /**
    * The value that became the end of the argument axis after zooming or scrolling ended.
    * Value: An object specifying the end of the argument axis.
    */
  var rangeEnd: js.Object
  /**
    * The value that became the start of the argument axis after zooming or scrolling ended.
    * Value: An object specifying the start of the argument axis.
    */
  var rangeStart: js.Object
}

object BootstrapClientChartZoomEndEventArgs {
  @scala.inline
  def apply(component: js.Object, element: js.Object, rangeEnd: js.Object, rangeStart: js.Object): BootstrapClientChartZoomEndEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("rangeEnd")(rangeEnd)
    __obj.updateDynamic("rangeStart")(rangeStart)
    __obj.asInstanceOf[BootstrapClientChartZoomEndEventArgs]
  }
}

