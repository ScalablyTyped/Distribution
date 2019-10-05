package typings.dojo.dojox.gauges

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/AnalogIndicatorBase.html
  *
  * An abstract base class for indicators that can be used in an AnalogGauge.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges.AnalogIndicatorBase")
@js.native
class AnalogIndicatorBase () extends _Indicator {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Override of dojox.gauges._Indicator.draw
    *
    * @param group The GFX group when the indicator must be drawn
    * @param dontAnimate               OptionalIndicates if the drawing should not be animated (vs. the default of doing an animation)
    */
  def draw(): Unit = js.native
  def draw(group: js.Object): Unit = js.native
  def draw(group: js.Object, dontAnimate: Boolean): Unit = js.native
}

