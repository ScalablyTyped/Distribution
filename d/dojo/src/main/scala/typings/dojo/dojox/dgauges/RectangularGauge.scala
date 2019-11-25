package typings.dojo.dojox.dgauges

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/RectangularGauge.html
  *
  * The base class for rectangular gauges.
  * You can create custom horizontal or vertical gauges by extending this class.
  * See dojox/dgauges/components/default/HorinzontalLinearGauge.js for an example of rectangular gauge.
  *
  */
@JSGlobal("dojox.dgauges.RectangularGauge")
@js.native
class RectangularGauge () extends GaugeBase {
  /**
    * The orientation of the gauge. Default is "horizontal".
    *
    */
  var orientation: String = js.native
  def addElement(name: String, element: js.Object, location: String): Unit = js.native
  @JSName("get")
  def get_orientation(property: orientation): String = js.native
  @JSName("set")
  def set_orientation(property: orientation, value: String): Unit = js.native
  @JSName("watch")
  def watch_orientation(
    property: orientation,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

