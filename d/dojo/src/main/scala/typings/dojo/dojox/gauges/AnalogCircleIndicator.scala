package typings.dojo.dojox.gauges

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/AnalogCircleIndicator.html
  *
  * An indicator for the AnalogGauge that draws a circle. The center of the circle is positioned
  * on the circular gauge according to the value of the indicator. The circle has for radius the
  * length of the indicator. This indicator is mainly used to draw round ticks for the scale.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges.AnalogCircleIndicator")
@js.native
class AnalogCircleIndicator () extends AnalogIndicatorBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

