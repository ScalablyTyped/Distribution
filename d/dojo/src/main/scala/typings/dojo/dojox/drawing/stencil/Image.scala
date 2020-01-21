package typings.dojo.dojox.drawing.stencil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/Image.html
  *
  * Creates an dojox.gfx Image based on the data
  * provided.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.stencil.Image")
@js.native
class Image protected () extends Base {
  def this(options: js.Any) = this()
  /**
    * The data used to create the dojox.gfx Shape
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
  var anchorType: String = js.native
  /**
    *
    */
  var baseRender: Boolean = js.native
  /**
    * Internal. If no image size is passed in with the data
    * create a dom node, insert and image, gets its dimensions
    * record them - then destroy everything.
    *
    * @param render
    */
  def getImageSize(render: js.Any): Unit = js.native
  def render(dbg: js.Any): Unit = js.native
}

