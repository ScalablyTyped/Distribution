package typings.dojo.dojox.drawing.tools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/tools/Arrow.html
  *
  * Extends stencil.Line and adds an arrow head
  * to the end and or start.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.tools.Arrow")
@js.native
class Arrow_ protected () extends Line {
  def this(options: js.Any) = this()
  /**
    * Whether or not to place an arrow on end.
    *
    */
  var arrowEnd: Boolean = js.native
  /**
    * Whether or not to place an arrow on start.
    *
    */
  var arrowStart: Boolean = js.native
  /**
    * The custom position used for the label
    *
    */
  def labelPosition(): js.Object = js.native
}

