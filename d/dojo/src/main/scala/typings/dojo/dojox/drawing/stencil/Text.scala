package typings.dojo.dojox.drawing.stencil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/Text.html
  *
  * Creates a dojox.gfx Text (SVG or VML) based on data provided.
  * There are two text classes. TextBlock extends this one and
  * adds editable functionality, discovers text width etc.
  * This class displays text only. There is no line wrapping.
  * Multiple lines can be achieved by inserting \n linebreaks
  * in the text.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.stencil.Text")
@js.native
class Text protected () extends Base {
  def this(options: js.Any) = this()
  /**
    * The data used to create the dojox.gfx Text
    *
    */
  var StencilData: js.Object = js.native
  /**
    *
    */
  var StencilPoints: js.Array[_] = js.native
  /**
    * Text horizontal alignment.
    * Options: start, middle, end
    *
    */
  var align: String = js.native
  /**
    *
    */
  var anchorType: String = js.native
  /**
    *
    */
  var baseRender: Boolean = js.native
  /**
    * Text vertical alignment
    * Options: top, middle, bottom (FIXME: bottom not supported)
    *
    */
  var valign: String = js.native
  /**
    * Getter for text.
    *
    */
  def getText(): js.Any = js.native
  /**
    *
    * @param text
    * @param w
    */
  def makeFit(text: js.Any, w: js.Any): js.Object = js.native
  def render(text: String): Unit = js.native
  /**
    * Setter for text.
    *
    * @param text
    */
  def setText(text: js.Any): Unit = js.native
  /**
    * Register raw text, returning typeset form.
    * Uses function dojox.drawing.stencil.Text.typeset
    * for typesetting, if it exists.
    *
    * @param text
    */
  def typesetter(text: js.Any): js.Any = js.native
}

