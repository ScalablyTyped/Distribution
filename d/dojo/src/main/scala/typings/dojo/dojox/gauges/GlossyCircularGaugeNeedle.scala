package typings.dojo.dojox.gauges

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/GlossyCircularGaugeNeedle.html
  *
  * The needle for the dojox.gauges.GlossyCircularGauge and
  * dojox.gauges.GlossySemiCircularGauge.
  * This object defines the needle for the dojox.gauges.GlossyCircularGauge and
  * dojox.gauges.GlossySemiCircularGauge.
  * Since the needle is created by the gauges class, you do not have to use this class directly.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges.GlossyCircularGaugeNeedle")
@js.native
class GlossyCircularGaugeNeedle () extends AnalogIndicatorBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

