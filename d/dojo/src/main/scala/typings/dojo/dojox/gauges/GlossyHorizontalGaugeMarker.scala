package typings.dojo.dojox.gauges

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/GlossyHorizontalGaugeMarker.html
  *
  * The marker for the dojox.gauges.GlossyHorizontalGauge.
  * This object defines the marker for the dojox.gauges.GlossyHorizontalGauge.
  * Since the needle is created by the gauges class, you do not have to use this class directly.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges.GlossyHorizontalGaugeMarker")
@js.native
class GlossyHorizontalGaugeMarker () extends BarLineIndicator {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

