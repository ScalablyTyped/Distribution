package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/AutoScroll.html
  *
  * Provides horizontal and vertical auto-scroll for grid.
  *
  * @param grid
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.AutoScroll")
@js.native
class AutoScroll protected () extends Plugin {
  def this(grid: js.Any, args: js.Any) = this()
  /**
    * The time interval (in miliseconds) between 2 scrolling.
    *
    */
  var autoScrollInterval: Double = js.native
  /**
    * The width (in pixel) of the margin area where autoscroll can be triggered.
    *
    */
  var autoScrollMargin: Double = js.native
}

