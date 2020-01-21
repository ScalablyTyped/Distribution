package typings.dojo.dojox.dgauges

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.value
import typings.dojo.dojox.widget.Invalidating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/IndicatorBase.html
  *
  * The base class for indicators. Basically, an indicator is used to render a value.
  *
  */
@JSGlobal("dojox.dgauges.IndicatorBase")
@js.native
class IndicatorBase () extends Invalidating {
  /**
    * The value of this indicator.
    *
    */
  var value: Double = js.native
  @JSName("get")
  def get_value(property: value): Double = js.native
  @JSName("set")
  def set_value(property: value, value: Double): Unit = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

