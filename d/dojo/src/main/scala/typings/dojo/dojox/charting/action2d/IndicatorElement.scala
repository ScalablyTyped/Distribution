package typings.dojo.dojox.charting.action2d

import typings.dojo.dojox.charting.plot2d.Indicator
import typings.dojo.dojox.gfx.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/_IndicatorElement.html
  *
  * Internal element used by indicator actions.
  *
  * @param chart
  * @param kwArgs
  */
@JSGlobal("dojox.charting.action2d._IndicatorElement")
@js.native
class IndicatorElement protected () extends Indicator {
  def this(chart: js.Any, kwArgs: js.Any) = this()
  /**
    * Clean any elements (HTML or GFX-based) out of our group, and create a new one.
    *
    * @param creator               OptionalAn optional surface to work with.
    */
  def cleanGroup(creator: Surface): js.Any = js.native
  /**
    *
    */
  def render(): Unit = js.native
  /**
    *
    */
  def stopTrack(): Unit = js.native
}

