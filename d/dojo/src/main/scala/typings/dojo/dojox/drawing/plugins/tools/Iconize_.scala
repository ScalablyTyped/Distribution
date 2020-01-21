package typings.dojo.dojox.drawing.plugins.tools

import typings.dojo.dojox.drawing.plugins.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/plugins/tools/Iconize.html
  *
  * Somewhat of internal use...
  * Outputs a path to be used as an icon. Will end up being a
  * sub-icon under Export options
  *
  * @param options
  */
@JSGlobal("dojox.drawing.plugins.tools.Iconize")
@js.native
class Iconize_ protected () extends Plugin {
  def this(options: js.Any) = this()
  /**
    *
    */
  var setup: js.Object = js.native
  /**
    *
    * @param p
    */
  def makeIcon(p: js.Array[_]): Unit = js.native
  /**
    *
    */
  def onClick(): Unit = js.native
}

