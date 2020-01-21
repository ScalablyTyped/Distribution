package typings.dojo.dojox.drawing.stencil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/Path.html
  *
  * Creates a dojox.gfx Path based on points provided.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.stencil.Path")
@js.native
class Path protected () extends Base {
  def this(options: js.Any) = this()
  /**
    *
    */
  var StencilData: js.Object = js.native
  /**
    *
    */
  var StencilPoints: js.Array[_] = js.native
  /**
    *
    */
  var baseRender: Boolean = js.native
  /**
    *
    */
  var closeColor: js.Object = js.native
  /**
    *
    */
  var closePath: Boolean = js.native
  /**
    *
    */
  var closeRadius: Double = js.native
  /**
    * Checks if points are close enough to indicate that
    * path should be close. Provides a visual cue.
    * Not actually used in stencil.path - this is used for
    * drawable tools that extend it. Note that those tools
    * need to remove the shape created: this.closeGuide, or
    * add arg: remove
    *
    * @param firstPt
    * @param currPt
    * @param remove
    */
  def checkClosePoint(firstPt: js.Object, currPt: js.Object, remove: Boolean): Boolean = js.native
  /**
    * Called from anchor point mouse drag
    * also called from plugins.Pan.checkBounds
    *
    * @param anchor
    */
  def onTransform(anchor: js.Object): Unit = js.native
}

